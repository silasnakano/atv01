import br.com.transporte.teste.FuncionarioTeste;
import br.com.transporte.teste.VeiculoTeste;

public class App {
    public static void main(String[] args) throws Exception {
        
        VeiculoTeste teste1 = new VeiculoTeste();
        teste1.Executar();

        System.out.println();
        
        FuncionarioTeste teste2 = new FuncionarioTeste();
        teste2.Executar();

    }
    
}
