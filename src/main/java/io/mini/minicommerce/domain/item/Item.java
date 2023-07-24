package io.mini.minicommerce.domain.item;


import io.mini.minicommerce.domain.shop.Shop;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    private String name;
    private Long price;
    private Integer discountPercentage;
    private Long stock;

    public enum OrderStatus {
        SUCCEED, CANCELED, FAILED
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = Math.min(discountPercentage, 100);
    }
}
