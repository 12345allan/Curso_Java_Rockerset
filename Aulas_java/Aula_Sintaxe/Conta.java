public class Conta {
    //variavel da classe conta
    double saldo=10.0;
    public void sacar(Double valor) {
    //variavel do método
    double novoSaldo = saldo - valor;
    //somente o método sacar conhece esta variavel
    System.out.println(novoSaldo);
    }
    public void imprimirSaldo(){
    //disponível em toda classe
    System.out.println(saldo);
    }
    
}