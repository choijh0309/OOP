package com.codestates.seb.burgerqueen.discount.discountCondition;

import com.codestates.seb.burgerqueen.discount.discountPolicy.DiscountPolicy;

import java.util.Scanner;

public class CozDiscountCondition implements DiscountCondition {

    private boolean isSatisfied;
    private DiscountPolicy discountPolicy;

    public CozDiscountCondition(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public boolean isSatisfied() {
        return isSatisfied;
    }

    private void setSatisfied(boolean satisfied) {
        isSatisfied = satisfied;
    }

    public void checkDiscountCondition() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("코드스테이츠 수강생이십니까? (1)_예 (2)_아니오");
        String input = scanner.nextLine();

        if (input.equals("1")) setSatisfied(true);
        else if (input.equals("2")) setSatisfied(false);
    }

    public int applyDiscount(int price) {
        return discountPolicy.calculateDiscountedPrice(price);
    }
}