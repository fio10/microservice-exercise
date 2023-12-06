package com.optasia.microservicesexercise.entities;

import java.time.ZonedDateTime;

public class Loan {

    private long id;
    private long customerId;

    private String transactionId;

    private long principal;
    private long principalLeft;
    private long fee;
    private long fee_left;

    private ZonedDateTime loanTstamp;

    private int recoveriesNum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public long getPrincipal() {
        return principal;
    }

    public void setPrincipal(long principal) {
        this.principal = principal;
    }

    public long getPrincipalLeft() {
        return principalLeft;
    }

    public void setPrincipalLeft(long principalLeft) {
        this.principalLeft = principalLeft;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public long getFee_left() {
        return fee_left;
    }

    public void setFee_left(long fee_left) {
        this.fee_left = fee_left;
    }

    public ZonedDateTime getLoanTstamp() {
        return loanTstamp;
    }

    public void setLoanTstamp(ZonedDateTime loanTstamp) {
        this.loanTstamp = loanTstamp;
    }

    public int getRecoveriesNum() {
        return recoveriesNum;
    }

    public void setRecoveriesNum(int recoveriesNum) {
        this.recoveriesNum = recoveriesNum;
    }


//    Methods Declaration






}
