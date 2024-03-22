package ExercicioI;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setNome("Gnu");
        animal1.setPeso(176.87);
        animal1.toString();
        System.out.println(animal1.toString());



        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Lessie");
        cachorro1.setPeso(29.7);
        cachorro1.setRaca("Boordercolie");
        System.out.println(cachorro1.toString());




        Peixe peixe1 = new Peixe();
        peixe1.setNome("Nemo");
        peixe1.setPeso(0.87);
        peixe1.setHabitat("Agua salgada");
        System.out.println(peixe1.toString());


    }
}
