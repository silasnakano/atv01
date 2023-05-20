package br.com.transporte.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.transporte.dominio.Veiculo;
import br.com.transporte.servico.VeiculoServico;

public class VeiculoTeste extends BaseTeste<Veiculo> {

    public VeiculoTeste() {
        super();
        this.servico = new VeiculoServico();
    }

    @Override
    public void Executar() {
        int valorChave = this.TestarCriacao();

        this.TestarAtualizacao(valorChave);
        this.TestarDeletar(valorChave);
        // this.TestarLeitura();
        // this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {
        System.out.println("Agora testando Create: ");

        Veiculo cat = new Veiculo(1, "Veículo 01", LocalDate.now(), 1, "Placa 01");
        Veiculo novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        Veiculo cat = this.servico.Ler(chave);

        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Veiculo> lista = this.servico.Ler();

        for (Veiculo cat : lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAtualizacao(int chave) {
        System.out.println("Agora testando Update: ");

        Veiculo antigo = this.servico.Ler(chave);

        antigo.setDescricao("Conto de Fadas");

        Veiculo alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarDeletar(int chave) {
        System.out.println("Agora testando Remove: ");

        Veiculo alvo = this.servico.Ler(chave);

        Veiculo excluido = this.servico.Deletar(alvo.getCodigo());

        System.out.println(excluido.toString());
    }
    
}
