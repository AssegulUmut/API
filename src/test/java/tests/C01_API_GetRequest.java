package tests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_API_GetRequest {



        /*
       C1_Get_ApiSorgulama
       https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request
       gonderdigimizde donen Response'un,
       status code'unun 200,
       ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin Cowboy,
       ve status Line'in HTTP/1.1 200 OK
       ve response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz.
    */


        //Assertion islemi yapilacak

    @Test
    public void get01(){
        //1-URL belirlenip url'e gidilecek
        String url="https://restful-booker.herokuapp.com/booking/83";

        //2-Expected data belirlenecek
        //3-Actual Data belirlenecek
        Response response=given().when().get(url);
        //4-Response yazdirilacak
        response.prettyPrint(); //sistemi yordugu icin gerekmedikce print edilmez




    }
}
