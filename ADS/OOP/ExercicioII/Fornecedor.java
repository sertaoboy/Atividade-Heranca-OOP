package ExercicioII;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public void setValorCredito(double valorCredito) {
        this.valorCredito=valorCredito;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida=valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }
    public double getValorDivida() {
        return valorDivida;
    }




    public void obterSaldo(){
        double saldo = getValorCredito() - getValorDivida();
        System.out.println("Saldo : R$"+saldo);
    }
}
