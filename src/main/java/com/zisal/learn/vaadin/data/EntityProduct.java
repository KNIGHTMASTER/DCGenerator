package com.zisal.learn.vaadin.data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by Ladies Man on 5/19/2016.
 */
@Entity
@Table(name = "mst_product")
public class EntityProduct implements Serializable{

    private static final long serialVersionUID = -6444278658710692591L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private BigInteger id;

    @Column(name = "product_code")
    private String code;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_description")
    private String description;

    @Column(name = "product_price_sell")
    private Double priceSell;

    @Column(name = "product_date")
    private Date productDate;

    @Column(name = "product_discount")
    private Double productDiscount;

    @Column(name = "product_price_open")
    private Double productPriceOpen;

    @Column(name = "category_product_id")
    private BigInteger categoryProduct;

    @Column(name = "status")
    private String status;

    @Column(name = "created_by_username")
    private String createdByUserName;

    @Column(name = "created_by_id")
    private BigInteger createdById;

    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @Column(name = "modified_by_username")
    private String modifiedByUserName;

    @Column(name = "modified_by_id", nullable = true)
    private Integer modifiedById;

    @Column(name = "modified_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;

    @Column(name = "product_stock_first")
    private Integer productStockFirst;

    @Column(name = "product_stock_last")
    private Integer productStockLast;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(Double priceSell) {
        this.priceSell = priceSell;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Double getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(Double productDiscount) {
        this.productDiscount = productDiscount;
    }

    public Double getProductPriceOpen() {
        return productPriceOpen;
    }

    public void setProductPriceOpen(Double productPriceOpen) {
        this.productPriceOpen = productPriceOpen;
    }

    public BigInteger getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(BigInteger categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedByUserName() {
        return createdByUserName;
    }

    public void setCreatedByUserName(String createdByUserName) {
        this.createdByUserName = createdByUserName;
    }

    public BigInteger getCreatedById() {
        return createdById;
    }

    public void setCreatedById(BigInteger createdById) {
        this.createdById = createdById;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedByUserName() {
        return modifiedByUserName;
    }

    public void setModifiedByUserName(String modifiedByUserName) {
        this.modifiedByUserName = modifiedByUserName;
    }

    public int getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(int modifiedById) {
        this.modifiedById = modifiedById;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Integer getProductStockFirst() {
        return productStockFirst;
    }

    public void setProductStockFirst(Integer productStockFirst) {
        this.productStockFirst = productStockFirst;
    }

    public Integer getProductStockLast() {
        return productStockLast;
    }

    public void setProductStockLast(Integer productStockLast) {
        this.productStockLast = productStockLast;
    }

    @Override
    public String toString() {
        return "EntityProduct{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priceSell=" + priceSell +
                ", productDate=" + productDate +
                ", productDiscount=" + productDiscount +
                ", productPriceOpen=" + productPriceOpen +
                ", categoryProduct=" + categoryProduct +
                ", status='" + status + '\'' +
                ", createdByUserName='" + createdByUserName + '\'' +
                ", createdById=" + createdById +
                ", createdOn=" + createdOn +
                ", modifiedByUserName='" + modifiedByUserName + '\'' +
                ", modifiedById=" + modifiedById +
                ", modifiedOn=" + modifiedOn +
                ", productStockFirst=" + productStockFirst +
                ", productStockLast=" + productStockLast +
                '}';
    }
}
