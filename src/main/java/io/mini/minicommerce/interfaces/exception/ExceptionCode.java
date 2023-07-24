package io.mini.minicommerce.interfaces.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ExceptionCode {

    NOT_FOUND_ORDER(HttpStatus.BAD_REQUEST, "존재하지 않는 주문입니다."),

    ALREADY_EXIST_SHOP_NAME(HttpStatus.BAD_REQUEST, "사용 중인 상점 이름입니다."),
    NOT_FOUND_SHOP(HttpStatus.BAD_REQUEST, "존재하지 않는 상점입니다."),

    NON_SERVICE_LOCATION(HttpStatus.BAD_REQUEST, "서비스를 지원하지 않는 지역입니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
