package com.example.jpasepcifcation.controller;

import antlr.ASTNULLType;
import com.example.jpasepcifcation.entity.Company;
import com.example.jpasepcifcation.entity.Family;
import com.example.jpasepcifcation.entity.User;
import com.example.jpasepcifcation.repo.CompanyRepo;
import com.example.jpasepcifcation.repo.CompanySpecific;
import com.example.jpasepcifcation.repo.UserRepo;
import com.example.jpasepcifcation.repo.UserSpecific;
import com.example.jpasepcifcation.service.FamilyService;
import com.example.jpasepcifcation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@Service
public class Ctrl {

    @Autowired
    private CompanyRepo companyRepo;

  @Autowired
  private UserService userService;

    @Autowired
    private FamilyService familyService;

    @GetMapping("/companyDet/id/{id}")
    public ResponseEntity<List<Company>> getByCompanyDet(@PathVariable Integer id){
        Specification<Company> companySpecification = CompanySpecific.filterByCompId(id);
        List<Company> all = companyRepo.findAll(companySpecification);
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @GetMapping("/userDet/compId/{compId}")
//    @Transactional
    public ResponseEntity<List<User>> userDet(@PathVariable Integer compId){
        return new ResponseEntity<>(userService.getByComp(compId), HttpStatus.OK);
    }

    @GetMapping("/family/billContId/{billContId}")
//    @Transactional
    public ResponseEntity<List<Family>> family(@PathVariable Integer billContId){
        return new ResponseEntity<>(familyService.getByBillContID(billContId), HttpStatus.OK);
    }

}
