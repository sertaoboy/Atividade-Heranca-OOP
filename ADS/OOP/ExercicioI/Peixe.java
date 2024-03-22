package ExercicioI;

public class Peixe extends Animal {
    private String habitat;

    public void setHabitat(String habitat){
        this.habitat=habitat;
    }
    public String getHabitat(){
        return habitat;
    }



    @Override
    public String toString() {
        return super.toString() + "Habitat: "+getHabitat();
    }
}
