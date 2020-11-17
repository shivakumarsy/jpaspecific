package com.example.jpasepcifcation.service;

import com.example.jpasepcifcation.entity.User;
import com.example.jpasepcifcation.repo.UserRepo;
import com.example.jpasepcifcation.repo.UserSpecific;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getByComp(Integer compId){
        Specification<User> companySpecification = UserSpecific.filterByCompId(compId);

        List<User> all = userRepo.findAll(companySpecification);
        return all;
    }

}
