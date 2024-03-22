package ExercicioII;

public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascim;

    public void setValorDivida(double valorDivida) {
        this.valorDivida=valorDivida;
    }
    public void setAnoNascim(int anoNascim) {
        this.anoNascim=anoNascim;
    }

    public double getValorDivida(){
        return valorDivida;
    }
    public int getAnoNasci() {
        return anoNascim;
    }


    
}
