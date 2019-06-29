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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "status", catalog = "dbdistribuida", schema = "")
@NamedQueries({
    @NamedQuery(name = "Status_1.findAll", query = "SELECT s FROM Status_1 s")
    , @NamedQuery(name = "Status_1.findByIdStatus", query = "SELECT s FROM Status_1 s WHERE s.idStatus = :idStatus")
    , @NamedQuery(name = "Status_1.findByStatus", query = "SELECT s FROM Status_1 s WHERE s.status = :status")})
public class Status_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_status")
    private Integer idStatus;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;

    public Status_1() {
    }

    public Status_1(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public Status_1(Integer idStatus, String status) {
        this.idStatus = idStatus;
        this.status = status;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        Integer oldIdStatus = this.idStatus;
        this.idStatus = idStatus;
        changeSupport.firePropertyChange("idStatus", oldIdStatus, idStatus);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStatus != null ? idStatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Status_1)) {
            return false;
        }
        Status_1 other = (Status_1) object;
        if ((this.idStatus == null && other.idStatus != null) || (this.idStatus != null && !this.idStatus.equals(other.idStatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Status_1[ idStatus=" + idStatus + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
