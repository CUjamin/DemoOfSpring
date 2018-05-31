package cuj.basic.service.book;

import cuj.basic.domain.book.Book;

import java.util.List;
import java.util.Map;

/**
 * Created by cujamin on 2018/5/17.
 */
public interface BooksManagerService {
    List<Book> getBook(String bookName, int count);
    boolean addBook(List<Book> bookList);
    Map<String,List<Book>> getAllBooks();
}
