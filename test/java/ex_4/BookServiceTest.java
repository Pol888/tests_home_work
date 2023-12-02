package ex_4;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {

    @ParameterizedTest
    @ValueSource(strings = {"1", "2"})
    void findBookByIdGettingACertainBook(String n){
        ArrayList<Book> books = new ArrayList<>();
        Book book_1 = mock(Book.class);
        Book book_2 = mock(Book.class);
        books.add(book_1);
        books.add(book_2);
        InMemoryBookRepository inMemoryBookRepository = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(inMemoryBookRepository);
        when(inMemoryBookRepository.findById("1")).thenReturn(book_1);
        when(inMemoryBookRepository.findById("2")).thenReturn(book_2);

        Book res = bookService.findBookById(n);

        assertEquals(res, books.get(Integer.parseInt(n) - 1));
    }

    @Test
    void findAllBooksInAllBooks(){
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        InMemoryBookRepository inMemoryBookRepository = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(inMemoryBookRepository);
        when(inMemoryBookRepository.findAll()).thenReturn(Arrays.asList(book1, book2));

        List<Book> res = bookService.findAllBooks();

        assertEquals(res, Arrays.asList(book1, book2));


    }

}
