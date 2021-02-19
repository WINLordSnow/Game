package com.company.Game;

public interface Melee {
    default void useAbilityOfRase(Fighter fighter) {
        fighter.reduceCurrentHealth(1);
    };
}
