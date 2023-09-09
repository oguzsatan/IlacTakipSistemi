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
@Table(name = "KULLANICI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kullanici.findAll", query = "SELECT k FROM Kullanici k"),
    @NamedQuery(name = "Kullanici.findByAd", query = "SELECT k FROM Kullanici k WHERE k.ad = :ad"),
    @NamedQuery(name = "Kullanici.findByParola", query = "SELECT k FROM Kullanici k WHERE k.parola = :parola")})
public class Kullanici implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AD")
    private String ad;
    @Column(name = "PAROLA")
    private String parola;

    public Kullanici() {
    }

    public Kullanici(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ad != null ? ad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kullanici)) {
            return false;
        }
        Kullanici other = (Kullanici) object;
        if ((this.ad == null && other.ad != null) || (this.ad != null && !this.ad.equals(other.ad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ilac_takip.Kullanici[ ad=" + ad + " ]";
    }
    
}
