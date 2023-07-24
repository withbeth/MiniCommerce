package io.mini.minicommerce.domain.shop.location;


import io.mini.minicommerce.interfaces.exception.ExceptionCode;
import io.mini.minicommerce.interfaces.exception.LocationException;

public enum ProvinceCode {

    SEOUL, BUSAN, KYEONGGI, NONE;

    public static ProvinceCode getProvinceCode(String province) {
        if(province.equals("seoul")) return SEOUL;
        if(province.equals("busan")) return BUSAN;
        if(province.equals("kyeonggi")) return KYEONGGI;
        if(province.equals("none")) return NONE;
        throw new LocationException(ExceptionCode.NON_SERVICE_LOCATION);
    }
}
