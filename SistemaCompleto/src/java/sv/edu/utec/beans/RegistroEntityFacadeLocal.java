/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sv.edu.utec.beans;

import java.util.List;
import javax.ejb.Local;
import sv.edu.utec.entidades.RegistroEntity;

/**
 *
 * @author brand
 */
@Local
public interface RegistroEntityFacadeLocal {

    void create(RegistroEntity registroEntity);

    void edit(RegistroEntity registroEntity);

    void remove(RegistroEntity registroEntity);

    RegistroEntity find(Object id);

    List<RegistroEntity> findAll();

    List<RegistroEntity> findRange(int[] range);

    int count();
    
}
