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
@Table(name = "cede", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Cede_1.findAll", query = "SELECT c FROM Cede_1 c")
    , @NamedQuery(name = "Cede_1.findByIdCede", query = "SELECT c FROM Cede_1 c WHERE c.idCede = :idCede")
    , @NamedQuery(name = "Cede_1.findByNombreCede", query = "SELECT c FROM Cede_1 c WHERE c.nombreCede = :nombreCede")
    , @NamedQuery(name = "Cede_1.findByIdColonia", query = "SELECT c FROM Cede_1 c WHERE c.idColonia = :idColonia")
    , @NamedQuery(name = "Cede_1.findByNumero", query = "SELECT c FROM Cede_1 c WHERE c.numero = :numero")
    , @NamedQuery(name = "Cede_1.findByCodigoPostal", query = "SELECT c FROM Cede_1 c WHERE c.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "Cede_1.findByCorreo", query = "SELECT c FROM Cede_1 c WHERE c.correo = :correo")
    , @NamedQuery(name = "Cede_1.findByIdDirector", query = "SELECT c FROM Cede_1 c WHERE c.idDirector = :idDirector")
    , @NamedQuery(name = "Cede_1.findByIdSalon", query = "SELECT c FROM Cede_1 c WHERE c.idSalon = :idSalon")
    , @NamedQuery(name = "Cede_1.findByIdEstado", query = "SELECT c FROM Cede_1 c WHERE c.idEstado = :idEstado")
    , @NamedQuery(name = "Cede_1.findByCalle", query = "SELECT c FROM Cede_1 c WHERE c.calle = :calle")})
public class Cede_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_cede")
    private Integer idCede;
    @Column(name = "nombre_cede")
    private String nombreCede;
    @Column(name = "id_colonia")
    private Integer idColonia;
    @Column(name = "numero")
    private String numero;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Column(name = "correo")
    private String correo;
    @Column(name = "id_director")
    private Integer idDirector;
    @Column(name = "id_salon")
    private Integer idSalon;
    @Column(name = "id_estado")
    private Integer idEstado;
    @Column(name = "calle")
    private String calle;

    public Cede_1() {
    }

    public Cede_1(Integer idCede) {
        this.idCede = idCede;
    }

    public Integer getIdCede() {
        return idCede;
    }

    public void setIdCede(Integer idCede) {
        Integer oldIdCede = this.idCede;
        this.idCede = idCede;
        changeSupport.firePropertyChange("idCede", oldIdCede, idCede);
    }

    public String getNombreCede() {
        return nombreCede;
    }

    public void setNombreCede(String nombreCede) {
        String oldNombreCede = this.nombreCede;
        this.nombreCede = nombreCede;
        changeSupport.firePropertyChange("nombreCede", oldNombreCede, nombreCede);
    }

    public Integer getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Integer idColonia) {
        Integer oldIdColonia = this.idColonia;
        this.idColonia = idColonia;
        changeSupport.firePropertyChange("idColonia", oldIdColonia, idColonia);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        String oldCodigoPostal = this.codigoPostal;
        this.codigoPostal = codigoPostal;
        changeSupport.firePropertyChange("codigoPostal", oldCodigoPostal, codigoPostal);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        String oldCorreo = this.correo;
        this.correo = correo;
        changeSupport.firePropertyChange("correo", oldCorreo, correo);
    }

    public Integer getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(Integer idDirector) {
        Integer oldIdDirector = this.idDirector;
        this.idDirector = idDirector;
        changeSupport.firePropertyChange("idDirector", oldIdDirector, idDirector);
    }

    public Integer getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(Integer idSalon) {
        Integer oldIdSalon = this.idSalon;
        this.idSalon = idSalon;
        changeSupport.firePropertyChange("idSalon", oldIdSalon, idSalon);
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        Integer oldIdEstado = this.idEstado;
        this.idEstado = idEstado;
        changeSupport.firePropertyChange("idEstado", oldIdEstado, idEstado);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        String oldCalle = this.calle;
        this.calle = calle;
        changeSupport.firePropertyChange("calle", oldCalle, calle);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCede != null ? idCede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cede_1)) {
            return false;
        }
        Cede_1 other = (Cede_1) object;
        if ((this.idCede == null && other.idCede != null) || (this.idCede != null && !this.idCede.equals(other.idCede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Cede_1[ idCede=" + idCede + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
