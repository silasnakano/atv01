package br.com.transporte.repositorio;

import java.time.LocalDate;

import br.com.transporte.dominio.Funcionario;
import br.com.transporte.fakeDB.FuncionarioFakeDB;

public class FuncionarioRepositorio extends BaseRepositorio<Funcionario> {

    public FuncionarioRepositorio() {
        super();
        this.tabela = new FuncionarioFakeDB().getTabela();
    }

    @Override
    public Funcionario Create(Funcionario obj) {

        int chave = 0;

        if (this.tabela.size() == 0) {
            chave++;
        } else {
            int tamanho = this.tabela.size();
            chave = this.tabela.get(tamanho - 1).getCodigoPessoa() + 1;
        }

        obj.setCodigoPessoa(chave);
        this.tabela.add(obj);

        return obj;

    }

    @Override
    public Funcionario Read(int chave) {

        Funcionario res = new Funcionario(chave, "Nome 01", "email@01.com", "site01.com.br", LocalDate.now(), "123.456.789-10", "123456", "M", "Raça 01", "Naturalidade 01", "Nacionalidade 01", "Pai 01", "Mãe 01", "1234", "login01", "senha01", LocalDate.now());

        for (Funcionario tupla : this.tabela) {

            if (tupla.getCodigoPessoa() == chave) {
                res = tupla;
                break;
            } else {
                res = null;
            }
        }

        return res;
    }

    @Override
    public Funcionario Update(Funcionario obj) {

        Funcionario alteracao = this.Read(obj.getCodigoPessoa());

        if (alteracao != null) {
            alteracao.setEmail(obj.getEmail());
        }

        return alteracao;

    }
    
}
