package me.loda.springboot.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private final String name;
}
