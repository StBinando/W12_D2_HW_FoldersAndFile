package com.codeclan.example.W12_D2_FilesAndFolders.controllers;

import com.codeclan.example.W12_D2_FilesAndFolders.models.File;
import com.codeclan.example.W12_D2_FilesAndFolders.models.Folder;
import com.codeclan.example.W12_D2_FilesAndFolders.models.User;
import com.codeclan.example.W12_D2_FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<Optional<User>> getUser(@PathVariable Long id) {
        return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}/folders")
    public ResponseEntity<List<Folder>> getFoldersByUserId(@PathVariable Long id) {
        return new ResponseEntity<>(userRepository.getById(id).getFolders(), HttpStatus.OK);
    }

//    @GetMapping(value = "/users/{id}/folders/{id}/files")
//    public ResponseEntity<List<File>> getFilesByFoldersIdAndByUserId(@PathVariable Long id, @PathVariable Long id2) {
//        int folder_id = (int)id2;
//        return new ResponseEntity<>(userRepository.getById(id).getFolders().get((int)id2).getFiles(), HttpStatus.OK);
//    }
//    ********************************************************
//    HOW TO CONVERT LONG INTO INT?!

    @PostMapping(value = "/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
