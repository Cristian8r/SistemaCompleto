/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sv.edu.utec.beans;

import java.util.List;
import javax.ejb.Local;
import sv.edu.utec.entidades.MateriaEntity;

/**
 *
 * @author brand
 */
@Local
public interface MateriaEntityFacadeLocal {

    void create(MateriaEntity materiaEntity);

    void edit(MateriaEntity materiaEntity);

    void remove(MateriaEntity materiaEntity);

    MateriaEntity find(Object id);

    List<MateriaEntity> findAll();

    List<MateriaEntity> findRange(int[] range);

    int count();
    
}
