package com.nexus.board.controller;

import com.nexus.board.domain.repository.BoardRepository;
import com.nexus.board.domain.repository.CommentRepository;
import com.nexus.board.dto.BoardDto;
import com.nexus.board.dto.CommentDto;
import com.nexus.board.service.CommentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@Controller
public class CommentController {

    private CommentService commentService;
    //@GetMapping


    //@PutMapping


    @PostMapping("/comment")
    public String write(CommentDto commentDto) {
        System.out.println(commentDto);
        commentService.saveComment(commentDto);

        return "redirect:/";
    }

}
