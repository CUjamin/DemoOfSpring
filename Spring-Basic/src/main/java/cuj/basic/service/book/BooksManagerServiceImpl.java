package cuj.basic.service.book;

import cuj.basic.common.book.AddBookResult;
import cuj.basic.domain.book.Book;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by cujamin on 2018/5/17.
 */

@Service
@Log4j
public class BooksManagerServiceImpl implements BooksManagerService {

    private Map<String,List<Book>> bookMap = new HashMap<String, List<Book>>();

    @Override
    public List<Book> getBook(String bookName, int count) {

            List<Book> remainList = bookMap.get(bookName);
            List<Book> resultList = new LinkedList<Book>();
            for(int i=0;i<count;++i)
            {
                //// TODO: 2018/5/17  越界
                resultList.add(remainList.remove(0));
            }
            bookMap.put(bookName,remainList);
            return resultList;
    }

    @Override
    public boolean addBook(List<Book> bookList) {
        boolean result = AddBookResult.failed;

        if(null!=bookList&&!bookList.isEmpty())
        {
            String bookName = bookList.get(0).getName();
            if(bookMap.containsKey(bookName))
            {
                List<Book> remainList = bookMap.get(bookName);
                remainList.addAll(bookList);
                bookMap.put(bookName,bookList);
            }
            else
            {
                bookMap.put(bookName,bookList);
            }
            result = AddBookResult.success;
        }

        return result;
    }

    @Override
    public Map<String,List<Book>> getAllBooks()
    {
        return bookMap;
    }
}
