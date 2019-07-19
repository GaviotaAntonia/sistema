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
@Table(name = "detalle_horario", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "DetalleHorario.findAll", query = "SELECT d FROM DetalleHorario d")
    , @NamedQuery(name = "DetalleHorario.findByIdDetalle", query = "SELECT d FROM DetalleHorario d WHERE d.idDetalle = :idDetalle")
    , @NamedQuery(name = "DetalleHorario.findByIdTurno", query = "SELECT d FROM DetalleHorario d WHERE d.idTurno = :idTurno")
    , @NamedQuery(name = "DetalleHorario.findByMatricula", query = "SELECT d FROM DetalleHorario d WHERE d.matricula = :matricula")
    , @NamedQuery(name = "DetalleHorario.findByIdGrupo", query = "SELECT d FROM DetalleHorario d WHERE d.idGrupo = :idGrupo")
    , @NamedQuery(name = "DetalleHorario.findByIdSalon", query = "SELECT d FROM DetalleHorario d WHERE d.idSalon = :idSalon")})
public class DetalleHorario implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_detalle")
    private Integer idDetalle;
    @Column(name = "id_turno")
    private Integer idTurno;
    @Column(name = "matricula")
    private Integer matricula;
    @Column(name = "id_grupo")
    private Integer idGrupo;
    @Column(name = "id_salon")
    private Integer idSalon;

    public DetalleHorario() {
    }

    public DetalleHorario(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        Integer oldIdDetalle = this.idDetalle;
        this.idDetalle = idDetalle;
        changeSupport.firePropertyChange("idDetalle", oldIdDetalle, idDetalle);
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        Integer oldIdTurno = this.idTurno;
        this.idTurno = idTurno;
        changeSupport.firePropertyChange("idTurno", oldIdTurno, idTurno);
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        Integer oldMatricula = this.matricula;
        this.matricula = matricula;
        changeSupport.firePropertyChange("matricula", oldMatricula, matricula);
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        Integer oldIdGrupo = this.idGrupo;
        this.idGrupo = idGrupo;
        changeSupport.firePropertyChange("idGrupo", oldIdGrupo, idGrupo);
    }

    public Integer getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(Integer idSalon) {
        Integer oldIdSalon = this.idSalon;
        this.idSalon = idSalon;
        changeSupport.firePropertyChange("idSalon", oldIdSalon, idSalon);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalle != null ? idDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleHorario)) {
            return false;
        }
        DetalleHorario other = (DetalleHorario) object;
        if ((this.idDetalle == null && other.idDetalle != null) || (this.idDetalle != null && !this.idDetalle.equals(other.idDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.DetalleHorario[ idDetalle=" + idDetalle + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
