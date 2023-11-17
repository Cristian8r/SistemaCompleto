/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.utec.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.utec.entidades.MateriaEntity;

/**
 *
 * @author brand
 */
@Stateless
public class MateriaEntityFacade extends AbstractFacade<MateriaEntity> {

    @PersistenceContext(unitName = "SistemaCompletoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MateriaEntityFacade() {
        super(MateriaEntity.class);
    }
    
}
