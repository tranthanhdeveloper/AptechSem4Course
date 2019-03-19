package com.tranthanh.cozastore.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@IdClass(ProductphotoPK.class)
public class Productphoto {
    private int productId;
    private int seqId;
    private String path;
    private Timestamp creationDate;

    @Id
    @Column(name = "ProductId", nullable = false)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "SeqId", nullable = false)
    public int getSeqId() {
        return seqId;
    }

    public void setSeqId(int seqId) {
        this.seqId = seqId;
    }

    @Basic
    @Column(name = "Path", nullable = true, length = 100)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "CreationDate", nullable = false)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Productphoto that = (Productphoto) o;
        return productId == that.productId &&
                seqId == that.seqId &&
                Objects.equals(path, that.path) &&
                Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, seqId, path, creationDate);
    }
}
