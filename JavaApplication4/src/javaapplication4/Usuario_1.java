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
@Table(name = "usuario", catalog = "dbdistribuida", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Usuario_1.findAll", query = "SELECT u FROM Usuario_1 u")
    , @NamedQuery(name = "Usuario_1.findByIdUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuario_1.findByUsuario", query = "SELECT u FROM Usuario_1 u WHERE u.usuario = :usuario")
    , @NamedQuery(name = "Usuario_1.findByContrase\u00f1a", query = "SELECT u FROM Usuario_1 u WHERE u.contrase\u00f1a = :contrase\u00f1a")
    , @NamedQuery(name = "Usuario_1.findByNombre", query = "SELECT u FROM Usuario_1 u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuario_1.findByApellidoPaterno", query = "SELECT u FROM Usuario_1 u WHERE u.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "Usuario_1.findByApellidoMaterno", query = "SELECT u FROM Usuario_1 u WHERE u.apellidoMaterno = :apellidoMaterno")
    , @NamedQuery(name = "Usuario_1.findByTipousuario", query = "SELECT u FROM Usuario_1 u WHERE u.tipousuario = :tipousuario")})
public class Usuario_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "contrase\u00f1a")
    private String contraseña;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Column(name = "tipousuario")
    private String tipousuario;

    public Usuario_1() {
    }

    public Usuario_1(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        Integer oldIdUsuario = this.idUsuario;
        this.idUsuario = idUsuario;
        changeSupport.firePropertyChange("idUsuario", oldIdUsuario, idUsuario);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        String oldContraseña = this.contraseña;
        this.contraseña = contraseña;
        changeSupport.firePropertyChange("contrase\u00f1a", oldContraseña, contraseña);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        String oldApellidoPaterno = this.apellidoPaterno;
        this.apellidoPaterno = apellidoPaterno;
        changeSupport.firePropertyChange("apellidoPaterno", oldApellidoPaterno, apellidoPaterno);
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        String oldApellidoMaterno = this.apellidoMaterno;
        this.apellidoMaterno = apellidoMaterno;
        changeSupport.firePropertyChange("apellidoMaterno", oldApellidoMaterno, apellidoMaterno);
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        String oldTipousuario = this.tipousuario;
        this.tipousuario = tipousuario;
        changeSupport.firePropertyChange("tipousuario", oldTipousuario, tipousuario);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario_1)) {
            return false;
        }
        Usuario_1 other = (Usuario_1) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Usuario_1[ idUsuario=" + idUsuario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
