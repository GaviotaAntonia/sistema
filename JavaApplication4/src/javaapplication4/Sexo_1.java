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
@Table(name = "sexo", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Sexo_1.findAll", query = "SELECT s FROM Sexo_1 s")
    , @NamedQuery(name = "Sexo_1.findByIdSexo", query = "SELECT s FROM Sexo_1 s WHERE s.idSexo = :idSexo")
    , @NamedQuery(name = "Sexo_1.findBySexo", query = "SELECT s FROM Sexo_1 s WHERE s.sexo = :sexo")})
public class Sexo_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_sexo")
    private Integer idSexo;
    @Column(name = "sexo")
    private String sexo;

    public Sexo_1() {
    }

    public Sexo_1(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        Integer oldIdSexo = this.idSexo;
        this.idSexo = idSexo;
        changeSupport.firePropertyChange("idSexo", oldIdSexo, idSexo);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSexo != null ? idSexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sexo_1)) {
            return false;
        }
        Sexo_1 other = (Sexo_1) object;
        if ((this.idSexo == null && other.idSexo != null) || (this.idSexo != null && !this.idSexo.equals(other.idSexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Sexo_1[ idSexo=" + idSexo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
