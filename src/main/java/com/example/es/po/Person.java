package com.example.es.po;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author: Fang Jinxu
 * @Description:
 * @Date: 2024-02-22 10:21
 */
@Document(indexName = "persons")
@Data
public class Person {

    @Id
    private Integer id;

    private String name;

    private String gender;

    private String age;

}