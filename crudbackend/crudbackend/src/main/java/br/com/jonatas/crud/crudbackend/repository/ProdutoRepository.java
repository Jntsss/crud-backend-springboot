package br.com.jonatas.crud.crudbackend.repository;

import br.com.jonatas.crud.crudbackend.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}

