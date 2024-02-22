import com.example.es.Application;
import com.example.es.po.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

/**
 * @Author: Fang Jinxu
 * @Description:
 * @Date: 2024-02-22 18:00
 */
@SpringBootTest(classes = Application.class)
@Slf4j
public class ESDocumentTest {

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    @Test
    void testAddDocument() {
        Person person = new Person(1, "jxfang", "male", 23);
        Person saved = elasticsearchOperations.save(person);
        log.info("Person id: {}", saved.getId());
    }
}