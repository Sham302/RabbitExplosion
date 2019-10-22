package com.spartaglobal.rabbitexplosion;

import java.util.Random;

public class Bunnies implements IBunnies{
    private boolean gender;
    private int age = 0;
    private boolean mature;
    private boolean isMale;

    @Override
    public boolean getIsMale() {

        return this.isMale;
    }

    @Override
    public boolean getGender() {
        return gender;
    }

    @Override
    public void setGender(boolean gender) {
     this.gender = gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        Random rdm = new Random();

        this.age = age;
    }

    @Override
    public void setMature(boolean mature) {
     this.mature = mature;
    }

    @Override
    public boolean getMature() {
        return mature;
    }
}
