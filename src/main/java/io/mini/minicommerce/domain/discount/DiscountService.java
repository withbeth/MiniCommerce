package io.mini.minicommerce.domain.discount;

import io.mini.minicommerce.domain.item.repository.ItemRepository;
import io.mini.minicommerce.interfaces.discount.dto.DiscountCreationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DiscountService {

    private final ItemRepository itemRepository;

    @Transactional
    public void applyDiscount(DiscountCreationRequest request) {

        //TODO
        return;
    }
}
