package main.paragon2.dao;

import br.com.rpires.dao.generic.IGenericDAO;
import br.com.rpires.domain.Venda;
import br.com.rpires.exceptions.DAOException;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, Long>{

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;


    public Venda consultarComCollection(Long id);

}
