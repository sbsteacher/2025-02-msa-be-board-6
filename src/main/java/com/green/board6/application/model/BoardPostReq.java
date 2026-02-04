package com.green.board6.application.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//request
//response
public class BoardPostReq {
    //글 등록 때 필요한 데이터 board테이블 보고 작성하시면 된다.
    private String title;
    private String contents;

}
