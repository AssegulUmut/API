package calisma;

import org.json.JSONObject;
import org.junit.Test;

public class C03_ApiSorgulamaTesti {
     /*
    Asagidaki JSON Objesini olusturup konsolda yazdirin.
{
        “firstname”:“Jim”,
        “additionalneeds”:“Breakfast”,
        “bookingdates”:{
                        “checkin”:“2018-01-01”,
                         “checkout”:“2019-01-01”
                           },
        “totalprice”:111,
        “depositpaid”:true,
        “lastname”:“Brown”
        }
             */
    @Test
    public void apiSorgulama(){
        JSONObject innerJSon=new JSONObject();
        innerJSon.put("checkin","2018-01-01");
        innerJSon.put("checkout","2019-01-01");

        JSONObject outerObje=new JSONObject();
        outerObje.put("firstname","Jim");
        outerObje.put("additionalneeds","Breakfast");
        outerObje.put("bookingdates",innerJSon);

        outerObje.put("totalprice",111);
        outerObje.put("depositpaid",true);
        outerObje.put("lastname","Brown");
        System.out.println("outerObje = " + outerObje);
        //outerObje = {"firstname":"Jim","additionalneeds":"Breakfast","bookingdates":{"checkin":"2018-01-01","checkout":"2019-01-01"},"totalprice":111,"depositpaid":true,"lastname":"Brown"}
    }
}
