package com.okta.crudrapido.crudrapido.repositories;

import com.okta.crudrapido.crudrapido.models.userModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<userModel,Long>{


}
