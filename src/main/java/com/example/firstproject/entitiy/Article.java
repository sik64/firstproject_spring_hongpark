package com.example.firstproject.entitiy;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 해당 객체를 인식 가능
//@AllArgsConstructor
//@ToString
public class Article {
    @Id //기본키 지정
    @GeneratedValue // AUTO Generated constraint
    private Long id;
    @Column // DB에서 이해할 수 있도록 어노테이션 추가
    private String title;
    @Column
    private String contents;

    public Article(Long id, String title, String contents) {
        this.id = id;
        this.title = title;
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
