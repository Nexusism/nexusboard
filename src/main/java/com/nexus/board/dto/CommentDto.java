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

    public CommentEntity toEntityc(){
        CommentEntity commentEntity = CommentEntity.builder()
                .id(id)
                .writer(writer)
                .content(content)
                .build();
        return commentEntity;
    }

    @Builder
    public CommentDto(Long id, String content, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.writer = writer;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}