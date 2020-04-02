package com.dazhi.authdemo.modules.auth.dao;

import com.dazhi.authdemo.modules.auth.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author CrazyJay
 * @Date 2019/3/30 22:05
 * @Version 1.0
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);

    UserEntity findByToken(String token);
}
