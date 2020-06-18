package com.ywy.board_api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "scrap")
public class Scrap {
    @Id
    @GeneratedValue
    private int id ;//主键
    private String retirementDate ;
    private String equipmentName ;
    private String equipmentNumber ;
    private String approver ;

}
