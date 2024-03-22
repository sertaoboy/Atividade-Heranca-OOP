package ExercicioII;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public void setAjudaDeCusto(double ajudaDeCusto){
        this.ajudaDeCusto=ajudaDeCusto;
    }
    public double getAjudaDeCusto(){
        return ajudaDeCusto;
    }

    @Override
    public void valorInss() {
        super.valorInss();
        double salarioAdm = getSalario() + getAjudaDeCusto();
        System.out.println("Seu salario como administrador: R$"+salarioAdm);
    }
}
