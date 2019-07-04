package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity // berguna untuk menandai bahwa kelas tersebut adalah sebuah kelas entity/entitas
public class ProductEntity implements Serializable { // nherintance (Pewarisan) adalah hubungan antara super class
                                                     // (kelas induk) dengan sub classnya (kelas anak)
                                                     //implements digunakan untuk mewariskan interface

    @Id // untuk menandakan bahwa property yang diberikan @Id sebagai primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", length = 100) // untuk membuat kolom dari property tersebut dan memberikan nilai unique dan
                                         // not null
    private String name;

    @Column(name = "price", length = 19)
    private BigDecimal price;

    @Column(name = "product_id")
    private String productId;

    @Version // gunanya sebagai melihat perubahan ketika mengubah data, misalnya kita merubah suatu data sebanyak 2 kali,
             // maka isi version otomatis terisi 2
    private Integer version;

    public ProductEntity() {
        super();
    }

    public ProductEntity(String name, BigDecimal price, String productId, Integer version) {
        super();
        this.name = name;
        this.price = price;
        this.productId = productId;
        this.version = version;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}
