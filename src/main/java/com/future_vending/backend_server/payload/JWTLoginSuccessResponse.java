package com.future_vending.backend_server.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class JWTLoginSuccessResponse {
    private boolean success;
    private String token;
}
