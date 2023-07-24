package io.mini.minicommerce.interfaces.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class OrderException extends RuntimeException {

    private final ExceptionCode exceptionCode;
}
