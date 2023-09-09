/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilac_takip;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author --
 */
@Entity
@Table(name = "ILAC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ilac.findAll", query = "SELECT \u0131 FROM Ilac \u0131"),
    @NamedQuery(name = "Ilac.findById", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.id = :id"),
    @NamedQuery(name = "Ilac.findByAd", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.ad = :ad"),
    @NamedQuery(name = "Ilac.findBySkt", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.skt = :skt"),
    @NamedQuery(name = "Ilac.findByDoz", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.doz = :doz"),
    @NamedQuery(name = "Ilac.findByKs", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.ks = :ks"),
    @NamedQuery(name = "Ilac.findByKalangun", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.kalangun = :kalangun"),
    @NamedQuery(name = "Ilac.findByTur", query = "SELECT \u0131 FROM Ilac \u0131 WHERE \u0131.tur = :tur")})
public class Ilac implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "AD")
    private String ad;
    @Column(name = "SKT")
    private String skt;
    @Column(name = "DOZ")
    private Integer doz;
    @Column(name = "KS")
    private Integer ks;
    @Column(name = "KALANGUN")
    private Integer kalangun;
    @Column(name = "TUR")
    private Integer tur;

    public Ilac() {
    }

    public Ilac(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSkt() {
        return skt;
    }

    public void setSkt(String skt) {
        this.skt = skt;
    }

    public Integer getDoz() {
        return doz;
    }

    public void setDoz(Integer doz) {
        this.doz = doz;
    }

    public Integer getKs() {
        return ks;
    }

    public void setKs(Integer ks) {
        this.ks = ks;
    }

    public Integer getKalangun() {
        return kalangun;
    }

    public void setKalangun(Integer kalangun) {
        this.kalangun = kalangun;
    }

    public Integer getTur() {
        return tur;
    }

    public void setTur(Integer tur) {
        this.tur = tur;
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
        if (!(object instanceof Ilac)) {
            return false;
        }
        Ilac other = (Ilac) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ilac_takip.Ilac[ id=" + id + " ]";
    }
    
}
