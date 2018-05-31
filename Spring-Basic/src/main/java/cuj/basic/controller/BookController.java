package cuj.basic.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import cuj.basic.domain.book.Book;
import cuj.basic.service.book.BooksManagerService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cujamin on 2017/8/29.
 */


@RestController
@RequestMapping(value = "/book")
public class BookController {
    private static final Log log = LogFactory.getLog(BookController.class.getName());

    @Autowired
    BooksManagerService booksManagerService;

    //    https://127.0.0.1:8082/book/getbook?bookname=#{bookname}&&price=#{price}

    @ApiOperation(value="获取图书", notes="根据书名获取图书")
    @RequestMapping(value = "/getbook",method = RequestMethod.GET)
    @HystrixCommand
    public String getBook(
            @RequestParam(value = "bookname",defaultValue = "bookname")String bookname,
            @RequestParam(value = "count",defaultValue = "count")String count)
    {
        List<Book> bookList = booksManagerService.getBook(bookname,1);
        if(null!=bookList)
        {
            log.info("get book: "+bookname+" ; info : "+bookList.toString());
            return "get book.!!!!..: "+bookname+" ; info : "+bookList.toString();
        }
        else {
            log.info("do not contain the book "+bookname);
            return "do not contain the book "+bookname;
        }
    }

    @ApiOperation(value="添加新书", notes="根据书名对象创建图书")
    @ApiImplicitParam(name = "book", value = "图书详细实体book", required = true, dataType = "Book")
    @RequestMapping(value = "/addnewbook",method = RequestMethod.POST)
    @HystrixCommand
    public String addBook(@RequestBody Book book)
    {
        log.info("add book: "+book.getName()+" ; price : "+book.getPrice());
        List<Book> bookList = new LinkedList<Book>();
        bookList.add(book);
        boolean result = booksManagerService.addBook(bookList);
        if(result)
        {
            return "add book "+ book.getName() +" success ";
        }
        else
        {
            return "add book "+ book.getName() +" failed ";
        }
    }

    @ApiOperation(value="添加多本新书", notes="根据书名对象创建图书")
    @ApiImplicitParam(name = "book", value = "图书详细实体book", required = true, dataType = "List<Book>")
    @RequestMapping(value = "/addnewbooks",method = RequestMethod.POST)
    @HystrixCommand
    public String addBookList(@RequestBody List<Book> bookList)
    {
        if(bookList!=null&&!bookList.isEmpty())
        {
            String bookName = bookList.get(0).getName();
            log.info("add books ; info : "+bookList.toString());
            boolean result = booksManagerService.addBook(bookList);
            if(result)
            {
                return "add books success ";
            }
            else
            {
                return "add books failed ";
            }
        }
        else
        {
            return "the book list is empty";
        }
    }
}
