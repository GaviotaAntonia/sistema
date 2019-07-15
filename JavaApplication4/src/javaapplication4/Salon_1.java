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
@Table(name = "salon", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Salon_1.findAll", query = "SELECT s FROM Salon_1 s")
    , @NamedQuery(name = "Salon_1.findByIdSalon", query = "SELECT s FROM Salon_1 s WHERE s.idSalon = :idSalon")
    , @NamedQuery(name = "Salon_1.findBySalon", query = "SELECT s FROM Salon_1 s WHERE s.salon = :salon")})
public class Salon_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_salon")
    private Integer idSalon;
    @Column(name = "salon")
    private String salon;

    public Salon_1() {
    }

    public Salon_1(Integer idSalon) {
        this.idSalon = idSalon;
    }

    public Integer getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(Integer idSalon) {
        Integer oldIdSalon = this.idSalon;
        this.idSalon = idSalon;
        changeSupport.firePropertyChange("idSalon", oldIdSalon, idSalon);
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        String oldSalon = this.salon;
        this.salon = salon;
        changeSupport.firePropertyChange("salon", oldSalon, salon);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSalon != null ? idSalon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salon_1)) {
            return false;
        }
        Salon_1 other = (Salon_1) object;
        if ((this.idSalon == null && other.idSalon != null) || (this.idSalon != null && !this.idSalon.equals(other.idSalon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Salon_1[ idSalon=" + idSalon + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
