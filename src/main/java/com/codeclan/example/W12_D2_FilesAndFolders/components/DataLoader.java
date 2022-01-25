package com.codeclan.example.W12_D2_FilesAndFolders.components;

import com.codeclan.example.W12_D2_FilesAndFolders.models.File;
import com.codeclan.example.W12_D2_FilesAndFolders.models.Folder;
import com.codeclan.example.W12_D2_FilesAndFolders.models.User;
import com.codeclan.example.W12_D2_FilesAndFolders.repositories.FileRepository;
import com.codeclan.example.W12_D2_FilesAndFolders.repositories.FolderRepository;
import com.codeclan.example.W12_D2_FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("User1");
        userRepository.save(user1);
        User user2 = new User("User2");
        userRepository.save(user2);
//        User user3 = new User("User3");
//        userRepository.save(user3);
//        User user4 = new User("User4");
//        userRepository.save(user4);
//        User user5 = new User("User5");
//        userRepository.save(user5);
//        User user6 = new User("User6");
//        userRepository.save(user6);

        Folder folder1 = new Folder("Folder1", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Folder2", user1);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("Folder3", user2);
        folderRepository.save(folder3);
        Folder folder4 = new Folder("Folder4", user2);
        folderRepository.save(folder4);
        Folder folder5 = new Folder("Folder5", user2);
        folderRepository.save(folder5);
//        Folder folder6 = new Folder("Folder6", user1);
//        folderRepository.save(folder6);
//        Folder folder7 = new Folder("Folder7", user1);
//        folderRepository.save(folder7);

        File file1 = new File("File1","txt",124,folder1);
        fileRepository.save(file1);
        File file2 = new File("File2","txt",124,folder1);
        fileRepository.save(file2);
        File file3 = new File("File3","txt",124,folder1);
        fileRepository.save(file3);
        File file4 = new File("File4","txt",124,folder2);
        fileRepository.save(file4);
        File file5 = new File("File5","txt",124,folder3);
        fileRepository.save(file5);
        File file6 = new File("File6","txt",124,folder3);
        fileRepository.save(file6);
        File file7 = new File("File7","txt",124,folder4);
        fileRepository.save(file7);
        File file8 = new File("File8","txt",124,folder5);
        fileRepository.save(file8);
        File file9 = new File("File9","txt",124,folder5);
        fileRepository.save(file9);
    }
}