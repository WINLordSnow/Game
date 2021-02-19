package com.company.Game;

enum MeleeBonus {
    /**
     * Defense bonus for melee fighter.
     */
    ARMOR(5),
    /**
     * Health bonus for melee fighter.
     */
    HEALTH(0),
    /**
     * Attack bonus for melee fighter.
     */
    ATTACK(-2),
    /**
     * Speed bonus for melee fighter.
     */
    SPEED(-1);

    private int value;

    MeleeBonus(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
}
