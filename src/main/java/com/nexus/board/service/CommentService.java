package com.nexus.board.service;

import com.nexus.board.domain.entity.BoardEntity;
import com.nexus.board.domain.entity.CommentEntity;
import com.nexus.board.domain.repository.BoardRepository;
import com.nexus.board.domain.repository.CommentRepository;
import com.nexus.board.dto.BoardDto;
import com.nexus.board.dto.CommentDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CommentService {
    private CommentRepository commentRepository;

    @Transactional
    public List<CommentDto> getCommentlist() {
        List<CommentEntity> commentEntities = commentRepository.findAll();
        List<CommentDto> commentDtoList = new ArrayList<>();

        for ( CommentEntity commentEntity : commentEntities) {
            CommentDto commentDto = CommentDto.builder()
<<<<<<< HEAD
<<<<<<< HEAD
                    .boardEntity(boardEntity.getId())
=======
                    .board(commentEntity.getBoard())
>>>>>>> 0cd69e233dd70a86af8bbf028a53d69a08afe44b
=======
                    .id(commentEntity.getId())
>>>>>>> parent of 0cd69e2... 댓글 1105
                    .content(commentEntity.getContent())
                    .writer(commentEntity.getWriter())
                    .createdDate(commentEntity.getCreatedDate())
                    .build();

            commentDtoList.add(commentDto);
        }

        return commentDtoList;
    }

    @Transactional
    public CommentDto getComment(Long id) {
        Optional<CommentEntity> commentEntityWrapper = commentRepository.findById(id);
        CommentEntity commentEntity = commentEntityWrapper.get();

        CommentDto commentDto = CommentDto.builder()
                .id(commentEntity.getId())
                .content(commentEntity.getContent())
                .writer(commentEntity.getWriter())
                .createdDate(commentEntity.getCreatedDate())
                .build();

        return commentDto;
    }

    @Transactional
    public Long saveComment(CommentDto commentDto) {
        return commentRepository.save(commentDto.toEntity()).getId();
    }

    @Transactional
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}