package com.earyant.dao.primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 知乎用户bean
 *
 * @author KKys
 */
@Entity
@Table(name = "user")
public class ZhiHuUserBean {
    @Id
    @GeneratedValue
    Long id;
    String name;// 用户姓名

    String location;// 居住地;

    String business;// 行业

    String employment;// 公司

    String position;// 职位;

    String education;// 大学

    String major;// 专业

    String userInfo;// 个人简介

    int answersNum = 0;// 回答数量

    Long starsNum;// 被赞同数

    Long thxNum;// 被感谢数

    @Override
    public String toString() {
        return "姓名：" + name + "\n" + "居住地：" + location + "\n" + "行业：" + business + "\n公司：" + employment
                + "\n职位：" + position + "\n大学：" + education + "\n专业：" + major +
                "\n个人简介：" + userInfo + "\n回答数：" + answersNum + "\n被点赞数：" + starsNum + "\n被收藏数：" + thxNum;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getBusiness() {
        return business;
    }


    public void setBusiness(String business) {
        this.business = business;
    }


    public String getEmployment() {
        return employment;
    }


    public void setEmployment(String employment) {
        this.employment = employment;
    }


    public String getPosition() {
        return position;
    }


    public void setPosition(String position) {
        this.position = position;
    }


    public String getEducation() {
        return education;
    }


    public void setEducation(String education) {
        this.education = education;
    }


    public String getMajor() {
        return major;
    }


    public void setMajor(String major) {
        this.major = major;
    }


    public int getAnswersNum() {
        return answersNum;
    }


    public void setAnswersNum(int answersNum) {
        this.answersNum = answersNum;
    }


    public Long getStarsNum() {
        return starsNum;
    }


    public void setStarsNum(Long starsNum) {
        this.starsNum = starsNum;
    }


    public Long getThxNum() {
        return thxNum;
    }


    public void setThxNum(Long thxNum) {
        this.thxNum = thxNum;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }


}
