/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package sv.edu.utec.modelos;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import sv.edu.utec.beans.MateriaEntityFacadeLocal;
import sv.edu.utec.entidades.MateriaEntity;

/**
 *
 * @author brand
 */
@Named(value = "materiaBean")
@SessionScoped
public class MateriaBean implements Serializable {

    @EJB
    private MateriaEntityFacadeLocal materiaFacade;
    
    private List<MateriaEntity> listaMaterias;
    
    //para las opciones de busqueda filtrada
    private List<MateriaEntity> materiaSeleccionada;
    private MateriaEntity materia;
    
    public MateriaBean() {
    }
    
    //Getters and Setters

    public List<MateriaEntity> getListaMaterias() {
        this.listaMaterias = materiaFacade.findAll();
         System.out.println("getListaMaterias() ejecutado. Número de materias: " + listaMaterias.size());
        return listaMaterias;
    }

    public void setListaMaterias(List<MateriaEntity> listamaterias) {
        this.listaMaterias = listamaterias;
    }

    public List<MateriaEntity> getMateriaSeleccionada() {
        
        return materiaSeleccionada;
    }

    public void setMateriaSeleccionada(List<MateriaEntity> materiaSeleccionada) {
        this.materiaSeleccionada = materiaSeleccionada;
    }

    public MateriaEntity getMateria() {
        return materia;
    }

    public void setMateria(MateriaEntity materia) {
        this.materia = materia;
    }
    
    //Metodo para realizar los filtros
    public boolean hasMateriaSeleccionada(){
        return this.materiaSeleccionada != null && this.materiaSeleccionada.isEmpty();
    }
    
    @PostConstruct
    public void init(){
        this.materia = new MateriaEntity();
        this.materiaSeleccionada = new ArrayList<>();
    }
    
    public String insertarMateria(){
        materiaFacade.create(materia);
        
        //Variable de tipo "Flash" que se consumira en la vista
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("Exito", "Materia agregada exitosamente");
        
        //Para hacer una redireccion al cliente
        return "/materias/listarMaterias?faces-redirect=true";
    }
    
    public void modificarMateria(){
        if(this.materia.getIdMateria() != null){
            materiaFacade.edit(materia);
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Materia Actualizada"));
        }
        
    }
    
}
