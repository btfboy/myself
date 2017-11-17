package com.closer.jxls.domain;

import java.util.Date;

/**
 * Created by Zhang Jinlong on 2015/11/3.
 */
public class Employee {

    private String name;
    private Date birthDate;
    private double payment;
    private double bonus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
