package br.com.casadocodigo.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.loja.models.Produto;

@Repository
@Transactional
public class ProdutoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public void gravar(Produto p){
		manager.persist(p);
	}
	
	public Produto find(int id){
	    return manager.find(Produto.class, id);
	}
	
	public List<Produto> listar(){
	    return manager.createQuery("select p from Produto p").getResultList();
	}
}
