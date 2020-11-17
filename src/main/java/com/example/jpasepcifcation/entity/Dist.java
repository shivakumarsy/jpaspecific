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
@Table(name = "dist")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Dist implements Serializable {
    private static final long serialVersionUID = 2458379073045752198L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String dname;

    @JsonIgnore
    @OneToMany(mappedBy = "dist",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<FamilyOrg> familyOrg = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "billCont",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Family> families = new HashSet<>();

}
