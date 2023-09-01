package Practise;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
public class C01_GetReq {
    @Test
    public void test01(){
          /*
        url : https://reqres.in/api/users/
        get request
        donen response yazdırın
         */

        //api'den donen cevap response objesi icine kaydlur
        Response response=given().when().get("https://reqres.in/api/users/");

        //api den donen
    }
}
