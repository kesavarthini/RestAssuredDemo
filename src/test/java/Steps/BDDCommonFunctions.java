package Steps;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;


import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import okhttp3.ResponseBody;


public class BDDCommonFunctions {

    public  static void verifyUthor(String URL,String postNumber, String title)
    {
        given().contentType(ContentType.JSON).when().get(URL+""+postNumber).
                then().body("author", equalTo(title));
    }
    public static void GETSTATUS( String URL ,String postNumber)
    {
         given().contentType(ContentType.JSON).when().get(URL+postNumber).then().statusCode(200);

    }
    public  static void GETPOST(String URL)
    {

                RestAssured.baseURI = URL;
        RequestSpecification request= RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body("{\"name\":\"PrashantShekhar\",\"salary\":\"12345124\",\"age\":\"23\"},");

         int statusCode =request.post().getStatusCode();
        System.out.println(statusCode);



    }
    public static void PerformPAthParameter(String URL, String title)
    {
        given()
                .contentType(ContentType.JSON).
        with().
                pathParams("post",1).
        when().
                get(URL+"{post}").
        then().
                body("author", equalTo(title));
    }

    public static  void PerformQueryparameter(String URL,String title)
    {
        given()
                .contentType(ContentType.JSON).
                queryParams("id",1).
        when()
                .get(URL).
        then().
                body("author", equalTo(title));

//        String result  = given().contentType(ContentType.JSON).queryParams("id",1).when().get(URL);
    }


}
