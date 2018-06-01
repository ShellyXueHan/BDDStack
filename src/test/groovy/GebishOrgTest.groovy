import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

//Junit testing

@RunWith(JUnit4)
class GebishOrgTest extends GebReportingTest {

    @Test
    void canGetToTheCurrentBookOfGeb() {
        to GebishOrgHomePage

        menu.click()

        //first link is for the current manual
        assert links[0].text().startsWith("current")

        links[0].click()

        at TheBookOfGebPage
    }

}