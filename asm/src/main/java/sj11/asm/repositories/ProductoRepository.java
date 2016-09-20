/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sj11.asm.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import sj11.asm.entities.Producto;

/**
 *
 * @author SeRGiO11
 */
public interface ProductoRepository extends CrudRepository<Producto, Long> {


    @SuppressWarnings("unchecked")
	public Producto save(Producto producto);

    List<Producto> findAll();
}
