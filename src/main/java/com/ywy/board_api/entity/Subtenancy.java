package com.ywy.board_api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "subtenancy")
public class Subtenancy {
    @Id
    @GeneratedValue
    private int id ;//主键
    private String lendingEquipmentNumber ;
    private String lendingEquipmentName ;
    private String handlingPersonnel ;
    private String borrowDate ;
    private String returnDate ;
}
