Feature: User fetches new intrants list
  As a User,
  I want to see my list of new intrants
  so that I can sort them out and take further action

  # follow advice from https://medium.com/agile-vision/cucumber-bdd-part-2-creating-a-sample-java-project-with-cucumber-testng-and-maven-127a1053c180
  # and http://www.automationtestinghub.com/cucumber-test-runner-class-junit/
  # in order to define the first step definitions in a standard Java way
  Scenario: Display list of intrants
    Given the User has a new intrants list filled with items
    When he fetches its new intrants list
    Then he sees his items
