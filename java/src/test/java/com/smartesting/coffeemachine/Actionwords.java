package com.smartesting.coffeemachine;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class Actionwords {
    public CoffeeMachine sut = new CoffeeMachine();

    public void startTheCoffeeMachine() {
        sut.start();
    }

    public void shutdownCoffeeMachine() {
        sut.stop();
    }

    public void assertDisplayedMessage(String message) {
        assertEquals(sut.message(), message);
    }

    public void assertCoffeeServed() {
        assertTrue(sut.coffeeServed);
    }

    public void assertNoCoffeeIsServed() {
        assertFalse(sut.coffeeServed);
    }

    public void takeACoffee() {
        sut.takeCoffee();
    }

    public void emptyCoffeeGrounds() {
        sut.emptyGrounds();
    }

    public void fillBeans() {
        sut.fillBeans();
    }

    public void fillWaterTank() {
        sut.fillTank();
    }

    public void takeCoffees(int coffeeNumber) {
        while ((coffeeNumber > 0)) {
            takeACoffee();
            coffeeNumber = coffeeNumber - 1;
        }
    }
}