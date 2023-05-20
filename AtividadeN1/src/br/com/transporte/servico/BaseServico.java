package br.com.transporte.servico;

import br.com.transporte.repositorio.BaseRepositorio;

public abstract class BaseServico<TDado> implements IBaseServico<TDado> {

    protected BaseRepositorio<TDado> repositorio;

    public BaseServico() {

    }
    
}
