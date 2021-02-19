package com.company.Game;

public class Fight implements Runnable{
    Fighter first;
    Fighter second;

    public Fight(Fighter first, Fighter second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void run() {
        String nameFirst = first.getClass().getSuperclass().getSimpleName();
        String nameSecond = second.getClass().getSuperclass().getSimpleName();
        System.out.printf("\nThe battle between %s and %s has begun!!!\n", nameFirst, nameSecond);

        while (first.getCurrentHealth() > 0 & second.getCurrentHealth() > 0) {
            second.takeDamage(first);
            if (second.getCurrentHealth() <= 0) {
                System.out.println("WIN: " + nameFirst);
                continue;
            }
            first.takeDamage(second);
            if (first.getCurrentHealth() <= 0) {
                System.out.println("WIN: " + nameSecond);
                continue;
            }
        }
        System.out.println("Health of " + nameFirst + ": " + first.getCurrentHealth());
        System.out.println("Health of " + nameSecond + ": " + second.getCurrentHealth());

    }
}
