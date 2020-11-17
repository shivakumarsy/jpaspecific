package com.example.jpasepcifcation.repo;

import com.example.jpasepcifcation.entity.Company;
import com.example.jpasepcifcation.entity.User;
import org.springframework.data.jpa.domain.Specification;

public class UserSpecific {


    public static Specification<User> filterByCompId(Integer id){
        return (root,query,criteriaBuilder) -> criteriaBuilder.equal(root.join("company").get("id"),id);
    }

}
