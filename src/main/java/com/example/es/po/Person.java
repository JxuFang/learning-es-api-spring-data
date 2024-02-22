package com.example.es.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author: Fang Jinxu
 * @Description:
 * @Date: 2024-02-22 10:21
 */
@Document(indexName = "persons")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    private Integer id;

    private String name;

    private String gender;

    private Integer age;

}