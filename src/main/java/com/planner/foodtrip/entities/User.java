package com.planner.foodtrip.entities;

import com.planner.foodtrip.constant.Role;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static lombok.AccessLevel.PROTECTED;


@Getter
@Entity
@Table(name = "users")
@NoArgsConstructor(access = PROTECTED)
class User extends TimeEntity {
    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role = Role.ROLE_USER;
}
