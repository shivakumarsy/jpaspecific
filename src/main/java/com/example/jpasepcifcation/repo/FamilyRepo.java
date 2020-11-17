package com.example.jpasepcifcation.repo;

import com.example.jpasepcifcation.entity.Family;
import com.example.jpasepcifcation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FamilyRepo extends JpaRepository<Family,Integer>, JpaSpecificationExecutor<Family> {
}
