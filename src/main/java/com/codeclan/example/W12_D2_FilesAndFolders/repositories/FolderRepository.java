package com.codeclan.example.W12_D2_FilesAndFolders.repositories;

import com.codeclan.example.W12_D2_FilesAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}