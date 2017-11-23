package com.jk.model;

import java.io.Serializable;
/**
 * Created by 邵先胜 on 2017/11/15.
 */
public class User implements Serializable {
    private static final long serialVersionUID = -6670640310551713010L;

    private Integer id;
    private String supplier;
    private String   caiDate;
    private String caiMoney;
    private Integer registStatus;
    private Integer registYn;
    private String saleName;
    private String remank;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getCaiDate() {
        return caiDate;
    }

    public void setCaiDate(String caiDate) {
        this.caiDate = caiDate;
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
                ", caiDate=" + caiDate +
                ", caiMoney='" + caiMoney + '\'' +
                ", registStatus=" + registStatus +
                ", registYn=" + registYn +
                ", saleName='" + saleName + '\'' +
                ", remank='" + remank + '\'' +
                '}';
    }
}
