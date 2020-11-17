package com.example.jpasepcifcation.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "family_org")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class FamilyOrg implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String foname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="bill_cont_id")
    private BillCont billCont;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dist_id")
    private Dist dist;
}
