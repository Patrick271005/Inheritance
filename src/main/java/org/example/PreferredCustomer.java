package org.example;

public class PreferredCustomer extends Customer{
    private int loyaltyPoints;
    private int discountLevel;

    public PreferredCustomer() {
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(int discountLevel) {
        this.discountLevel = discountLevel;
    }

    public PreferredCustomer(String name, String address, String phone, String custNum, boolean mailingList, int loyaltyPoints, int discountLevel) {
        super(name,address,phone,custNum,mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    @Override
    public String toString() {
        return super.toString()+
                "loyaltyPoints='" + loyaltyPoints + '\'' +
                ", discountLevel='" + discountLevel + '\'' +
                '}';
    }
}
