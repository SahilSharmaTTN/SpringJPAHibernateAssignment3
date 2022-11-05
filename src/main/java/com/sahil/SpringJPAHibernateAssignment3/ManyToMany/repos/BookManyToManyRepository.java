package com.sahil.SpringJPAHibernateAssignment3.ManyToMany.repos;

import com.sahil.SpringJPAHibernateAssignment3.ManyToMany.entities.BookManyToMany;
import org.springframework.data.repository.CrudRepository;

public interface BookManyToManyRepository extends CrudRepository<BookManyToMany,Integer> {

}
