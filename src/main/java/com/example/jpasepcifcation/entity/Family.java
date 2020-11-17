package com.example.jpasepcifcation.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "family")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="bill_cont_id")
    private BillCont billCont;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dist_id")
    private Dist dist;




}
