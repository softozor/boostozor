package ch.softozor.boostozor.stepDefs;

import cucumber.api.java8.En;
import cucumber.api.Scenario;
import cucumber.api.java.*;

public class UserManagesNewIntrantsList implements En {

	public UserManagesNewIntrantsList() {
		
		Given("the User has a non-empty list of new intrants", () -> {
			// Write code here that turns the phrase above into concrete actions
			throw new cucumber.api.PendingException();
		});

		When("the User fetches his new intrants list", () -> {
			// Write code here that turns the phrase above into concrete actions
			throw new cucumber.api.PendingException();
		});

		Then("he gets his new intrants", () -> {
			// Write code here that turns the phrase above into concrete actions
			throw new cucumber.api.PendingException();
		});
	}
	
	@Before
	public void doItBeforeScenario() {
		System.out.println("called before every UserFetchesNewIntrantsList scenario");
	}
	
	@After
	public void doItAfterScenario(Scenario scenario) {
		System.out.println("called after every UserFetchesNewIntrantsList scenario");
		System.out.println(String.format("Scenario failed: %B", scenario.isFailed()));
	}
	
	@BeforeStep
	public void doItBeforeStep(Scenario scenario) {
		System.out.println("called before each step");
	}

	@AfterStep
	public void doItAfterStep(Scenario scenario) {
		System.out.println("called after each step");
	}
	
}
