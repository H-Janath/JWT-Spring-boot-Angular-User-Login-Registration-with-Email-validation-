package com.alibou.book.user;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Token {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String token;
    private LocalDateTime createAt;
    private LocalDateTime expireAt;
    private LocalDateTime validatedAt;

    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private User user;
}
