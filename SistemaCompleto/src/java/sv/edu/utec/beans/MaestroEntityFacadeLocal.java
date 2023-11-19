/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sv.edu.utec.beans;

import java.util.List;
import javax.ejb.Local;
import sv.edu.utec.entidades.MaestroEntity;

/**
 *
 * @author brand
 */
@Local
public interface MaestroEntityFacadeLocal {

    void create(MaestroEntity maestroEntity);

    void edit(MaestroEntity maestroEntity);

    void remove(MaestroEntity maestroEntity);

    MaestroEntity find(Object id);

    List<MaestroEntity> findAll();

    List<MaestroEntity> findRange(int[] range);

    int count();
    
}
