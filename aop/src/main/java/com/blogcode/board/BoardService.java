package com.blogcode.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jojoldu@gmail.com on 2016-11-30.
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
@Service
public class BoardService {

    @Autowired
    private BoardRepository repository;

    public List<Board> getBoards() {
        long start = System.currentTimeMillis();
        List<Board> boards = repository.findAll();
        long end = System.currentTimeMillis();

        System.out.println("수행 시간 : "+ (end - start));

        return boards;
    }

    public Board getBoardByIdx(long idx){
        long start = System.currentTimeMillis();
        Board board = repository.findOne(idx);
        long end = System.currentTimeMillis();

        System.out.println("수행 시간 : "+ (end - start));

        return board;
    }
}