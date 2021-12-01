package se.iths.flightplanning.controller;

import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.iths.flightplanning.entity.UserEntity;
import se.iths.flightplanning.service.UserService;


@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) { this.userService = userService;}

    @PostMapping()
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user) {
        UserEntity createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<Iterable<UserEntity>> findAllUsers() {
        Iterable<UserEntity> allUsers = userService.findAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

}
