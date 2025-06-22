package BuilderPatternExample;
public class ComputerBuilderTest {
    public static void main(String[] args) {

        // First configuration
        Computer HighEndPC = new Computer.Builder()
                .setCpu("Intel Core i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .build();

        // Second configuration
        Computer officePC = new Computer.Builder()
                .setCpu("Intel Core i5")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .build();

        // Third configuration
        Computer LowEndPC = new Computer.Builder()
                .setCpu("AMD Ryzen 3")
                .setRam("8GB")
                .setTouchScreen("touch")
                .build();

        System.out.println("Gaming PC Configuration:");
        HighEndPC.displayConfiguration();

        System.out.println("Office PC Configuration:");
        officePC.displayConfiguration();

        System.out.println("Minimal PC Configuration:");
        LowEndPC.displayConfiguration();
    }
}