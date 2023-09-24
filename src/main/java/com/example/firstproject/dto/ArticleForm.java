package com.example.firstproject.dto;

import com.example.firstproject.entitiy.Article;

public class ArticleForm {
    // 멤버변수 추가
    // html input 의 name값과 DTO객체의 필드명이 동일할 경우 자동으로 mapping된다
    private String title;
    private String contents;

    // 생성자 함수 추가
    public ArticleForm(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    //toString 메서드 추가??
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }

    public Article toEntity(){
        return new Article(null,title,contents);
    }
}
