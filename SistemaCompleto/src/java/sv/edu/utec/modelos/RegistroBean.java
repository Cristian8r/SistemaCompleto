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
import sv.edu.utec.beans.RegistroEntityFacade;
import sv.edu.utec.entidades.MaestroEntity;
import sv.edu.utec.entidades.MateriaEntity;
import sv.edu.utec.entidades.RegistroEntity;

/**
 *
 * @author brand
 */
@Named(value = "registroBean")
@SessionScoped
public class RegistroBean implements Serializable {

    @EJB
    private RegistroEntityFacade registroFacade;
    
    private List<RegistroEntity> listaRegistros;
    private RegistroEntity registro;
    private MateriaEntity materia;
    private MaestroEntity maestro;
    private String msj;
    
    public RegistroBean() {
    }
    
    //Geters and Setters

    public List<RegistroEntity> getListaRegistros() {
        this.listaRegistros = registroFacade.findAll();
        return listaRegistros;
    }

    public void setListaRegistros(List<RegistroEntity> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }

    public RegistroEntity getRegistro() {
        return registro;
    }

    public void setRegistro(RegistroEntity registro) {
        this.registro = registro;
    }

    public MateriaEntity getMateria() {
        return materia;
    }

    public void setMateria(MateriaEntity materia) {
        this.materia = materia;
    }

    public MaestroEntity getMaestro() {
        return maestro;
    }

    public void setMaestro(MaestroEntity maestro) {
        this.maestro = maestro;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }
    
    @PostConstruct
    public void init(){
        this.maestro = new MaestroEntity();
        this.materia = new MateriaEntity();
        this.registro = new RegistroEntity();
    }
    
}
