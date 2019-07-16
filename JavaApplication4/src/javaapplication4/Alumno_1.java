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
@Table(name = "alumno", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Alumno_1.findAll", query = "SELECT a FROM Alumno_1 a")
    , @NamedQuery(name = "Alumno_1.findByMatricula", query = "SELECT a FROM Alumno_1 a WHERE a.matricula = :matricula")
    , @NamedQuery(name = "Alumno_1.findByNombre", query = "SELECT a FROM Alumno_1 a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Alumno_1.findByApellidopat", query = "SELECT a FROM Alumno_1 a WHERE a.apellidopat = :apellidopat")
    , @NamedQuery(name = "Alumno_1.findByApellidomat", query = "SELECT a FROM Alumno_1 a WHERE a.apellidomat = :apellidomat")
    , @NamedQuery(name = "Alumno_1.findByIdColonia", query = "SELECT a FROM Alumno_1 a WHERE a.idColonia = :idColonia")
    , @NamedQuery(name = "Alumno_1.findByCalle", query = "SELECT a FROM Alumno_1 a WHERE a.calle = :calle")
    , @NamedQuery(name = "Alumno_1.findByNumero", query = "SELECT a FROM Alumno_1 a WHERE a.numero = :numero")
    , @NamedQuery(name = "Alumno_1.findByCodigopostal", query = "SELECT a FROM Alumno_1 a WHERE a.codigopostal = :codigopostal")
    , @NamedQuery(name = "Alumno_1.findByCorreo", query = "SELECT a FROM Alumno_1 a WHERE a.correo = :correo")
    , @NamedQuery(name = "Alumno_1.findByIdSexo", query = "SELECT a FROM Alumno_1 a WHERE a.idSexo = :idSexo")
    , @NamedQuery(name = "Alumno_1.findByEdad", query = "SELECT a FROM Alumno_1 a WHERE a.edad = :edad")
    , @NamedQuery(name = "Alumno_1.findByCurp", query = "SELECT a FROM Alumno_1 a WHERE a.curp = :curp")
    , @NamedQuery(name = "Alumno_1.findByFotoarchivo", query = "SELECT a FROM Alumno_1 a WHERE a.fotoarchivo = :fotoarchivo")
    , @NamedQuery(name = "Alumno_1.findByBoleta", query = "SELECT a FROM Alumno_1 a WHERE a.boleta = :boleta")
    , @NamedQuery(name = "Alumno_1.findByIdStatus", query = "SELECT a FROM Alumno_1 a WHERE a.idStatus = :idStatus")
    , @NamedQuery(name = "Alumno_1.findByIdCertificado", query = "SELECT a FROM Alumno_1 a WHERE a.idCertificado = :idCertificado")
    , @NamedQuery(name = "Alumno_1.findByIdCede", query = "SELECT a FROM Alumno_1 a WHERE a.idCede = :idCede")})
public class Alumno_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "matricula")
    private Integer matricula;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidopat")
    private String apellidopat;
    @Column(name = "apellidomat")
    private String apellidomat;
    @Column(name = "id_colonia")
    private Integer idColonia;
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "codigopostal")
    private Integer codigopostal;
    @Column(name = "correo")
    private String correo;
    @Column(name = "id_sexo")
    private Integer idSexo;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "curp")
    private String curp;
    @Column(name = "fotoarchivo")
    private String fotoarchivo;
    @Column(name = "boleta")
    private String boleta;
    @Column(name = "id_status")
    private Integer idStatus;
    @Column(name = "id_certificado")
    private Integer idCertificado;
    @Column(name = "id_cede")
    private Integer idCede;

    public Alumno_1() {
    }

    public Alumno_1(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        Integer oldMatricula = this.matricula;
        this.matricula = matricula;
        changeSupport.firePropertyChange("matricula", oldMatricula, matricula);
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        Integer oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public Integer getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(Integer codigopostal) {
        Integer oldCodigopostal = this.codigopostal;
        this.codigopostal = codigopostal;
        changeSupport.firePropertyChange("codigopostal", oldCodigopostal, codigopostal);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        String oldCorreo = this.correo;
        this.correo = correo;
        changeSupport.firePropertyChange("correo", oldCorreo, correo);
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        Integer oldIdSexo = this.idSexo;
        this.idSexo = idSexo;
        changeSupport.firePropertyChange("idSexo", oldIdSexo, idSexo);
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        Integer oldEdad = this.edad;
        this.edad = edad;
        changeSupport.firePropertyChange("edad", oldEdad, edad);
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        String oldCurp = this.curp;
        this.curp = curp;
        changeSupport.firePropertyChange("curp", oldCurp, curp);
    }

    public String getFotoarchivo() {
        return fotoarchivo;
    }

    public void setFotoarchivo(String fotoarchivo) {
        String oldFotoarchivo = this.fotoarchivo;
        this.fotoarchivo = fotoarchivo;
        changeSupport.firePropertyChange("fotoarchivo", oldFotoarchivo, fotoarchivo);
    }

    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        String oldBoleta = this.boleta;
        this.boleta = boleta;
        changeSupport.firePropertyChange("boleta", oldBoleta, boleta);
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        Integer oldIdStatus = this.idStatus;
        this.idStatus = idStatus;
        changeSupport.firePropertyChange("idStatus", oldIdStatus, idStatus);
    }

    public Integer getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(Integer idCertificado) {
        Integer oldIdCertificado = this.idCertificado;
        this.idCertificado = idCertificado;
        changeSupport.firePropertyChange("idCertificado", oldIdCertificado, idCertificado);
    }

    public Integer getIdCede() {
        return idCede;
    }

    public void setIdCede(Integer idCede) {
        Integer oldIdCede = this.idCede;
        this.idCede = idCede;
        changeSupport.firePropertyChange("idCede", oldIdCede, idCede);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricula != null ? matricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno_1)) {
            return false;
        }
        Alumno_1 other = (Alumno_1) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Alumno_1[ matricula=" + matricula + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
