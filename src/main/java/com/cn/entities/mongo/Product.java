package com.cn.entities.mongo;

import com.cn.annotation.GeneratedId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedId
    private Long id;
    private String name;
    private String title;
    private Double price;
}
