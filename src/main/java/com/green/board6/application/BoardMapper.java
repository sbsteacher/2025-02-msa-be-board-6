package com.green.board6.application;

import com.green.board6.application.model.BoardGetOneRes;
import com.green.board6.application.model.BoardGetRes;
import com.green.board6.application.model.BoardPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int save(BoardPostReq pdskldkdkdk);
    List<BoardGetRes> findAll(String searchText);
    BoardGetOneRes findById(int id);
}
