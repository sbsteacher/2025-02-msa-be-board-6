package com.green.board6.application.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardGetRes {
    //id, title, created_at 1 row의 값을 담을 수 있는 객체를 만들 수 있는 클래스를 만들어 주시오.
    private int id;
    private String title;
    private String createdAt;
}
