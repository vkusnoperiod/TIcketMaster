package com.example.AuthenticationService.repository;

import com.example.AuthenticationService.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
