/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.utec.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author brand
 */
@Entity
@Table(name = "registro")
@NamedQueries({
    @NamedQuery(name = "RegistroEntity.findAll", query = "SELECT r FROM RegistroEntity r"),
    @NamedQuery(name = "RegistroEntity.findByIdRegistro", query = "SELECT r FROM RegistroEntity r WHERE r.idRegistro = :idRegistro"),
    @NamedQuery(name = "RegistroEntity.findByFecha", query = "SELECT r FROM RegistroEntity r WHERE r.fecha = :fecha")})
public class RegistroEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_registro")
    private Integer idRegistro;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "id_maestro", referencedColumnName = "id_maestro")
    @ManyToOne(optional = false)
    private MaestroEntity idMaestro;
    @JoinColumn(name = "id_materia", referencedColumnName = "id_materia")
    @ManyToOne(optional = false)
    private MateriaEntity idMateria;

    public RegistroEntity() {
    }

    public RegistroEntity(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public RegistroEntity(Integer idRegistro, Date fecha) {
        this.idRegistro = idRegistro;
        this.fecha = fecha;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public MaestroEntity getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(MaestroEntity idMaestro) {
        this.idMaestro = idMaestro;
    }

    public MateriaEntity getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(MateriaEntity idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroEntity)) {
            return false;
        }
        RegistroEntity other = (RegistroEntity) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.utec.entidades.RegistroEntity[ idRegistro=" + idRegistro + " ]";
    }
    
}
