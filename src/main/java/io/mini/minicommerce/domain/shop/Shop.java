package io.mini.minicommerce.domain.shop;

import io.mini.minicommerce.domain.shop.location.Location;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Location location;

    @Column(unique = true)
    private String name;

    @Builder
    private Shop(Location location, String name) {
        this.location = location;
        this.name = name;
    }

    public static Shop fromLocationAndName(Location location, String name) {
        return Shop.builder()
                .location(location)
                .name(name)
                .build();
    }
}
