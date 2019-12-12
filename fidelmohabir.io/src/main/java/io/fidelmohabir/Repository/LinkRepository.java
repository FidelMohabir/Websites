package io.fidelmohabir.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import io.fidelmohabir.Entity.Link;

@RepositoryRestResource(path = "links")
public interface LinkRepository extends CrudRepository<Link, Long>{

}
