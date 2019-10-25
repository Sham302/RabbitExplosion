package com.spartaglobal.rabbitexplosion;

import java.util.Random;

public class FemaleBunnies extends Bunnies implements IFemaleBunnies {

    private int offspring;
    private boolean pregnant;

    @Override
    public int getOffspring() {
        Random rdm = new Random();
        int children = rdm.nextInt(15);
        return children;
    }

    @Override
    public int setOffspring(int offspring) {
    this.offspring = offspring;
    return offspring;
    }

    @Override
    public boolean getPregnant() {
        return this.pregnant;
    }

    @Override
    public void setPregnant(boolean pregnant) {
      this.pregnant = pregnant;
    }

}
