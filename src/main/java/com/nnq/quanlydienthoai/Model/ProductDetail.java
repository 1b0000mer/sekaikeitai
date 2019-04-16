package com.nnq.quanlydienthoai.Model;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
@Entity(name="productdetail")
public class ProductDetail {

    @Id
    @Column(name = "Modelid")
    private String modelid;

    @Column(name="Productid")
    private  String productid;

    @Column(name="Colorid")
    private  String colorid;

    @Column (name="Price")
    private float price;

    @Column(name = "Quantity")
    private int quantity;

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getColorid() {
        return colorid;
    }

    public void setColorid(String colorid) {
        this.colorid = colorid;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
