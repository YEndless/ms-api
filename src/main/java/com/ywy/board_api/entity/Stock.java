package com.ywy.board_api.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "stock")
public class Stock {
    @Id
    @GeneratedValue
    private int id ;//主键
    private String quantityOfExistingEquipment ;
    private String equipmentName ;
    private String equipmentNumber ;
    private int equipmentStatus ; //设备状态 1 完好 2 良好 3 待维修 4 报废

}
