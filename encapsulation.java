package com.company;

public class encapsulation {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setStId(21);
        s1.setStName("Anjali");

        System.out.println(s1.getStId());
        System.out.println(s1.getStName());


    }
}
class Students{
    private int stId;
    private String stName;

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }
}