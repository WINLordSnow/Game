package com.company.Game;

public abstract class Human extends Shadow implements AbilityOfRace {
    private final static int HUMAN_ARMOR_BONUS  = 10;
    private final static int HUMAN_HEALTH_BONUS = 15;
    private final static int HUMAN_ATTACK_BONUS = 10;
    private final static int HUMAN_SPEED_BONUS  = 2;

    private boolean isSuperFight;

    public Human(int armor, int health, int attack, int speed) {
        super(armor + HUMAN_ARMOR_BONUS,
                health + HUMAN_HEALTH_BONUS,
                attack + HUMAN_ATTACK_BONUS,
                speed + HUMAN_SPEED_BONUS);
    }

    @Override
    public void useAbility() {
        if (!isSuperFight && (this.getCurrentHealth() > 0 && this.getCurrentHealth() <= 10)) {
            this.addCurrentArmor(BONUS_FOR_HUMAN_ARMOR);
            isSuperFight = true;
        }
    }
    @Override
    public void takeDamage(Fighter fighter){
        int damage = fighter.hit();
        if (getCurrentArmor() >= damage) {
            reduceCurrentHealth(0);
        } else {
            reduceCurrentHealth(damage - getCurrentArmor());
            useAbility();
        }
    }
}
