package br.com.transporte.servico;

import java.util.List;

import br.com.transporte.dominio.Frota;
import br.com.transporte.repositorio.FrotaRepositorio;

public class FrotaServico extends BaseServico<Frota> {

    public FrotaServico() {
        super();
        this.repositorio = new FrotaRepositorio();
    }

    @Override
    public Frota Criar(Frota obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Frota Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Frota> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Frota Atualizar(Frota obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Frota Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }
    
}
