package com.tranthanh.cozastore.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(ProductdetailPK.class)
public class Productdetail {
    private int productId;
    private int seqid;
    private Double price;
    private String productDetailcol;
    private Product productByProductId;

    @Id
    @Column(name = "ProductId", nullable = false)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "Seqid", nullable = false)
    public int getSeqid() {
        return seqid;
    }

    public void setSeqid(int seqid) {
        this.seqid = seqid;
    }

    @Basic
    @Column(name = "Price", nullable = true, precision = 0)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "ProductDetailcol", nullable = true, length = 45)
    public String getProductDetailcol() {
        return productDetailcol;
    }

    public void setProductDetailcol(String productDetailcol) {
        this.productDetailcol = productDetailcol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Productdetail that = (Productdetail) o;
        return productId == that.productId &&
                seqid == that.seqid &&
                Objects.equals(price, that.price) &&
                Objects.equals(productDetailcol, that.productDetailcol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, seqid, price, productDetailcol);
    }

    @ManyToOne
    @JoinColumn(name = "ProductId", referencedColumnName = "Id", nullable = false)
    public Product getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(Product productByProductId) {
        this.productByProductId = productByProductId;
    }
}
