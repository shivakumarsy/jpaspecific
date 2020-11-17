package com.example.jpasepcifcation.repo;

import com.example.jpasepcifcation.entity.Dist;
import com.example.jpasepcifcation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DistRepo extends JpaRepository<Dist,Integer>, JpaSpecificationExecutor<Dist> {
}
