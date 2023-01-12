/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProject.finalproject;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER DJOGJA
 */
@Entity
@Table(name = "kependudukan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kependudukan.findAll", query = "SELECT k FROM Kependudukan k"),
    @NamedQuery(name = "Kependudukan.findById", query = "SELECT k FROM Kependudukan k WHERE k.id = :id"),
    @NamedQuery(name = "Kependudukan.findByNama", query = "SELECT k FROM Kependudukan k WHERE k.nama = :nama"),
    @NamedQuery(name = "Kependudukan.findByNin", query = "SELECT k FROM Kependudukan k WHERE k.nin = :nin"),
    @NamedQuery(name = "Kependudukan.findByAddress", query = "SELECT k FROM Kependudukan k WHERE k.address = :address")})
public class Kependudukan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "NIN")
    private Integer nin;
    @Column(name = "address")
    private String address;
    @Lob
    @Column(name = "photo")
    private byte[] photo;

    public Kependudukan() {
    }

    public Kependudukan(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getNin() {
        return nin;
    }

    public void setNin(Integer nin) {
        this.nin = nin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kependudukan)) {
            return false;
        }
        Kependudukan other = (Kependudukan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FinalProject.finalproject.Kependudukan[ id=" + id + " ]";
    }
    
}
