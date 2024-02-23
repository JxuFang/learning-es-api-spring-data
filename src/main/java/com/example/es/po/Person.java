package com.example.es.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

/**
 * @Author: Fang Jinxu
 * @Description:
 * @Date: 2024-02-22 10:21
 */
@Document(indexName = "persons")
@Setting(
        indexStoreType = "fs"
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    private Integer id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Text)
    private String gender;

    @Field(type = FieldType.Integer)
    private Integer age;

}