package com.green.board6.application;

import com.green.board6.application.model.BoardGetOneRes;
import com.green.board6.application.model.BoardGetRes;
import com.green.board6.application.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

//    @AllArgsConstructor 이 애노테이션은 모든 멤버필드를 DI받는 생성자를 만든다.
//    public BoardService(BoardController boardController, BoardMapper boardMapper) {
//        this.boardController = boardController;
//        this.boardMapper = boardMapper;
//    }

//    @RequiredArgsConstructor 이 애노테이션은 final인 멤버필드를 DI받는 생성자를 만든다.
//    public BoardService(BoardMapper boardMapper) {
//        this.boardMapper = boardMapper;
//    }

    public int save(BoardPostReq req) {
        return boardMapper.save(req);
    }

    public List<BoardGetRes> findAll(String searchText){
        return boardMapper.findAll(searchText);
    }

    public BoardGetOneRes findById(int id) {
        return boardMapper.findById(id);
    }
}
