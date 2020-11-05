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
    private String writer;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public CommentEntity toEntity(){
        CommentEntity commentEntity = CommentEntity.builder()
                .id(id)
                .writer(writer)
                .content(content)
                .boardEntity(boardEntity)
                .build();
        return commentEntity;
    }

    @Builder
<<<<<<< HEAD

    public CommentDto(BoardEntity boardEntity, String content, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.boardEntity = boardEntity;

    public CommentDto(BoardEntity board, String content, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.board = board;
        //this.id = id;

=======
    public CommentDto(Long id, String content, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
>>>>>>> parent of 0cd69e2... 댓글 1105
        this.writer = writer;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}