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
@Table(name = "TUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tur.findAll", query = "SELECT t FROM Tur t"),
    @NamedQuery(name = "Tur.findByTurid", query = "SELECT t FROM Tur t WHERE t.turid = :turid"),
    @NamedQuery(name = "Tur.findByAd", query = "SELECT t FROM Tur t WHERE t.ad = :ad"),
    @NamedQuery(name = "Tur.findByKullanim", query = "SELECT t FROM Tur t WHERE t.kullanim = :kullanim")})
public class Tur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TURID")
    private Integer turid;
    @Column(name = "AD")
    private String ad;
    @Column(name = "KULLANIM")
    private String kullanim;

    public Tur() {
    }

    public Tur(Integer turid) {
        this.turid = turid;
    }

    public Integer getTurid() {
        return turid;
    }

    public void setTurid(Integer turid) {
        this.turid = turid;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKullanim() {
        return kullanim;
    }

    public void setKullanim(String kullanim) {
        this.kullanim = kullanim;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (turid != null ? turid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tur)) {
            return false;
        }
        Tur other = (Tur) object;
        if ((this.turid == null && other.turid != null) || (this.turid != null && !this.turid.equals(other.turid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
      return ad;
    }
    
}
