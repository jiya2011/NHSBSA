package com.nhs.steps;

import com.nhs.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Mysteps {
    @Given("^I am on home page of NHS$")
    public void iAmOnHomePageOfNHS() {

    }

    @When("^User click on accpet cookies$")
    public void iClickOnAccpetCookies() {
       new HomePage().clickOnCookies();
    }

    @And("^User click on start button$")
    public void iClickOnStartButton() {
        new HomePage().clickOnStartButton();
    }

    @And("^User select my country$")
    public void iSelectMyCountry() {
        new CountryPage().clickOnWhichCountryToLiveIn();
    }

    @And("^User click on nextbutton for country$")
    public void iClickOnNextbuttonForCountry()
    {
        new CountryPage().clickOnNextButton();
    }

    @And("^User select my GP Practice$")
    public void iSelectMyGPPractice() {
        new GpPracticePage().clickOnGPService();
    }

    @And("^User click on next button for Gp Practice$")
    public void iClickOnNextButtonForGpPractice() {
    new GpPracticePage().clickOnNextButton1();
    }

    @And("^User select my Dental Practice$")
    public void iSelectMyDentalPractice()
    {
new DentalPracticePage().clickOnDentalPractice();
    }

    @And("^User click on next button for dental practice$")
    public void iClickOnNextButtonForDentalPractice() {
    new  DentalPracticePage().clickOnNextButton2();
    }

    @And("^User enter my Date Of Birth$")
    public void iEnterMyDateOfBirth() {
        new DateOfBirthPage().setDate("1");
    }

    @And("^User enter my month Of Birth$")
    public void iEnterMyMonthOfBirth() {
        new DateOfBirthPage().setMonth("02");
    }

    @And("^User enter my year Of Birth$")
    public void iEnterMyYearOfBirth() {
        new DateOfBirthPage().setYear("2000");
    }

    @And("^User click on next button for date of birth$")
    public void iClickOnNextButtonForDateOfBirth() {
        new DateOfBirthPage().clickOnNextButton3();
    }

    @And("^User select live with a partner$")
    public void iSelectLiveWithAPartner() {
        new PartnerPage().clickonLiveWithPartner();
    }

    @And("^User click on next button for live with a partner$")
    public void iClickOnNextButtonForLiveWithAPartner() {
        new PartnerPage().clickOnNextButton4();
        new PartnerPage().clickOnNextButton4();
    }

    @And("^User select me or my partner is not claim any benefits or tax credits$")
    public void iSelectMeOrMyPartnerIsNotClaimAnyBenefitsOrTaxCredits() {
        new TexCreditPage().clickOnClaimBebefirOrTax();
    }

    @And("^User click on next button for benefits or tax credits$")
    public void iClickOnNextButtonForBenefitsOrTaxCredits() {
        new TexCreditPage().clickOnNextButton5();
    }

    @And("^User select option no for my pregnant or have you given birth in the last (\\d+) months$")
    public void iSelectOptionNoForMyPregnantOrHaveYouGivenBirthInTheLastMonths(int arg0) {
   new BirthPage().clickOnPragnentOrGivenBirth();
    }

    @And("^User click on next button for pregnaice$")
    public void iClickOnNextButtonForPregnaice() {
        new BirthPage().clickOnNextButton6();
    }

    @And("^User select i dont have any injury or illness caused by serving in the armed forces$")
    public void iSelectIDontHaveAnyInjuryOrIllnessCausedByServingInTheArmedForces() {
        new ArmedForcesPage().clickOnInjuryOrIllness();
    }

    @And("^User click on next button for injury$")
    public void iClickOnNextButtonForInjury() {
        new ArmedForcesPage().clickOnNextButton7();
    }

    @And("^User select i dont have diabetes$")
    public void iSelectIDontHaveDiabetes() {
        new DiabetesPage().clickOnDiabities();
    }

    @And("^User click on next button for diabetes$")
    public void iClickOnNextButtonForDiabetes() {
        new DiabetesPage().clickOnNextButton8();
    }

    @And("^User select i dont have glaucoma$")
    public void iSelectIDontHaveGlaucoma() {
        new GlaucomaPage().clickOnGlucoma();
    }

    @And("^User click on next button for glaucoma$")
    public void iClickOnNextButtonForGlaucoma() {
        new GlaucomaPage().clickOnNext9();
    }



    @And("^User click on next button for savings and investments$")
    public void iClickOnNextButtonForSavingsAndInvestments() {
        new SavingsPage().clickOnNext11();
    }

    @Then("^I should get a result of whether I will get help or not$")
    public void iShouldGetAResultOfWhetherIWillGetHelpOrNot() {
        Assert.assertEquals("Not Getting help","Based on what you've told us\n" +
                "You get help with NHS costs",new NhsCosts().VerifyResultMsg());
    }

    @And("^User select my and my partner have not more than £(\\d+),(\\d+) in savings, investments or property$")
    public void iSelectMyAndMyPartnerHaveNotMoreThan£InSavingsInvestmentsOrProperty(int arg0, int arg1) {
        new SavingsPage().clickOnSavingInvestInProperty();
    }

    @And("^User click on next button for live permenentely in a care home$")
    public void iClickOnNextButtonForLivePermenentelyInACareHome() {
        new PermenentelyCareHome().clickOnnextbuttonforPermenentelyCareHome();
    }

    @And("^User click on I or my partner do not live permenentely in a care home$")
    public void iClickOnIOrMyPartnerDoNotLivePermenentelyInACareHome() {
        new PermenentelyCareHome().clickOncareHomePermenetely();
    }
}
