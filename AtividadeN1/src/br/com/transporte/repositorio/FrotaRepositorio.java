package br.com.transporte.repositorio;

import br.com.transporte.dominio.Frota;
import br.com.transporte.fakeDB.FrotaFakeDB;

public class FrotaRepositorio extends BaseRepositorio<Frota> {

    public FrotaRepositorio() {
        super();
        this.tabela = new FrotaFakeDB().getTabela();
    }

    @Override
    public Frota Create(Frota obj) {

        int chave = 0;

        if (this.tabela.size() == 0) {
            chave++;
        } else {
            int tamanho = this.tabela.size();
            chave = this.tabela.get(tamanho - 1).getCodigo() + 1;
        }

        obj.setCodigo(chave);
        this.tabela.add(obj);

        return obj;

    }

    @Override
    public Frota Read(int chave) {

        Frota res = new Frota();

        for (Frota tupla : this.tabela) {

            if (tupla.getCodigo() == chave) {
                res = tupla;
                break;
            } else {
                res = null;
            }

        }

        return res;

    }

    @Override
    public Frota Update(Frota obj) {

        Frota alteracao = this.Read(obj.getCodigo());

        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }

        return alteracao;

    }

}
