package com.bad_java.homework.hyperskill.coffee_machine.part_5;

import com.bad_java.homework.hyperskill.coffee_machine.part_5.ingredients.Ingredient;

public interface ModifyingResources {
    void decResources(int water, int milk, int beans, int cups, int money);

    void addResources(int water, int milk, int beans, int cups, int money);

    Ingredient gettingRidOfMoney();

    void notifyAboutState();
}
