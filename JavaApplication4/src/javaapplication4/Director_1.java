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
@Table(name = "director", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Director_1.findAll", query = "SELECT d FROM Director_1 d")
    , @NamedQuery(name = "Director_1.findByIdDirector", query = "SELECT d FROM Director_1 d WHERE d.idDirector = :idDirector")
    , @NamedQuery(name = "Director_1.findByNombre", query = "SELECT d FROM Director_1 d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Director_1.findByApellidopat", query = "SELECT d FROM Director_1 d WHERE d.apellidopat = :apellidopat")
    , @NamedQuery(name = "Director_1.findByApellidomat", query = "SELECT d FROM Director_1 d WHERE d.apellidomat = :apellidomat")
    , @NamedQuery(name = "Director_1.findByTelefono", query = "SELECT d FROM Director_1 d WHERE d.telefono = :telefono")
    , @NamedQuery(name = "Director_1.findByCorreo", query = "SELECT d FROM Director_1 d WHERE d.correo = :correo")
    , @NamedQuery(name = "Director_1.findByIdColonia", query = "SELECT d FROM Director_1 d WHERE d.idColonia = :idColonia")
    , @NamedQuery(name = "Director_1.findByCalle", query = "SELECT d FROM Director_1 d WHERE d.calle = :calle")
    , @NamedQuery(name = "Director_1.findByNumero", query = "SELECT d FROM Director_1 d WHERE d.numero = :numero")
    , @NamedQuery(name = "Director_1.findByCodigoPostal", query = "SELECT d FROM Director_1 d WHERE d.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "Director_1.findByIdSexo", query = "SELECT d FROM Director_1 d WHERE d.idSexo = :idSexo")
    , @NamedQuery(name = "Director_1.findByEdad", query = "SELECT d FROM Director_1 d WHERE d.edad = :edad")
    , @NamedQuery(name = "Director_1.findByHora", query = "SELECT d FROM Director_1 d WHERE d.hora = :hora")})
public class Director_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_director")
    private Integer idDirector;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidopat")
    private String apellidopat;
    @Column(name = "apellidomat")
    private String apellidomat;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "correo")
    private String correo;
    @Column(name = "id_colonia")
    private Integer idColonia;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private String numero;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Column(name = "id_sexo")
    private Integer idSexo;
    @Column(name = "edad")
    private String edad;
    @Column(name = "hora")
    private String hora;

    public Director_1() {
    }

    public Director_1(Integer idDirector) {
        this.idDirector = idDirector;
    }

    public Integer getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(Integer idDirector) {
        Integer oldIdDirector = this.idDirector;
        this.idDirector = idDirector;
        changeSupport.firePropertyChange("idDirector", oldIdDirector, idDirector);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApellidopat() {
        return apellidopat;
    }

    public void setApellidopat(String apellidopat) {
        String oldApellidopat = this.apellidopat;
        this.apellidopat = apellidopat;
        changeSupport.firePropertyChange("apellidopat", oldApellidopat, apellidopat);
    }

    public String getApellidomat() {
        return apellidomat;
    }

    public void setApellidomat(String apellidomat) {
        String oldApellidomat = this.apellidomat;
        this.apellidomat = apellidomat;
        changeSupport.firePropertyChange("apellidomat", oldApellidomat, apellidomat);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        String oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        String oldCorreo = this.correo;
        this.correo = correo;
        changeSupport.firePropertyChange("correo", oldCorreo, correo);
    }

    public Integer getIdColonia() {
        return idColonia;
    }

    public void setIdColonia(Integer idColonia) {
        Integer oldIdColonia = this.idColonia;
        this.idColonia = idColonia;
        changeSupport.firePropertyChange("idColonia", oldIdColonia, idColonia);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        String oldCalle = this.calle;
        this.calle = calle;
        changeSupport.firePropertyChange("calle", oldCalle, calle);
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

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        Integer oldIdSexo = this.idSexo;
        this.idSexo = idSexo;
        changeSupport.firePropertyChange("idSexo", oldIdSexo, idSexo);
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        String oldEdad = this.edad;
        this.edad = edad;
        changeSupport.firePropertyChange("edad", oldEdad, edad);
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        String oldHora = this.hora;
        this.hora = hora;
        changeSupport.firePropertyChange("hora", oldHora, hora);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDirector != null ? idDirector.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Director_1)) {
            return false;
        }
        Director_1 other = (Director_1) object;
        if ((this.idDirector == null && other.idDirector != null) || (this.idDirector != null && !this.idDirector.equals(other.idDirector))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Director_1[ idDirector=" + idDirector + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
