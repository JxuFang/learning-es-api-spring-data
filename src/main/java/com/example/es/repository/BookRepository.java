package com.example.es.repository;

import com.example.es.po.Book;
import org.springframework.data.elasticsearch.annotations.Highlight;
import org.springframework.data.elasticsearch.annotations.HighlightField;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: Fang Jinxu
 * @Description:
 * @Date: 2024-02-23 14:32
 */
public interface BookRepository extends ElasticsearchRepository<Book, String> {

    @Highlight(fields = {
            @HighlightField(name = "name"),
            @HighlightField(name = "summary")
    })
    SearchHits<Book> findByNameOrSummary(String text, String summary);
}
