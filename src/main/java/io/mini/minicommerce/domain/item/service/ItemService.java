package io.mini.minicommerce.domain.item.service;

import io.mini.minicommerce.domain.discount.DiscountCode;
import io.mini.minicommerce.domain.item.repository.ItemRepository;
import io.mini.minicommerce.domain.shop.Shop;
import io.mini.minicommerce.domain.shop.service.ShopService;
import io.mini.minicommerce.interfaces.item.dto.ItemResponse;
import io.mini.minicommerce.interfaces.item.dto.OrderItemResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ItemService {

    private final ItemRepository itemRepository;
    private final ShopService shopService;

    public ItemResponse createItem() {

        return ItemResponse.builder().build();
    }


    public ItemResponse findItemByItemId() {

        return ItemResponse.builder().build();
    }


    public List<ItemResponse> findItemsByItemName() {
        /**
         * TODO
         * 1. 원하는 지역에 상점이 존재하지 않거나, 원하는 상점이 없는 경우
         * 2.원하는 지역에 상점이 존재하는 경우
         */
        return new ArrayList<>(){};
    }

    /**
     * 원하는 지역에 상점이 존재하는 경우
     * 해당되는 상점에서 아이템을 찾아 할인 적용
     * 아이템이 없다면 '해당 상점에는 아이템이 존재하지 않다'는 상태 반환
     */
    private List<ItemResponse> getItemsByShopAsync(List<Shop> shops, String itemName, DiscountCode customerDiscountCode) {
        return new ArrayList<>(){};
    }

    /**
     * 원하는 지역에 상점이 존재하지 않거나, 원하는 상점이 없는 경우
     * 모든 지역을 기준으로 아이템을 가지고 있는 상점을 찾아 할인 적용
     */
    private List<ItemResponse> getItemsByNameAsync(String itemName, DiscountCode customerDiscountCode) {
        return new ArrayList<>(){};
    }


    @Transactional
    public ItemResponse update() {
        return ItemResponse.builder().build();
    }

    public OrderItemResponse decreaseStockByRedisson() {
        return OrderItemResponse.builder().build();

    }

    @Transactional
    public OrderItemResponse decreaseStockByPessimisticLock() {
        return OrderItemResponse.builder().build();
    }

    @Transactional
    public void undo(Long orderId, List<OrderItemResponse> orderItemResponses) {

    }

    public void increaseStockByOrderId(Long orderId) {

    }

    public void increaseStock(Long itemId, Long quantity) {

    }
}
