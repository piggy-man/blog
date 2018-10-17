package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class User {
    @Id // 主键
    @GeneratedValue(strategy= GenerationType.IDENTITY) // 自增策略
    private Long id; // 实体一个唯一标识
    private String name;
    private String email;

    public User() { // 无参构造函数;设为 protected 防止直接使用
    }

    @Override
    public String toString() {
        return String.format("User[id=%d,name='%s',email='%s']", id, name, email);
    }


}
