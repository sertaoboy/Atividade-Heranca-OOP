package ExercicioII;

public class Vendedor extends Empregado {
    private double valorVendas;
    private int qtdVendas;
    private double comissao;

    public void setComissao(){
        this.comissao=comissao;
    }
    public double getComissao(){
        return comissao;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas=valorVendas;
    }
    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas=qtdVendas;
    }

    public double getValorVendas(){
        return valorVendas;
    }
    public int getQtdVendas(){
        return qtdVendas;
    }
    
    @Override
    public void valorInss() {
        super.valorInss();
        double salarioVendedor = getComissao() + getSalario();
        System.out.println("Seu salario como vendedor: R$"+salarioVendedor) ;
    }

    
}
