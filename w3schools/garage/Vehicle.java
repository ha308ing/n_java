package garage;

abstract class Vehicle {
    public String honkSound = "Honk! Honk!";

    public abstract void honk();

    public void vehicleHonk() {
        System.out.println("Honk! Honk!");
    }
}
