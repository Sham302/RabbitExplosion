package com.spartaglobal.rabbitexplosion;

import java.util.ArrayList;
import java.util.List;

public class InitialBunnyPair {
static List<IBunnies> bunnyList = new ArrayList<>();

    public static void initialBunnies() {
        for (int i = 0; i < 3; i++) {
            Bunnies b = new Bunnies();
            bunnyList.add(b);
            logInitial(b);
        }
    }

    public static void logInitial(Bunnies b) {
        System.out.println("initial bunnies " + b);
    }}

