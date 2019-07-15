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
@Table(name = "tipo_certificado", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "TipoCertificado.findAll", query = "SELECT t FROM TipoCertificado t")
    , @NamedQuery(name = "TipoCertificado.findByIdCertificado", query = "SELECT t FROM TipoCertificado t WHERE t.idCertificado = :idCertificado")
    , @NamedQuery(name = "TipoCertificado.findByCertificado", query = "SELECT t FROM TipoCertificado t WHERE t.certificado = :certificado")})
public class TipoCertificado implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_certificado")
    private Integer idCertificado;
    @Column(name = "certificado")
    private String certificado;

    public TipoCertificado() {
    }

    public TipoCertificado(Integer idCertificado) {
        this.idCertificado = idCertificado;
    }

    public Integer getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(Integer idCertificado) {
        Integer oldIdCertificado = this.idCertificado;
        this.idCertificado = idCertificado;
        changeSupport.firePropertyChange("idCertificado", oldIdCertificado, idCertificado);
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        String oldCertificado = this.certificado;
        this.certificado = certificado;
        changeSupport.firePropertyChange("certificado", oldCertificado, certificado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCertificado != null ? idCertificado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCertificado)) {
            return false;
        }
        TipoCertificado other = (TipoCertificado) object;
        if ((this.idCertificado == null && other.idCertificado != null) || (this.idCertificado != null && !this.idCertificado.equals(other.idCertificado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.TipoCertificado[ idCertificado=" + idCertificado + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
