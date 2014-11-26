/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Samuel
 */
@Entity
@Table(name = "fruit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fruit.findAll", query = "SELECT f FROM Fruit f"),
    @NamedQuery(name = "Fruit.findByIdfruta", query = "SELECT f FROM Fruit f WHERE f.idfruta = :idfruta"),
    @NamedQuery(name = "Fruit.findByName", query = "SELECT f FROM Fruit f WHERE f.name = :name"),
    @NamedQuery(name = "Fruit.findByPrice", query = "SELECT f FROM Fruit f WHERE f.price = :price"),
    @NamedQuery(name = "Fruit.findByQuantity", query = "SELECT f FROM Fruit f WHERE f.quantity = :quantity")})
public class Fruit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "idfruta")
    private String idfruta;
    @Size(max = 30)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @Column(name = "quantity")
    private Integer quantity;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfruta")
    private List<Venta> ventaList;

    public Fruit() {
    }

    public Fruit(String idfruta) {
        this.idfruta = idfruta;
    }

    public String getIdfruta() {
        return idfruta;
    }

    public void setIdfruta(String idfruta) {
        this.idfruta = idfruta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @XmlTransient
    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfruta != null ? idfruta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fruit)) {
            return false;
        }
        Fruit other = (Fruit) object;
        if ((this.idfruta == null && other.idfruta != null) || (this.idfruta != null && !this.idfruta.equals(other.idfruta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Fruit[ idfruta=" + idfruta + " ]";
    }
    
}
