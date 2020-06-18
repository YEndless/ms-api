package com.ywy.board_api.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id", required = true)
    private int id ;//主键
    private String openid ;
    private String articleId ;
    @ApiModelProperty(value = "文章标题", required = true)
    private String name ;
    @ApiModelProperty(value = "作者", required = true)
    private String auther ;
    private String avatar ;//头像
    private Date sendTime ;//发布时间
    private int userId ;//作者id
    private String content ;//内容
    private int isDelete ;//是否刪除 0 no 1 yes
    public Article() {
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
