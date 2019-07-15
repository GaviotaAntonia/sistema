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
@Table(name = "turno_docente", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "TurnoDocente.findAll", query = "SELECT t FROM TurnoDocente t")
    , @NamedQuery(name = "TurnoDocente.findByIdTurno", query = "SELECT t FROM TurnoDocente t WHERE t.idTurno = :idTurno")
    , @NamedQuery(name = "TurnoDocente.findByTurno", query = "SELECT t FROM TurnoDocente t WHERE t.turno = :turno")
    , @NamedQuery(name = "TurnoDocente.findByDocente", query = "SELECT t FROM TurnoDocente t WHERE t.docente = :docente")
    , @NamedQuery(name = "TurnoDocente.findByHorario", query = "SELECT t FROM TurnoDocente t WHERE t.horario = :horario")})
public class TurnoDocente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_turno")
    private Integer idTurno;
    @Column(name = "turno")
    private String turno;
    @Column(name = "docente")
    private String docente;
    @Column(name = "horario")
    private String horario;

    public TurnoDocente() {
    }

    public TurnoDocente(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        Integer oldIdTurno = this.idTurno;
        this.idTurno = idTurno;
        changeSupport.firePropertyChange("idTurno", oldIdTurno, idTurno);
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        String oldTurno = this.turno;
        this.turno = turno;
        changeSupport.firePropertyChange("turno", oldTurno, turno);
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        String oldDocente = this.docente;
        this.docente = docente;
        changeSupport.firePropertyChange("docente", oldDocente, docente);
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
        hash += (idTurno != null ? idTurno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TurnoDocente)) {
            return false;
        }
        TurnoDocente other = (TurnoDocente) object;
        if ((this.idTurno == null && other.idTurno != null) || (this.idTurno != null && !this.idTurno.equals(other.idTurno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.TurnoDocente[ idTurno=" + idTurno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
