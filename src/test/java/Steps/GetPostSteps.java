package Steps;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;


public class GetPostSteps extends BDDCommonFunctions {
    @Given("^I perform GET operation for \"([^\"]*)\"$")
    public void iPerformGETOperationFor(String URL) throws Throwable {
        given().contentType(ContentType.JSON);

    }
    @Given("I perform the GET operation for {string}")
    public void iPerformTheGEtOperationFor(String URL) {
        given().contentType(ContentType.JSON);

    }

    @And("I verify the title for the {string} and post number {string} and the {string}")
    public void iVerifyTheTitleForThePostNumberAndThe(String URL,String postNumber, String title) {
        BDDCommonFunctions.verifyUthor(URL,postNumber,title);
    }

    @And("I verify that the status code is ok for {string} and {string}")
    public void iVerifyThatTheStatusCodeIsOkFor(String URL, String postNumber) {
        BDDCommonFunctions.GETSTATUS(URL,postNumber);

       }

    @Given("I perform the POST request for the new User at {string}")
    public void iPerformThePOSTRequestForTheNewUserAt(String URL) {
        BDDCommonFunctions.GETPOST(URL);

    }


    @And("I verify the title for the {string} and the {string} for GET Parameters")
    public void iVerifyTheTitleForTheAndPostNumberAndTheForGETParameters(String URL, String title) {
        BDDCommonFunctions.PerformPAthParameter(URL,title);
    }

    @And("I verify the title for the {string} and the {string} for GET Query Parameters")
    public void iVerifyTheTitleForTheAndTheForGETQueryParameters(String URL, String title) {
        BDDCommonFunctions.PerformQueryparameter(URL,title);
    }
}

