package com.green.board6.application;

import com.green.board6.application.model.BoardGetRes;
import com.green.board6.application.model.BoardPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/board")
public class BoardController {

    //BoardService 빈 주소값을 DI 받아주세요.
    private final BoardService boardService;

    // "/board" post 방식으로 JSON은 BoardPostReq로 받을 수 있도록 메소드를 만들어 주세요. 리턴타입은 int
    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p) {
        log.info("p: {}", p);
        return boardService.save(p);
    }

    //얘의 리턴 타입은 BoardGetRes객체를 여러개 리턴할 수 있어야 한다.
    @GetMapping
    public List<BoardGetRes> getBoardList(@RequestParam(name="search_text", required=false) String searchText) {
        log.info("searchText: {}, {}", searchText, searchText);
        return boardService.findAll(searchText);
    }

}
