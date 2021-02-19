package com.company.Game;

public abstract class Ork extends Shadow implements AbilityOfRace{
    private final static int ORK_ARMOR_BONUS  = 9;
    private final static int ORK_HEALTH_BONUS = 8;
    private final static int ORK_ATTACK_BONUS = 15;
    private final static int ORK_SPEED_BONUS  = 3;

    private boolean isSuperFight;

    public Ork(int armor, int health, int attack, int speed) {
        super(armor + ORK_ARMOR_BONUS,
                health + ORK_HEALTH_BONUS,
                attack + ORK_ATTACK_BONUS,
                speed + ORK_SPEED_BONUS);
    }

    @Override
    public void useAbility() {
        if (!isSuperFight && (this.getCurrentHealth() > 0 && this.getCurrentHealth() <= 20)) {
            this.addCurrentAttack(BONUS_FOR_ORK_ATTACK);
            isSuperFight = true;
        }
    }
}
