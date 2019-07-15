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
@Table(name = "horario", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h")
    , @NamedQuery(name = "Horario.findByIdHorario", query = "SELECT h FROM Horario h WHERE h.idHorario = :idHorario")
    , @NamedQuery(name = "Horario.findByIdDia", query = "SELECT h FROM Horario h WHERE h.idDia = :idDia")
    , @NamedQuery(name = "Horario.findByIdMateria", query = "SELECT h FROM Horario h WHERE h.idMateria = :idMateria")
    , @NamedQuery(name = "Horario.findByHora", query = "SELECT h FROM Horario h WHERE h.hora = :hora")
    , @NamedQuery(name = "Horario.findByIdDocente", query = "SELECT h FROM Horario h WHERE h.idDocente = :idDocente")})
public class Horario implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_horario")
    private Integer idHorario;
    @Column(name = "id_dia")
    private Integer idDia;
    @Column(name = "id_materia")
    private Integer idMateria;
    @Column(name = "hora")
    private String hora;
    @Column(name = "id_docente")
    private Integer idDocente;

    public Horario() {
    }

    public Horario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        Integer oldIdHorario = this.idHorario;
        this.idHorario = idHorario;
        changeSupport.firePropertyChange("idHorario", oldIdHorario, idHorario);
    }

    public Integer getIdDia() {
        return idDia;
    }

    public void setIdDia(Integer idDia) {
        Integer oldIdDia = this.idDia;
        this.idDia = idDia;
        changeSupport.firePropertyChange("idDia", oldIdDia, idDia);
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        Integer oldIdMateria = this.idMateria;
        this.idMateria = idMateria;
        changeSupport.firePropertyChange("idMateria", oldIdMateria, idMateria);
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        String oldHora = this.hora;
        this.hora = hora;
        changeSupport.firePropertyChange("hora", oldHora, hora);
    }

    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        Integer oldIdDocente = this.idDocente;
        this.idDocente = idDocente;
        changeSupport.firePropertyChange("idDocente", oldIdDocente, idDocente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHorario != null ? idHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.idHorario == null && other.idHorario != null) || (this.idHorario != null && !this.idHorario.equals(other.idHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Horario[ idHorario=" + idHorario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
