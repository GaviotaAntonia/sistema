/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Alejandro
 */
@Entity
@Table(name = "especial", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Especial.findAll", query = "SELECT e FROM Especial e")
    , @NamedQuery(name = "Especial.findByIdEspecial", query = "SELECT e FROM Especial e WHERE e.idEspecial = :idEspecial")
    , @NamedQuery(name = "Especial.findByMatricula", query = "SELECT e FROM Especial e WHERE e.matricula = :matricula")
    , @NamedQuery(name = "Especial.findByIdMateria", query = "SELECT e FROM Especial e WHERE e.idMateria = :idMateria")
    , @NamedQuery(name = "Especial.findByIdDocente", query = "SELECT e FROM Especial e WHERE e.idDocente = :idDocente")
    , @NamedQuery(name = "Especial.findByCalificacion", query = "SELECT e FROM Especial e WHERE e.calificacion = :calificacion")})
public class Especial implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_especial")
    private Integer idEspecial;
    @Column(name = "matricula")
    private Integer matricula;
    @Column(name = "id_materia")
    private Integer idMateria;
    @Column(name = "id_docente")
    private Integer idDocente;
    @Column(name = "calificacion")
    private String calificacion;

    public Especial() {
    }

    public Especial(Integer idEspecial) {
        this.idEspecial = idEspecial;
    }

    public Integer getIdEspecial() {
        return idEspecial;
    }

    public void setIdEspecial(Integer idEspecial) {
        Integer oldIdEspecial = this.idEspecial;
        this.idEspecial = idEspecial;
        changeSupport.firePropertyChange("idEspecial", oldIdEspecial, idEspecial);
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        Integer oldMatricula = this.matricula;
        this.matricula = matricula;
        changeSupport.firePropertyChange("matricula", oldMatricula, matricula);
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        Integer oldIdMateria = this.idMateria;
        this.idMateria = idMateria;
        changeSupport.firePropertyChange("idMateria", oldIdMateria, idMateria);
    }

    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        Integer oldIdDocente = this.idDocente;
        this.idDocente = idDocente;
        changeSupport.firePropertyChange("idDocente", oldIdDocente, idDocente);
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        String oldCalificacion = this.calificacion;
        this.calificacion = calificacion;
        changeSupport.firePropertyChange("calificacion", oldCalificacion, calificacion);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEspecial != null ? idEspecial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especial)) {
            return false;
        }
        Especial other = (Especial) object;
        if ((this.idEspecial == null && other.idEspecial != null) || (this.idEspecial != null && !this.idEspecial.equals(other.idEspecial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Especial[ idEspecial=" + idEspecial + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
