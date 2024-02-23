package repository;

import com.example.es.Application;
import com.example.es.po.Book;
import com.example.es.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

/**
 * @Author: Fang Jinxu
 * @Description:
 * @Date: 2024-02-23 14:45
 */
@SpringBootTest(classes = Application.class)
@Slf4j
public class ElasticsearchRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void testSave() {
        Book book = new Book();
        book.setId("001");
        book.setName("on java 8");
        book.setPrice(123);
        book.setSummary("java book");
        Book save = bookRepository.save(book);
        log.info("saved book: {}", book);
    }

    @Test
    void testQuery() {
        Optional<Book> book = bookRepository.findById("001");
        log.info("book: {}", book.isPresent() ? book.get() : null);
    }
}