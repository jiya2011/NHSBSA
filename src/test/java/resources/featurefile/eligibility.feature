Feature: Eligibility Checker
  As user i like to check to know what help I can get with my NHS costs

  Scenario: Wales Test Ticket - Acceptance Criteria
    Given I am on home page of NHS
    When  User click on accpet cookies
    And   User click on start button
    And   User select my country
    And   User click on nextbutton for country
    And   User select my GP Practice
    And   User click on next button for Gp Practice
    And   User select my Dental Practice
    And   User click on next button for dental practice
    And   User enter my Date Of Birth
    And   User enter my month Of Birth
    And   User enter my year Of Birth
    And   User click on next button for date of birth
    And   User select live with a partner
    And   User click on next button for live with a partner
    And   User select me or my partner is not claim any benefits or tax credits
    And   User click on next button for benefits or tax credits
    And   User select option no for my pregnant or have you given birth in the last 12 months
    And   User click on next button for pregnaice
    And   User select i dont have any injury or illness caused by serving in the armed forces
    And   User click on next button for injury
    And   User select i dont have diabetes
    And   User click on next button for diabetes
    And   User select i dont have glaucoma
    And   User click on next button for glaucoma
    And   User click on I or my partner do not live permenentely in a care home
    And   User click on next button for live permenentely in a care home
    And   User select my and my partner have not more than £16,000 in savings, investments or property
    And   User click on next button for savings and investments
    Then  I should get a result of whether I will get help or not
