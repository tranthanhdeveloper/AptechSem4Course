package com.tranthanh.cozastore.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Product {
    private int id;
    private String name;
    private String description;
    private String htmlDescription;
    private Timestamp creationDate;
    private Integer createdBy;
    private Integer cateId;
    private Integer photoId;
    private User userByCreatedBy;
    private Category categoryByCateId;
    private Collection<Productdetail> productdetailsById;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "HtmlDescription", nullable = true, length = -1)
    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    @Basic
    @Column(name = "CreationDate", nullable = false)
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "CreatedBy", nullable = true)
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "CateId", nullable = true)
    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    @Basic
    @Column(name = "PhotoId", nullable = true)
    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description) &&
                Objects.equals(htmlDescription, product.htmlDescription) &&
                Objects.equals(creationDate, product.creationDate) &&
                Objects.equals(createdBy, product.createdBy) &&
                Objects.equals(cateId, product.cateId) &&
                Objects.equals(photoId, product.photoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, htmlDescription, creationDate, createdBy, cateId, photoId);
    }

    @ManyToOne
    @JoinColumn(name = "CreatedBy", referencedColumnName = "Id")
    public User getUserByCreatedBy() {
        return userByCreatedBy;
    }

    public void setUserByCreatedBy(User userByCreatedBy) {
        this.userByCreatedBy = userByCreatedBy;
    }

    @ManyToOne
    @JoinColumn(name = "CateId", referencedColumnName = "Id")
    public Category getCategoryByCateId() {
        return categoryByCateId;
    }

    public void setCategoryByCateId(Category categoryByCateId) {
        this.categoryByCateId = categoryByCateId;
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<Productdetail> getProductdetailsById() {
        return productdetailsById;
    }

    public void setProductdetailsById(Collection<Productdetail> productdetailsById) {
        this.productdetailsById = productdetailsById;
    }
}
