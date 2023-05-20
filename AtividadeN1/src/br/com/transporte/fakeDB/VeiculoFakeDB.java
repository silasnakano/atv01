package br.com.transporte.fakeDB;

import java.time.LocalDate;

import br.com.transporte.dominio.Veiculo;

public class VeiculoFakeDB  extends BaseFakeDB<Veiculo> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Veiculo(1, "Veiculo 01", LocalDate.now(), 1, "Placa 01"));
        this.tabela.add(new Veiculo(2, "Veiculo 02", LocalDate.now(), 2, "Placa 02"));
        this.tabela.add(new Veiculo(3, "Veiculo 03", LocalDate.now(), 3, "Placa 03"));
    }
    
}
