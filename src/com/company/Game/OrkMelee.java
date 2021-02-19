package com.company.Game;

public class OrkMelee extends Ork implements Melee{

    public OrkMelee() {
        super(MeleeBonus.ARMOR.getValue(),
                MeleeBonus.HEALTH.getValue(),
                MeleeBonus.ATTACK.getValue(),
                MeleeBonus.SPEED.getValue());
        setCurrentArmor(getArmor());
        setCurrentHealth(getHealth());
        setCurrentAttack(getAttack());
        setCurrentSpeed(getSpeed());
    }


    @Override
    public int hit() {
        return getCurrentAttack();
    }

    @Override
    public void takeDamage(Fighter fighter) {
        int damage = fighter.hit();
        if (getCurrentArmor() >= damage) {
            reduceCurrentHealth(0);
        } else {
            reduceCurrentHealth(damage - getCurrentArmor());
            useAbility();
        }
        if (getCurrentHealth() > 0) {
            useAbilityOfRase(fighter);
        }
    }

}
