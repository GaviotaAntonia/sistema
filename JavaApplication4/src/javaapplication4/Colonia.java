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
@Table(name = "colonia", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Colonia.findAll", query = "SELECT c FROM Colonia c")
    , @NamedQuery(name = "Colonia.findByIdColonia", query = "SELECT c FROM Colonia c WHERE c.idColonia = :idColonia")
    , @NamedQuery(name = "Colonia.findByColonia", query = "SELECT c FROM Colonia c WHERE c.colonia = :colonia")
    , @NamedQuery(name = "Colonia.findByIdEstado", query = "SELECT c FROM Colonia c WHERE c.idEstado = :idEstado")
    , @NamedQuery(name = "Colonia.findByCodigoPostal", query = "SELECT c FROM Colonia c WHERE c.codigoPostal = :codigoPostal")})
public class Colonia implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_colonia")
    private Integer idColonia;
    @Column(name = "colonia")
    private String colonia;
    @Column(name = "id_estado")
    private Integer idEstado;
    @Column(name = "codigo_postal")
    private Integer codigoPostal;

    public Colonia() {
    }

    public Colonia(Integer idColonia) {
        this.idColonia = idColonia;
    }

    public Integer getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Integer idColonia) {
        Integer oldIdColonia = this.idColonia;
        this.idColonia = idColonia;
        changeSupport.firePropertyChange("idColonia", oldIdColonia, idColonia);
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        String oldColonia = this.colonia;
        this.colonia = colonia;
        changeSupport.firePropertyChange("colonia", oldColonia, colonia);
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        Integer oldIdEstado = this.idEstado;
        this.idEstado = idEstado;
        changeSupport.firePropertyChange("idEstado", oldIdEstado, idEstado);
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        Integer oldCodigoPostal = this.codigoPostal;
        this.codigoPostal = codigoPostal;
        changeSupport.firePropertyChange("codigoPostal", oldCodigoPostal, codigoPostal);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idColonia != null ? idColonia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colonia)) {
            return false;
        }
        Colonia other = (Colonia) object;
        if ((this.idColonia == null && other.idColonia != null) || (this.idColonia != null && !this.idColonia.equals(other.idColonia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Colonia[ idColonia=" + idColonia + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
