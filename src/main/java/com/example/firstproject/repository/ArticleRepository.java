package com.example.firstproject.repository;

import com.example.firstproject.entitiy.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article,Long> {
    //< 엔티티 , 기본키의 데이터타입 >
    // CrudRepository 클래스 기본 제공
}