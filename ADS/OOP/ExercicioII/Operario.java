package ExercicioII;

public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public void setValorProducao(double valorProducao) {
        this.valorProducao=valorProducao;
    }
    public void setComissao(double comissao) {
        this.comissao=comissao;
    }
    public double getValorProducao(){
        return valorProducao;
    }
    public double getComissao(){
        return comissao;
    }

    @Override
    public void valorInss() {
        super.valorInss();
        double salarioOperario = getSalario() + getComissao();
        System.out.println("Seu salario como operario: R$"+salarioOperario);
    }
}