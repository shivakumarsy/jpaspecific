package com.example.jpasepcifcation.repo;

import com.example.jpasepcifcation.entity.BillCont;
import com.example.jpasepcifcation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BillContRepo extends JpaRepository<BillCont,Integer>, JpaSpecificationExecutor<BillCont> {


}
