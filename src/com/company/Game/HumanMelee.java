package com.company.Game;

public class HumanMelee extends Human implements Melee{

    public HumanMelee() {
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
        super.takeDamage(fighter);
        if (getCurrentHealth() > 0) {
            useAbilityOfRase(fighter);
        }
    }

}
