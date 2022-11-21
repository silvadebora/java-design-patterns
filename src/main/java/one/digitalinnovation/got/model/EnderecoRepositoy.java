package one.digitalinnovation.got.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface EnderecoRepositoy extends CrudRepository<Endereco, Long> {



}
