package com.sahil.SpringJPAHibernateAssignment3.OneToOne.repos;

import com.sahil.SpringJPAHibernateAssignment3.OneToOne.entities.AuthorOneToOne;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOneToOneRepository extends CrudRepository<AuthorOneToOne,Integer> {

}
