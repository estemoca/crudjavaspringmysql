package com.okta.crudrapido.crudrapido.controllers;

import com.okta.crudrapido.crudrapido.models.userModel;
import com.okta.crudrapido.crudrapido.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/users")

public class UserController {
    @Autowired

    private UserService userService;

    @GetMapping
    public List<userModel> getAll(){
        return userService.getusersModel();
    }

    @GetMapping("/{userModelId}")
    public Optional<userModel> getById(@PathVariable("userModelId") long userModelId){
        return userService.getuserModel(userModelId);
    }

    @PostMapping
    public void saveupdate(@RequestBody userModel userModel){
        userService.saveOrUpdate(userModel);
    }

    @DeleteMapping("/{usermodelId}")
    public void delete(@PathVariable("usermodelId") Long usermodelId){
        userService.deleteuserModel(usermodelId);
    }
}
