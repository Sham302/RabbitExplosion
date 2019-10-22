package com.spartaglobal.rabbitexplosion;

import java.util.Random;

public class Bunnies implements IBunnies{

    private int age = 0;
    private boolean mature;
    private boolean isMale;

    @Override
    public boolean getIsMale() {
        return this.isMale;
    }


    @Override
    public void setGender() {
        Random rdm = new Random();
        int random = rdm.nextInt(2);

        if (random == 0){
            this.isMale = true;
        } else {
            this.isMale = false;
        }

    }

    @Override
    public int getAge() {
        return age++;
    }

    @Override
    public void setAge(int age) {
        Random rdm = new Random();
        int random = rdm.nextInt(6);

        this.age = random;
        setMature(this.age);
    }

    @Override
    public void setMature(int age) {
     this.mature = age > 0.25;
    }

    @Override
    public boolean getMature() {
        return mature;
    }
}
