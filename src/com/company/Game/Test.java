package com.company.Game;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Fighter> list = new ArrayList<>();
        Fighter first = new HumanMelee();
        Fighter second = new OrkMelee();
        //System.out.println(first.getCurrentHealth());
        Fight fight = new Fight(first, second);
        fight.run();
    }
}
