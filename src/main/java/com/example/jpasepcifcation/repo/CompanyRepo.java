package com.example.jpasepcifcation.repo;

import com.example.jpasepcifcation.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompanyRepo  extends JpaRepository<Company,Integer>, JpaSpecificationExecutor<Company> {
}
