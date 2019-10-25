package com.spartaglobal.rabbitexplosion;

import java.util.Random;

public class Bunnies implements IBunnies{

    private int age;
    private boolean mature;
    private boolean isMale;


    @Override
    public boolean getIsMale() { //maybe add setter?
        Random rdm = new Random();
        int random = rdm.nextInt(2);

        if (random == 0){
            this.isMale = true;
        } else {
            this.isMale = false;
        }
        return this.isMale;
    }


    @Override
    public int getAge() {
        return this.age++;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setMature(boolean mature) {
     this.mature = this.age >= 3;
    }

    @Override
    public boolean getMature() {
        return this.mature;
    }
}
