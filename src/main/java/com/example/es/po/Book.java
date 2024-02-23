package com.example.es.po;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

/**
 * @Author: Fang Jinxu
 * @Description:
 * @Date: 2024-02-23 14:28
 */
@Document(indexName="books")
@Data
public class Book {
    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Text)
    private String summary;

    @Field(type = FieldType.Integer)
    private Integer price;

}