package com.example.jpasepcifcation.repo;

import com.example.jpasepcifcation.entity.Company;
import com.example.jpasepcifcation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepo extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
}
