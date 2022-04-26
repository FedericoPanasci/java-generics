import Model.Cat;
import Model.Dog;
import Model.Printer;
import Model.PrinterAnimals;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer("teniente dan", 10);
        printer.print();

        Cat cat = new Cat("Vegeta");
        Dog dog = new Dog("Goku");

        PrinterAnimals<Cat, Dog> printerAnimals = new PrinterAnimals<>(new Cat(), new Dog());
        System.out.println("imprime por separado");
        printerAnimals.printAnimal(cat.getName());
        printerAnimals.printOtro(dog.getName());

        System.out.println("imprime juntos");
        printerAnimals.imprimirAnimales(cat.getName(), dog.getName());


        /*PrinterAnimals<Dog> printerAnimalsDog= new PrinterAnimals<>(new Dog());
        printerAnimalsDog.print(dog.getName());
        */
    }
}
