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
 * @author ARV
 */
@Entity
@Table(name = "calendario", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Calendario_1.findAll", query = "SELECT c FROM Calendario_1 c")
    , @NamedQuery(name = "Calendario_1.findByIdCalendario", query = "SELECT c FROM Calendario_1 c WHERE c.idCalendario = :idCalendario")
    , @NamedQuery(name = "Calendario_1.findByIdGrupo", query = "SELECT c FROM Calendario_1 c WHERE c.idGrupo = :idGrupo")
    , @NamedQuery(name = "Calendario_1.findByIdDia", query = "SELECT c FROM Calendario_1 c WHERE c.idDia = :idDia")
    , @NamedQuery(name = "Calendario_1.findByIdMateria", query = "SELECT c FROM Calendario_1 c WHERE c.idMateria = :idMateria")
    , @NamedQuery(name = "Calendario_1.findByHorario", query = "SELECT c FROM Calendario_1 c WHERE c.horario = :horario")})
public class Calendario_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_calendario")
    private Integer idCalendario;
    @Column(name = "id_grupo")
    private Integer idGrupo;
    @Column(name = "id_dia")
    private Integer idDia;
    @Column(name = "id_materia")
    private Integer idMateria;
    @Column(name = "horario")
    private String horario;

    public Calendario_1() {
    }

    public Calendario_1(Integer idCalendario) {
        this.idCalendario = idCalendario;
    }

    public Integer getIdCalendario() {
        return idCalendario;
    }

    public void setIdCalendario(Integer idCalendario) {
        Integer oldIdCalendario = this.idCalendario;
        this.idCalendario = idCalendario;
        changeSupport.firePropertyChange("idCalendario", oldIdCalendario, idCalendario);
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        Integer oldIdGrupo = this.idGrupo;
        this.idGrupo = idGrupo;
        changeSupport.firePropertyChange("idGrupo", oldIdGrupo, idGrupo);
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        String oldHorario = this.horario;
        this.horario = horario;
        changeSupport.firePropertyChange("horario", oldHorario, horario);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCalendario != null ? idCalendario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calendario_1)) {
            return false;
        }
        Calendario_1 other = (Calendario_1) object;
        if ((this.idCalendario == null && other.idCalendario != null) || (this.idCalendario != null && !this.idCalendario.equals(other.idCalendario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Calendario_1[ idCalendario=" + idCalendario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
