package br.com.transporte.fakeDB;

import java.time.LocalDate;

import br.com.transporte.dominio.Funcionario;

public class FuncionarioFakeDB extends BaseFakeDB<Funcionario> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Funcionario(1, "Nome 01", "email@01.com", "site01.com.br", LocalDate.now(), "123.456.789-10", "123456", "M", "Raça 01", "Naturalidade 01", "Nacionalidade 01", "Pai 01", "Mãe 01", "1234", "login01", "senha01", LocalDate.now()));
        this.tabela.add(new Funcionario(2, "Nome 02", "email@02.com", "site02.com.br", LocalDate.now(), "321.654.987-01", "654321", "F", "Raça 02", "Naturalidade 02", "Nacionalidade 02", "Pai 02", "Mãe 02", "4321", "login02", "senha02", LocalDate.now()));
        this.tabela.add(new Funcionario(3, "Nome 03", "email@03.com", "site03.com.br", LocalDate.now(), "213.546.879-11", "235416", "M", "Raça 03", "Naturalidade 03", "Nacionalidade 03", "Pai 03", "Mãe 03", "3214", "login03", "senha03", LocalDate.now()));
    }
    
}
