package com.persistenceContext.persistenceContextexam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(
        name = "BOARD_SEQ_GENERATOR",
        sequenceName = "BOARD_SEQ", // 매핑할 DB시퀀스 이름
        initialValue = 1, allocationSize = 1
)
public class Board {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,
    generator = "BOARD_SEQ_GENERATOR")
    private Long id;
}
