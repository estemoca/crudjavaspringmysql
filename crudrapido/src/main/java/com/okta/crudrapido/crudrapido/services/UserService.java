package com.okta.crudrapido.crudrapido.services;

import com.okta.crudrapido.crudrapido.models.userModel;
import com.okta.crudrapido.crudrapido.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    @Autowired
    IUserRepository IUserRepository;


//create or update
    public void saveOrUpdate(userModel userModel){
        IUserRepository.save(userModel);
    }
    //    read
    public List<userModel> getusersModel(){
        return IUserRepository.findAll();
    }

    public Optional<userModel> getuserModel(Long id){
        return IUserRepository.findById(id);
    }
// Delete info
    public void deleteuserModel(Long id){
        IUserRepository.deleteById(id);
    }
}
