package Adapter;

public class HairDryer implements Volt110 {
    @Override
    public void powerOn() {
        System.out.println("Hair Dryer Powered on!");
    }

    @Override
    public String getName() {
        return "Hair Dryer";
    }
}
