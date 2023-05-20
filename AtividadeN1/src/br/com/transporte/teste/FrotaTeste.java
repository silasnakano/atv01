package br.com.transporte.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.transporte.dominio.Frota;
import br.com.transporte.servico.FrotaServico;

public class FrotaTeste extends BaseTeste<Frota> {

    public FrotaTeste() {
        super();
        this.servico = new FrotaServico();
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

        Frota cat = new Frota(1, "Frota 01", LocalDate.now());
        Frota novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        Frota cat = this.servico.Ler(chave);

        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Frota> lista = this.servico.Ler();

        for (Frota cat : lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAtualizacao(int chave) {
        System.out.println("Agora testando Update: ");

        Frota antigo = this.servico.Ler(chave);

        antigo.setDescricao("Conto de Fadas");

        Frota alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarDeletar(int chave) {
        System.out.println("Agora testando Remove: ");

        Frota alvo = this.servico.Ler(chave);

        Frota excluido = this.servico.Deletar(alvo.getCodigo());

        System.out.println(excluido.toString());
    }
    
}
