package br.com.transporte.servico;

import java.util.List;

import br.com.transporte.dominio.Veiculo;
import br.com.transporte.repositorio.VeiculoRepositorio;

public class VeiculoServico extends BaseServico<Veiculo> {

    public VeiculoServico() {
        super();
        this.repositorio = new VeiculoRepositorio();
    }

    @Override
    public Veiculo Criar(Veiculo obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public Veiculo Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Veiculo> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Veiculo Atualizar(Veiculo obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Veiculo Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }
    
}
