package com.example.demo.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "posts")
@ToString
@EqualsAndHashCode
public class Post {
    @Getter @Column(name = "id") @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Getter @Setter @Column(name = "title")
    private String title;
    @Getter @Setter @Column(name = "content")
    private String content;
    @Getter @ManyToOne @JoinColumn(name = "author_id")
    private User author_id;
}
