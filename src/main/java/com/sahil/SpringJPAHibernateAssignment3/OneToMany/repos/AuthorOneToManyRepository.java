package com.sahil.SpringJPAHibernateAssignment3.OneToMany.repos;

import com.sahil.SpringJPAHibernateAssignment3.OneToMany.entities.AuthorOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOneToManyRepository extends JpaRepository<AuthorOneToMany,Integer> {

}
