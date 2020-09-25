package com.buzhovych;

import com.buzhovych.controller.NotebookController;
import com.buzhovych.models.Role;
import com.buzhovych.models.User;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class Main implements ApplicationRunner {
    private final NotebookController notebookController;

    public Main(NotebookController notebookController) {
        this.notebookController = notebookController;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

//        User user = new User();
//        user.setRoles(new HashSet<Role>(Collections.singleton(Role.ROLE_USER)));
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        notebookController.fillTable();
    }
}
