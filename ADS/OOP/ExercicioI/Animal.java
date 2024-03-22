package ExercicioI;


public class Animal {
    public String nome;
    public double peso;

    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setPeso(double peso) {
        this.peso=peso;
    }
    public String getnome(){
        return nome;
    }
    public double getPeso(){
        return peso;
    }


    @Override
    public String toString() {
        return "Nome: " +getnome()+". "+"Peso: "+getPeso()+". "; 
    }


}