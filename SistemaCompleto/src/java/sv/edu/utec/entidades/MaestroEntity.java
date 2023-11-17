/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.utec.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author brand
 */
@Entity
@Table(name = "maestro")
@NamedQueries({
    @NamedQuery(name = "MaestroEntity.findAll", query = "SELECT m FROM MaestroEntity m"),
    @NamedQuery(name = "MaestroEntity.findByIdMaestro", query = "SELECT m FROM MaestroEntity m WHERE m.idMaestro = :idMaestro"),
    @NamedQuery(name = "MaestroEntity.findByNombres", query = "SELECT m FROM MaestroEntity m WHERE m.nombres = :nombres"),
    @NamedQuery(name = "MaestroEntity.findByApellidos", query = "SELECT m FROM MaestroEntity m WHERE m.apellidos = :apellidos")})
public class MaestroEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_maestro")
    private Integer idMaestro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String apellidos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMaestro")
    private List<RegistroEntity> registroEntityList;

    public MaestroEntity() {
    }

    public MaestroEntity(Integer idMaestro) {
        this.idMaestro = idMaestro;
    }

    public MaestroEntity(Integer idMaestro, String nombres, String apellidos) {
        this.idMaestro = idMaestro;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Integer getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(Integer idMaestro) {
        this.idMaestro = idMaestro;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<RegistroEntity> getRegistroEntityList() {
        return registroEntityList;
    }

    public void setRegistroEntityList(List<RegistroEntity> registroEntityList) {
        this.registroEntityList = registroEntityList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaestro != null ? idMaestro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaestroEntity)) {
            return false;
        }
        MaestroEntity other = (MaestroEntity) object;
        if ((this.idMaestro == null && other.idMaestro != null) || (this.idMaestro != null && !this.idMaestro.equals(other.idMaestro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.utec.entidades.MaestroEntity[ idMaestro=" + idMaestro + " ]";
    }
    
}
