import co.elastic.clients.elasticsearch.ElasticsearchClient;
import com.example.es.Application;
import com.example.es.po.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.IndexOperations;

/**
 * @Author: Fang Jinxu
 * @Description:
 * @Date: 2024-02-22 09:53
 */
@SpringBootTest(classes = Application.class)
public class ESIndexTest {

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    @Autowired
    private ElasticsearchClient elasticsearchClient;

    @Test
    void testCreateIndex() {
        IndexOperations indexOperations = elasticsearchOperations.indexOps(Person.class);
        // 设置索引基本信息

        // 创建Mapping
//        Document mapping = indexOperations.createMapping(Person.class);
        indexOperations.create();
    }

    @Test
    void testDeleteIndex() {
        IndexOperations indexOperations = elasticsearchOperations.indexOps(Person.class);
        indexOperations.delete();
    }

    @Test
    void testSearchIndex(){
        IndexOperations indexOperations = elasticsearchOperations.indexOps(Person.class);
        indexOperations.getInformation()
    }


}