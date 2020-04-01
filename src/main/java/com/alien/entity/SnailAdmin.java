package com.alien.entity;

import com.alien.common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by alien on 2020/3/19 0019 13:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SnailAdmin extends BaseEntity<SnailAdmin> {

    private String username;

    private String password;

    private String roleId;

    private String avatar;

    private String password1;
}

