package com.example.jpasepcifcation.repo;

import com.example.jpasepcifcation.entity.Company;
import org.springframework.data.jpa.domain.Specification;

public class CompanySpecific {

    public static Specification<Company> filterByCompId(Integer id){
        return (root,query,criteriaBuilder) -> criteriaBuilder.equal(root.get("id"),id);
    }



}
