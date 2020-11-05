package com.nexus.board.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "comment")
public class CommentEntity extends TimeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id_fk")
    private BoardEntity board;

    @Builder
<<<<<<< HEAD
    public CommentEntity(BoardEntity boardEntity, String content, String writer) {
        this.boardEntity = boardEntity;
=======
    public CommentEntity(BoardEntity board, String content, String writer) {
        this.board = board;
        //this.id = id;
>>>>>>> 0cd69e233dd70a86af8bbf028a53d69a08afe44b
        this.writer = writer;
        this.content = content;
    }
}