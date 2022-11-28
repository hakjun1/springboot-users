package com.hospital.review.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Response<T> {//에러코드를 포함시켜 리턴하기 위함
    private String resultCode;//에러가 났을때 어떤건지 보여준다
    private T result;//성공을 반환할때 Response객체로 감싸서 return

    private static Response<Void> error(String resultCode) {
        return new Response(resultCode, null);
    }

    public static <T> Response<T> suceess(T result) {
        return new Response("SUCCESS", result);
    }
}
