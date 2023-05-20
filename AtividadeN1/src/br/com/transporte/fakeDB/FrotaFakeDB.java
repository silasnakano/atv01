package br.com.transporte.fakeDB;

import java.time.LocalDate;

import br.com.transporte.dominio.Frota;

public class FrotaFakeDB extends BaseFakeDB<Frota> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Frota(1, "Frota 01", LocalDate.now()));
        this.tabela.add(new Frota(2, "Frota 02", LocalDate.now()));
        this.tabela.add(new Frota(3, "Frota 03", LocalDate.now()));
    }
    
}
