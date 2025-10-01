public class Microwave extends Device {
    private int maxTime;


    public Microwave(int startPower, int maxCookingTime) {

        super(startPower);
        this.maxTime = maxCookingTime;
        System.out.println("Microwave created");
    }

    public int getMaxTime() {
        return maxTime;
    }
    public void printDescription() {
        //System.out.println("Microwave Model: " + model + "Watts" + ", Max Time: " + maxTime + " seconds.");

        super.printDescription();
        System.out.println("Max Cooking Time: " + maxTime + " seconds.");

    }
    public void heatFood(){
        System.out.println("Food is heating.");
    }
}
