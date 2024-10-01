package com.example.demo._domain.blog.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 반드시 기본 생성자가 있어야 된다.
@Entity(name = "tb_article")
@NoArgsConstructor
@Data
public class Article {

    // 특정 생성자에만 빌더 패턴을 추가할 수 있다.
    @Builder
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "content", nullable = false)
    private String content;


}
