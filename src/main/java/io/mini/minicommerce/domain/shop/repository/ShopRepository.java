package io.mini.minicommerce.domain.shop.repository;

import io.mini.minicommerce.domain.shop.Shop;
import io.mini.minicommerce.domain.shop.location.CityCode;
import io.mini.minicommerce.domain.shop.location.ProvinceCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
    List<Shop> findAllByLocationProvinceAndLocationCity(ProvinceCode province, CityCode city);
    Optional<Shop> findByName(String name);
}
