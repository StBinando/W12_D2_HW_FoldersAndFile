package com.codeclan.example.W12_D2_FilesAndFolders.repositories;

import com.codeclan.example.W12_D2_FilesAndFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}