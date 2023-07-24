package io.mini.minicommerce.domain.item.repository;

import io.mini.minicommerce.domain.item.Item;
import io.mini.minicommerce.domain.shop.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ItemRepository extends JpaRepository<Item, Long> {

    Optional<Item> findByIdWithPessimisticLock(Long id);

    List<Item> findAllByName(String name);

    Optional<Item> findByShopAndName(Shop shop, String name);
}
