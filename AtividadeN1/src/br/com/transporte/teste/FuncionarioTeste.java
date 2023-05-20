package br.com.transporte.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.transporte.dominio.Funcionario;
import br.com.transporte.servico.FuncionarioServico;

public class FuncionarioTeste extends BaseTeste<Funcionario> {

    public FuncionarioTeste() {
        super();
        this.servico = new FuncionarioServico();
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

        Funcionario cat = new Funcionario(1, "Nome 01", "email@01.com", "site01.com.br", LocalDate.now(), "123.456.789-01", "123456", "M", "Raça 01", "Naturalidade 01", "Nacionalidade 01", "Pai 01", "Mãe 01");
        Funcionario novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigoPessoa();
    }

    @Override
    protected void TestarLeitura(int chave) {
        Funcionario cat = this.servico.Ler(chave);

        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Funcionario> lista = this.servico.Ler();

        for (Funcionario cat : lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAtualizacao(int chave) {
        System.out.println("Agora testando Update: ");

        Funcionario antigo = this.servico.Ler(chave);

        antigo.setEmail("email@11.com");;

        Funcionario alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarDeletar(int chave) {
        System.out.println("Agora testando Remove: ");

        Funcionario alvo = this.servico.Ler(chave);

        Funcionario excluido = this.servico.Deletar(alvo.getCodigoPessoa());

        System.out.println(excluido.toString());
    }
    
}
