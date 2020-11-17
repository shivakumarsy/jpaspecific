package com.example.jpasepcifcation.service;

import com.example.jpasepcifcation.entity.Family;
import com.example.jpasepcifcation.repo.FamilyRepo;
import com.example.jpasepcifcation.repo.FamilySpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyService {

    @Autowired
    private FamilyRepo familyRepo;
    public List<Family> getByBillContID(Integer billContId) {
        Specification<Family> familySpecification = FamilySpec.filterByBillcontId(billContId);
        List<Family> all = familyRepo.findAll(familySpecification);
        return all;
    }
}
