package com.tranthanh.cozastore.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ProductdetailPK implements Serializable {
    private int productId;
    private int seqid;

    @Column(name = "ProductId", nullable = false)
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Column(name = "Seqid", nullable = false)
    @Id
    public int getSeqid() {
        return seqid;
    }

    public void setSeqid(int seqid) {
        this.seqid = seqid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductdetailPK that = (ProductdetailPK) o;
        return productId == that.productId &&
                seqid == that.seqid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, seqid);
    }
}
