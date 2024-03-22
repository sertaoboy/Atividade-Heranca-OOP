package ExercicioI;

public class Cachorro extends Animal {
    private String raca;
    public void setRaca(String raca){
        this.raca=raca;
    }
    public String getRaca(){
        return raca;
    }


    @Override
    public String toString() {
        return super.toString() + "Raca: "+getRaca(); 
    }
}
