/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package sv.edu.utec.modelos;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import sv.edu.utec.beans.MaestroEntityFacadeLocal;
import sv.edu.utec.entidades.MaestroEntity;

/**
 *
 * @author brand
 */
@Named(value = "maestroBean")
@SessionScoped
public class MaestroBean implements Serializable {

    @EJB
   private MaestroEntityFacadeLocal maestroFacade;
   
   private List<MaestroEntity> listaMaestros;
   private MaestroEntity maestro;
   
     
    public MaestroBean() {
    }
   //Geters y setters.

    public List<MaestroEntity> getListaMaestros() {
        this.listaMaestros = maestroFacade.findAll();
        return listaMaestros;
    }

    public void setListaMaestros(List<MaestroEntity> listaMaestros) {
        this.listaMaestros = listaMaestros;
    }

    public MaestroEntity getMaestro() {
        return maestro;
    }

    public void setMaestro(MaestroEntity maestro) {
        this.maestro = maestro;
    }
    
    @PostConstruct
    public void init(){
        this.maestro = new MaestroEntity();
    }
    
}
