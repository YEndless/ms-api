package com.ywy.board_api.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue
    private int id ;//主键
    private int purchaseNumber ;//数量
    private String purchaseDate ;

    private String purchaseFunds ;
    private String purchasePerson ;
    private String equipmentNumber;
    private String equipmentName ;

}
