package com.larva.seedServer.service;

import com.larva.seedServer.domain.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public User signInWithGoogle() {
        // Google 로그인 로직 구현
        // 성공 시 User 객체를 반환
        // 실패 시 null 반환
        return new User("John Doe");
    }
}