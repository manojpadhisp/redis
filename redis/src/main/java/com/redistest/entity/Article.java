package com.redistest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="articles")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="article_id")
    private long articleId;
    @Column(name="title")
    private String title;
    @Column(name="category")
    private String category;
}
