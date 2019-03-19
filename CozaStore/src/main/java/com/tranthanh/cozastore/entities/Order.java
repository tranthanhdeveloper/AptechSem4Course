package com.tranthanh.cozastore.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Order {
    private int seqId;
    private Timestamp creationDate;
    private Integer createBy;
    private Integer productId;

    @Id
    @Column(name = "SeqId", nullable = false)
    public int getSeqId() {
        return seqId;
    }

    public void setSeqId(int seqId) {
        this.seqId = seqId;
    }

    @Basic
    @Column(name = "CreationDate", nullable = true)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "CreateBy", nullable = true)
    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "ProductId", nullable = true)
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return seqId == order.seqId &&
                Objects.equals(creationDate, order.creationDate) &&
                Objects.equals(createBy, order.createBy) &&
                Objects.equals(productId, order.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seqId, creationDate, createBy, productId);
    }
}
