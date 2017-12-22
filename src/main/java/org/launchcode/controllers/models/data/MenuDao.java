package org.launchcode.controllers.models.data;


import org.launchcode.controllers.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface MenuDao extends CrudRepository<Menu, Integer> {
}
