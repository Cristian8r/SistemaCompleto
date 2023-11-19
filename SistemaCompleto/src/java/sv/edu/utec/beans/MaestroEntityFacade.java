/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.utec.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.utec.entidades.MaestroEntity;

/**
 *
 * @author brand
 */
@Stateless
public class MaestroEntityFacade extends AbstractFacade<MaestroEntity> {

    @PersistenceContext(unitName = "SistemaCompletoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MaestroEntityFacade() {
        super(MaestroEntity.class);
    }
    
}
