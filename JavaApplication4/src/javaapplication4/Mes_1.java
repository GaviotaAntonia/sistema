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
@Table(name = "mes", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Mes_1.findAll", query = "SELECT m FROM Mes_1 m")
    , @NamedQuery(name = "Mes_1.findByIdMes", query = "SELECT m FROM Mes_1 m WHERE m.idMes = :idMes")
    , @NamedQuery(name = "Mes_1.findByMes", query = "SELECT m FROM Mes_1 m WHERE m.mes = :mes")})
public class Mes_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_mes")
    private Integer idMes;
    @Column(name = "mes")
    private String mes;

    public Mes_1() {
    }

    public Mes_1(Integer idMes) {
        this.idMes = idMes;
    }

    public Integer getIdMes() {
        return idMes;
    }

    public void setIdMes(Integer idMes) {
        Integer oldIdMes = this.idMes;
        this.idMes = idMes;
        changeSupport.firePropertyChange("idMes", oldIdMes, idMes);
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        String oldMes = this.mes;
        this.mes = mes;
        changeSupport.firePropertyChange("mes", oldMes, mes);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMes != null ? idMes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mes_1)) {
            return false;
        }
        Mes_1 other = (Mes_1) object;
        if ((this.idMes == null && other.idMes != null) || (this.idMes != null && !this.idMes.equals(other.idMes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Mes_1[ idMes=" + idMes + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
