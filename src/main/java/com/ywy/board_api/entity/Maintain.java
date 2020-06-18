package com.ywy.board_api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@Entity
@Table(name = "maintain")
public class Maintain {
    @Id
    @GeneratedValue
    private int id ;//主键
    private String maintenanceDate ;

    private String maintenancePersonnel ;
    private String maintenanceFunds ;
    private String equipmentName ;
    private String equipmentNumber ;

}
