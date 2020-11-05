package com.nexus.board.dto;

import com.nexus.board.domain.entity.BoardEntity;
import com.nexus.board.domain.entity.CommentEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CommentDto {
    private Long id;
    private BoardEntity board;
    private String writer;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public CommentEntity toEntity(){
        CommentEntity commentEntity = CommentEntity.builder()
                //.id(id)
                .board(board)
                .writer(writer)
                .content(content)
                .boardEntity(boardEntity)
                .build();
        return commentEntity;
    }

    @Builder

    public CommentDto(BoardEntity boardEntity, String content, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.boardEntity = boardEntity;

    public CommentDto(BoardEntity board, String content, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.board = board;
        //this.id = id;

        this.writer = writer;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}