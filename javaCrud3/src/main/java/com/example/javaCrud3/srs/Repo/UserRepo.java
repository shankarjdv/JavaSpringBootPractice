package com.example.javaCrud3.srs.Repo;

import com.example.javaCrud3.srs.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}


