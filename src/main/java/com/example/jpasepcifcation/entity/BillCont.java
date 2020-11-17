package com.example.jpasepcifcation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "billcont")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BillCont implements Serializable {

    private static final long serialVersionUID = 8685510373486278973L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String bname;


    @JsonIgnore
    @OneToMany(mappedBy = "billCont",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Family> families = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "billCont",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<FamilyOrg> familyOrg = new HashSet<>();


}
