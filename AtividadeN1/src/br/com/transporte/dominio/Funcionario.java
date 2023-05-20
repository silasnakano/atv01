package br.com.transporte.dominio;

import java.time.LocalDate;

public class Funcionario extends PessoaFisica {

    private String matricula;
    private String login;
    private String senha;
    private LocalDate dataContratacao;
    
    public String getMatricula() {
        return matricula;
    }
   
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   
    public String getLogin() {
        return login;
    }
   
    public void setLogin(String login) {
        this.login = login;
    }
   
    public String getSenha() {
        return senha;
    }
   
    public void setSenha(String senha) {
        this.senha = senha;
    }
   
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
  
    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Funcionario(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao, String cpf,
            String rg, String sexo, String race, String naturalidade, String nacionalidade, String nomePai,
            String nomeMae, String matricula, String login, String senha, LocalDate dataContratacao) {
        super(codigoPessoa, nome, email, site, dataInclusao, cpf, rg, sexo, race, naturalidade, nacionalidade, nomePai,
                nomeMae);
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
        this.dataContratacao = dataContratacao;
    }

    public Funcionario(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao, String cpf,
            String rg, String sexo, String race, String naturalidade, String nacionalidade, String nomePai,
            String nomeMae) {
        super(codigoPessoa, nome, email, site, dataInclusao, cpf, rg, sexo, race, naturalidade, nacionalidade, nomePai,
                nomeMae);
    }

    @Override
    public String toString() {
        return "Funcionario [matricula=" + matricula + ", login=" + login + ", senha=" + senha + ", dataContratacao="
                + dataContratacao + "]";
    }

}
