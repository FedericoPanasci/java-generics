package Model;

public class PrinterAnimals <v, t> extends Animal{
    v animal;
    t otro;

    public PrinterAnimals(v animal, t otro) {
        this.animal = animal;
        this.otro = otro;
    }

    public static <v, t> void imprimirAnimales(v animal, t otro){
        System.out.println("animal " + animal);
        System.out.println("otro " + otro);
    }

    public static <v> void printAnimal(v animal){
        System.out.println("el animal " + animal);
    }

    public static <t> void printOtro(t otro){
        System.out.println("el animal " + otro);
    }
    public v getAnimal() {
        return animal;
    }

    public void setAnimal(v animal) {
        this.animal = animal;
    }
}
