package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entitiy.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.firstproject.repository.ArticleRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // 로깅을 위한 어노테이션 // Simple logging facade for java
public class FirstController {

    @GetMapping("/hi") // (접속할 URL) 연결 요청
    public String niceToMeetYou(Model model){
        model.addAttribute("username","은식");
        return "greetings"; //templates/greetings.mustache 파일을 찾아서 브라우저로 반환
    }
    @GetMapping("/bye") // (접속할 URL) 연결 요청
    public String goodbye(Model model){
        model.addAttribute("username","홍길동");
        return "goodbye"; //templates/greetings.mustache 파일을 찾아서 브라우저로 반환
    }

    @Autowired // 스프링부트가 미리 생성해 놓은 객체를 가져다가 자동으로 연결
    private ArticleRepository articleRepository;
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        // 받아온 dto를 콘솔에 출력
        //System.out.println(form.toString()); // 로깅으로 대체
        log.info(form.toString()); // 로깅

        // 1. Dto를 Entity로 변환
        Article article = form.toEntity();
        //System.out.println(article.toString());
        log.info(article.toString());

        // 2. Repository에게 Entity를 DB안에 저장하게 한다
        Article saved = articleRepository.save(article);
        //System.out.println(saved.toString());
        log.info(saved.toString());

        return "";
    }
}
