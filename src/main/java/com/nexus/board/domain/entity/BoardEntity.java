package com.nexus.board.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "board")
public class BoardEntity extends TimeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;


<<<<<<< HEAD
<<<<<<< HEAD
    //@OneToMany(mappedBy = "BoardEntity")
    //private List<CommentEntity> commentEntities = new ArrayList<commentEntities>();
=======
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<CommentEntity> commentEntities = new ArrayList<CommentEntity>();
>>>>>>> 0cd69e233dd70a86af8bbf028a53d69a08afe44b
=======
    //@OneToMany(mappedBy = "BoardEntity")

    //private List<CommentEntity> commentEntity = new ArrayList<commentEntity>();
>>>>>>> parent of 0cd69e2... 댓글 1105

    @Builder
    public BoardEntity(Long id, String title, String content, String writer) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
    }

    public void updates(String title, String content){
        this.title = title;
        this.content = content;
    }
}