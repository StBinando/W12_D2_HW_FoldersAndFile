package com.codeclan.example.W12_D2_FilesAndFolders.controllers;

import com.codeclan.example.W12_D2_FilesAndFolders.models.File;
import com.codeclan.example.W12_D2_FilesAndFolders.models.Folder;
import com.codeclan.example.W12_D2_FilesAndFolders.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFoldersrs() {
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity<Optional<Folder>> getFolder(@PathVariable Long id) {
        return new ResponseEntity<>(folderRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}/files")
    public ResponseEntity<List<File>> getFilesByFolderId(@PathVariable Long id) {
        return new ResponseEntity<>(folderRepository.getById(id).getFiles(), HttpStatus.OK);
    }


    @PostMapping(value = "/folders")
    public ResponseEntity<Folder> createUser(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }

}
