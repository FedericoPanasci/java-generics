package Model;

public class Printer <v, t>{
    t otraCosa;
    v algo;

    public Printer(v algo, t otraCosa) {
        this.algo = algo;
        this.otraCosa = otraCosa;
    }

    public void print(){
        System.out.println("imprimir " + this.algo);
        System.out.println("otra " + this.otraCosa);
    }
}
