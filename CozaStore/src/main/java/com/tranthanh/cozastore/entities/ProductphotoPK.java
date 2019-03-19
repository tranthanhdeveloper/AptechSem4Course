package com.tranthanh.cozastore.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ProductphotoPK implements Serializable {
    private int productId;
    private int seqId;

    @Column(name = "ProductId", nullable = false)
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Column(name = "SeqId", nullable = false)
    @Id
    public int getSeqId() {
        return seqId;
    }

    public void setSeqId(int seqId) {
        this.seqId = seqId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductphotoPK that = (ProductphotoPK) o;
        return productId == that.productId &&
                seqId == that.seqId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, seqId);
    }
}
