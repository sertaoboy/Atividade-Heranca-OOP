package ExercicioII;

public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public void setSalario(double salario){
        this.salario=salario;
    }
    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

    public double getSalario(){
        return salario;
    }
    public String getMatricula(){
        return matricula;
    }

    public void valorInss(){
       double beneficio = (getSalario() * 0.11);
        System.out.println("Valor do seu Inss: R$" +beneficio);
        setSalario(getSalario() + beneficio);
        System.out.println("Salario: R$"+getSalario());
    }

}
