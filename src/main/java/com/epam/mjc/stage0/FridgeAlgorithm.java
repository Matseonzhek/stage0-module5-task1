package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

public class FridgeAlgorithm implements Fridge {

    /**
     * This is a first task in this module. You need to get milk from a fridge =)
     * <p>
     * Call the methods of the Fridge object inside the fridgeAlgorithm method in the required logical order.
     * P.S All methods of interaction with the fridge can be found inside the {@see Fridge} class.
     */
    public void fridgeAlgorithm(Fridge fridge) {
        System.out.println("I think we should use 3 actions to get 1 bottle of milk =)");
        fridge.open();
        fridge.getMilk();
        fridge.close();
    }

    @Override
    public void close() {
        System.out.println("Did you forget to close the fridge? =)");
    }

    @Override
    public void open() {
        System.out.println("At first, we should open the fridge =)");
    }

    @Override
    public void getMilk() {
        System.out.println("I think that the order is wrong...");
    }
}
