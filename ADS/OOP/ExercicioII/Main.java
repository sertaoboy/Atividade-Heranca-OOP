package ExercicioII;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("Jose");
        fornecedor1.setIdade(46);
        fornecedor1.setSexo("Masculino");
        fornecedor1.setValorCredito(1600.50);
        fornecedor1.setValorDivida(744.20);
        fornecedor1.obterSaldo();

        Empregado empregado1 = new Empregado();
        empregado1.setNome("Fernando");
        empregado1.setIdade(24);
        empregado1.setMatricula("2222222MF");
        empregado1.setSexo("Masculino");
        empregado1.setSalario(1200);
        empregado1.valorInss();

        Administrador adm1 = new Administrador();
        adm1.setNome("Luiza");
        adm1.setSalario(3200);
        adm1.setAjudaDeCusto(600);
        adm1.valorInss();

        Operario operario1 = new Operario();
        operario1.setNome("Karl");
        operario1.setComissao(1000);
        operario1.setSalario(1200);
        operario1.setValorProducao(90);
        operario1.valorInss();

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Lia");
        vendedor1.setIdade(23);
        vendedor1.setSalario(2000);
        vendedor1.setValorVendas(56000);
        vendedor1.setQtdVendas(40);
        vendedor1.valorInss();

    }
}
