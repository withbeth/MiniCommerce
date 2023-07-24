package io.mini.minicommerce.domain.shop.service;

import io.mini.minicommerce.domain.shop.Shop;
import io.mini.minicommerce.domain.shop.location.CityCode;
import io.mini.minicommerce.domain.shop.location.ProvinceCode;
import io.mini.minicommerce.domain.shop.repository.ShopRepository;
import io.mini.minicommerce.interfaces.exception.ExceptionCode;
import io.mini.minicommerce.interfaces.exception.ShopException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopService {
    private final ShopRepository shopRepository;

    public void create() {
//        Location location = new Location(request.getProvince(), request.getCity());
//        if(isExistShopName()) {
//            throw new ShopException(ExceptionCode.ALREADY_EXIST_SHOP_NAME);
//        }
//        Shop shop = Shop.fromLocationAndName(location, request.getName());
//        shopRepository.save(shop);
    }

    private boolean isExistShopName(String name) {
        return shopRepository.findByName(name).isPresent();
    }

    public Shop findShopById(Long shopId) {
        return shopRepository.findById(shopId)
                .orElseThrow(() -> new ShopException(ExceptionCode.NOT_FOUND_SHOP));
    }

    public List<Shop> findShops(String province, String city) {
        ProvinceCode provinceCode = ProvinceCode.getProvinceCode(province);
        CityCode cityCode = CityCode.getCityCode(city);

        if(provinceCode == ProvinceCode.NONE && cityCode == CityCode.NONE) return shopRepository.findAll();
        return shopRepository.findAllByLocationProvinceAndLocationCity(provinceCode, cityCode);
    }
}
