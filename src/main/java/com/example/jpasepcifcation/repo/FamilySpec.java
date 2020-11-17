package com.example.jpasepcifcation.repo;

import com.example.jpasepcifcation.entity.Family;
import com.example.jpasepcifcation.entity.User;
import org.springframework.data.jpa.domain.Specification;

public class FamilySpec {

    public static Specification<Family> filterByBillcontId(Integer id){
        return (root,query,criteriaBuilder) -> criteriaBuilder.equal(root.join("billCont").get("id"),id);
    }

}
