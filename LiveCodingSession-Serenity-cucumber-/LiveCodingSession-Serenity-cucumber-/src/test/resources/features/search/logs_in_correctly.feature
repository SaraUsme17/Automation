Feature: LogIn
  Background: Test Log In

    Scenario Outline: User can Log in correctly
      Given Pablo open my store site
      When Pablo go to my account section
      Then he wait for login form to be loaded

      When he logs in with user "<user>" and password "<password>"
      Then he should see log in status correctly

      Examples:
      | user               | password     |
      | pablo@globant.com  | Testing      |