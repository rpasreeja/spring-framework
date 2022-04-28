package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "Merchants")
@Data
@NoArgsConstructor
public class Merchant extends BaseEntity{

    private String name;
    private String code;
    private BigDecimal transactionFee;
    private BigDecimal commissionRate;
    private Integer payOutDelayCount;

    @OneToMany(mappedBy = "merchant") //in onetomany relationship,ownership belongs to Many side
    private List<Payment> paymentlist;

    public Merchant(String name, String code, BigDecimal transactionFee, BigDecimal commissionRate, Integer payOutDelayCount) {
        this.name = name;
        this.code = code;
        this.transactionFee = transactionFee;
        this.commissionRate = commissionRate;
        this.payOutDelayCount = payOutDelayCount;
    }
}
