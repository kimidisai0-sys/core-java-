package com.fundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

public class ObjectdatatypeDemo1 {

	public static void main(String[] args) {
		
        BigInteger num1 = new BigInteger("12345678901234567890");
        BigInteger num2 = new BigInteger("98765432109876543210");

        BigDecimal price1 = new BigDecimal("1250.75");
        BigDecimal price2 = new BigDecimal("3499.25");

        BigInteger addition = num1.add(num2);
        
        BigDecimal decimaladdition = price1.add(price2);

        System.out.println("BigInteger Addition: " + addition);

        System.out.println("BigDecimal Addition: " + decimaladdition);
    }


	}


