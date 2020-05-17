package com.tollparking.api.model;

import java.math.BigDecimal;

/**
 * Class PayByHours
 * @author jiaguo
 */
public class PayByHours implements PricingPolicy {

    private BigDecimal hourPrice; // The price per hour

    /**
     * Constructor
     * @param hourPrice The price per hour
     */
    public PayByHours(BigDecimal hourPrice){
        this.hourPrice = hourPrice;
    }

    /**
     * Calculate the parking fee
     * @param hours the number of parking hours
     * @return BigDecimal parking fee
     */
    @Override
    public BigDecimal calculateParkingFee(int hours){
        return this.hourPrice.multiply(new BigDecimal(hours));
    }

}