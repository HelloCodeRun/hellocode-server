package com.hc.hellocode.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CollegeInfor {
    @Id
    private Integer collegeId;
    private String nameZh;
    private String nameEn;
    private String nameShort;
    private String address;
    private String homePage;
    private String logo;
}
