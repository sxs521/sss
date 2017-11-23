package com.jk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by 邵先胜 on 2017/11/15.
 */
@Entity
public class User implements  Serializable{
    private static final long serialVersionUID = 4585722226151041732L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false,unique = true)
    private String supplier;
    @Column(nullable = false)
    private String caiMoney;
    @Column(nullable = false)
    private Integer registStatus;
    @Column(nullable = false)
    private Integer registYn;
    @Column(nullable = false)
    private String saleName;
    @Column(nullable = false)
    private String remank;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }



    public String getCaiMoney() {
        return caiMoney;
    }

    public void setCaiMoney(String caiMoney) {
        this.caiMoney = caiMoney;
    }

    public Integer getRegistStatus() {
        return registStatus;
    }

    public void setRegistStatus(Integer registStatus) {
        this.registStatus = registStatus;
    }

    public Integer getRegistYn() {
        return registYn;
    }

    public void setRegistYn(Integer registYn) {
        this.registYn = registYn;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getRemank() {
        return remank;
    }

    public void setRemank(String remank) {
        this.remank = remank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", supplier='" + supplier + '\'' +

                ", caiMoney='" + caiMoney + '\'' +
                ", registStatus=" + registStatus +
                ", registYn=" + registYn +
                ", saleName='" + saleName + '\'' +
                ", remank='" + remank + '\'' +
                '}';
    }
}
