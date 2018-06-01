import geb.spock.GebSpec

//BDD testing:

class GebishOrgSpec extends GebSpec {

    def "can get to the current Book of Geb"() {
        when: "I am at the Home page"
        to GebishOrgHomePage

        and: "I open up the menu"
        menu.click()

        then: "I should see a link starts with current"
        links[0].text().startsWith("current")

        when: "I click open the link"
        links[0].click()

        then: "I should be in the book of geb page"
        at TheBookOfGebPage
    }
}