package calisma;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class C05_GetResponseBodyTesti {

    //   https://jsonplaceholder.typicode.com/posts/44 url'ine bir GET request yolladigimizda
    //   donen Response'in
    //   status code'unun 200,
    //   ve content type'inin application/json; charset=utf-8,
    //   ve response body'sinde bulunan userId'nin 5,
    //   ve response body'sinde bulunan title'in "optio dolor molestias sit" oldugunu test edin.

    String url="https://jsonplaceholder.typicode.com/posts/44";
    Response response=given().when().get(url);


}
