package API_Section;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;



public class TestCase_2 {

    @Test
    public void TC_1_Get_By_ID() {


            given().baseUri("https://jsonplaceholder.typicode.com/").and()
                    .when().get("posts/1").then().log().all()
                    .assertThat().statusCode(200)
                    .body("userId",Matchers.equalTo(1))
                    .body("id",Matchers.equalTo(1))
                    .body("title",Matchers.equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
                    .body("body",notNullValue());
        }
}
