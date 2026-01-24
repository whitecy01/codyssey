package com.persistenceContext.persistenceContextexam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
@TableGenerator(
        name = "BOARD_SEQ_GENERATOR",
        table = "MY_SEQUENCES",
        pkColumnValue = "BOARD_SEQ", allocationSize = 1
)
public class item {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE,
            generator = "BOARD_SEQ_GENERATOR")
    private Long id;
}

