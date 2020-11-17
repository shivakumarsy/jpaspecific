package com.example.jpasepcifcation.repo;

import com.example.jpasepcifcation.entity.FamilyOrg;
import com.example.jpasepcifcation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FamilyOrgRepo extends JpaRepository<FamilyOrg,Integer>, JpaSpecificationExecutor<FamilyOrg> {
}
