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
@Table(name = "materia")
@NamedQueries({
    @NamedQuery(name = "MateriaEntity.findAll", query = "SELECT m FROM MateriaEntity m"),
    @NamedQuery(name = "MateriaEntity.findByIdMateria", query = "SELECT m FROM MateriaEntity m WHERE m.idMateria = :idMateria"),
    @NamedQuery(name = "MateriaEntity.findByMateria", query = "SELECT m FROM MateriaEntity m WHERE m.materia = :materia"),
    @NamedQuery(name = "MateriaEntity.findByUnidadesValorativas", query = "SELECT m FROM MateriaEntity m WHERE m.unidadesValorativas = :unidadesValorativas")})
public class MateriaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materia")
    private Integer idMateria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "materia")
    private String materia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unidadesValorativas")
    private int unidadesValorativas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateria")
    private List<RegistroEntity> registroEntityList;

    public MateriaEntity() {
    }

    public MateriaEntity(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public MateriaEntity(Integer idMateria, String materia, int unidadesValorativas) {
        this.idMateria = idMateria;
        this.materia = materia;
        this.unidadesValorativas = unidadesValorativas;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getUnidadesValorativas() {
        return unidadesValorativas;
    }

    public void setUnidadesValorativas(int unidadesValorativas) {
        this.unidadesValorativas = unidadesValorativas;
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
        hash += (idMateria != null ? idMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MateriaEntity)) {
            return false;
        }
        MateriaEntity other = (MateriaEntity) object;
        if ((this.idMateria == null && other.idMateria != null) || (this.idMateria != null && !this.idMateria.equals(other.idMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.utec.entidades.MateriaEntity[ idMateria=" + idMateria + " ]";
    }
    
}
