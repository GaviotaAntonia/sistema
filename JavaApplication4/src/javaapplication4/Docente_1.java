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
@Table(name = "docente", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Docente_1.findAll", query = "SELECT d FROM Docente_1 d")
    , @NamedQuery(name = "Docente_1.findByIdDocente", query = "SELECT d FROM Docente_1 d WHERE d.idDocente = :idDocente")
    , @NamedQuery(name = "Docente_1.findByNombre", query = "SELECT d FROM Docente_1 d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Docente_1.findByApellidopat", query = "SELECT d FROM Docente_1 d WHERE d.apellidopat = :apellidopat")
    , @NamedQuery(name = "Docente_1.findByApellidomat", query = "SELECT d FROM Docente_1 d WHERE d.apellidomat = :apellidomat")
    , @NamedQuery(name = "Docente_1.findByIdTurno", query = "SELECT d FROM Docente_1 d WHERE d.idTurno = :idTurno")
    , @NamedQuery(name = "Docente_1.findByIdSexo", query = "SELECT d FROM Docente_1 d WHERE d.idSexo = :idSexo")
    , @NamedQuery(name = "Docente_1.findByCurp", query = "SELECT d FROM Docente_1 d WHERE d.curp = :curp")
    , @NamedQuery(name = "Docente_1.findByIdColonia", query = "SELECT d FROM Docente_1 d WHERE d.idColonia = :idColonia")
    , @NamedQuery(name = "Docente_1.findByCalle", query = "SELECT d FROM Docente_1 d WHERE d.calle = :calle")
    , @NamedQuery(name = "Docente_1.findByNumero", query = "SELECT d FROM Docente_1 d WHERE d.numero = :numero")
    , @NamedQuery(name = "Docente_1.findByCodigoPostal", query = "SELECT d FROM Docente_1 d WHERE d.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "Docente_1.findByCorreo", query = "SELECT d FROM Docente_1 d WHERE d.correo = :correo")
    , @NamedQuery(name = "Docente_1.findByTelefono", query = "SELECT d FROM Docente_1 d WHERE d.telefono = :telefono")
    , @NamedQuery(name = "Docente_1.findByIdSalon", query = "SELECT d FROM Docente_1 d WHERE d.idSalon = :idSalon")})
public class Docente_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_docente")
    private Integer idDocente;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidopat")
    private String apellidopat;
    @Column(name = "apellidomat")
    private String apellidomat;
    @Column(name = "id_turno")
    private Integer idTurno;
    @Column(name = "id_sexo")
    private Integer idSexo;
    @Column(name = "curp")
    private String curp;
    @Column(name = "id_colonia")
    private Integer idColonia;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private String numero;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "id_salon")
    private Integer idSalon;

    public Docente_1() {
    }

    public Docente_1(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        Integer oldIdDocente = this.idDocente;
        this.idDocente = idDocente;
        changeSupport.firePropertyChange("idDocente", oldIdDocente, idDocente);
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

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        Integer oldIdTurno = this.idTurno;
        this.idTurno = idTurno;
        changeSupport.firePropertyChange("idTurno", oldIdTurno, idTurno);
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        Integer oldIdSexo = this.idSexo;
        this.idSexo = idSexo;
        changeSupport.firePropertyChange("idSexo", oldIdSexo, idSexo);
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        String oldCurp = this.curp;
        this.curp = curp;
        changeSupport.firePropertyChange("curp", oldCurp, curp);
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        String oldCorreo = this.correo;
        this.correo = correo;
        changeSupport.firePropertyChange("correo", oldCorreo, correo);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        String oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
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
        hash += (idDocente != null ? idDocente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Docente_1)) {
            return false;
        }
        Docente_1 other = (Docente_1) object;
        if ((this.idDocente == null && other.idDocente != null) || (this.idDocente != null && !this.idDocente.equals(other.idDocente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Docente_1[ idDocente=" + idDocente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
