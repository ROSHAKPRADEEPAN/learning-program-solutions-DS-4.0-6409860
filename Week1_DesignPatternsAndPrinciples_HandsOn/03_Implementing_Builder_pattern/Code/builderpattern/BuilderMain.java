package builderpattern;
public class BuilderMain {
    public static void main(String[] args) {

        System.out.println();
   
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("1TB HDD")
                .build();

        Computer gamingComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("NVIDIA GeForce RTX 3080")
                .setSSD(true)
                .build();

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
