package org.automationexercise.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.automationexercise.constants.Constants.BASE_URL;

public class SignUpPage extends BasePage {



   @FindBy(xpath = "//b[text()='Enter Account Information']")
    private WebElement ENTER_ACCOUNT_INFORMATION;

   @FindBy(css = "label[for='id_gender1']")
   private WebElement TITLE_MR;
   @FindBy(css = "label[for='id_gender2']")
   private WebElement TITLE_MRS;
   @FindBy(id = "name")
   private WebElement NAME;
   @FindBy(id = "email")
   private WebElement EMAIL;
   @FindBy(id = "password")
   private WebElement PASSWORD;

   @FindBy(id = "days")
   private WebElement DAY;
   @FindBy(id = "months")
   private WebElement MONTH;
   @FindBy(id = "years")
   private WebElement YEAR;
   @FindBy(id = "uniform-newsletter")
   private WebElement NEWSLETTER;
   @FindBy(id = "uniform-optin")
   private WebElement OPTIN;
   @FindBy(css = "input[data-qa ='first_name']")
   private WebElement FIRSTNAME;
   @FindBy(css = "input[data-qa ='last_name']")
   private WebElement LASTNAME;
   @FindBy(css = "input[data-qa ='company']")
   private WebElement COMPANY;
   @FindBy(css = "input[data-qa ='address']")
   private WebElement ADDRESS;
   @FindBy(css = "input[data-qa ='address2']")
   private WebElement ADDRESS2;
   @FindBy(css = "[data-qa ='country']")
   private WebElement COUNTRY;
   @FindBy(css = "input[data-qa ='state']")
   private WebElement STATE;
   @FindBy(css = "input[data-qa ='city']")
   private WebElement CITY;
   @FindBy(css = "input[data-qa ='zipcode']")
   private WebElement ZIPCODE;
   @FindBy(css = "input[data-qa ='mobile_number']")
   private WebElement MOBILE_NUMBER;
   @FindBy(css = "[data-qa ='create-account']")
   private WebElement CREATE_ACCOUNT_BUTTON;




   public boolean isEnterAccountInformationIsVisible(){

      return isElementVisible(ENTER_ACCOUNT_INFORMATION);
   }

   public void openPage(){
      openPage(BASE_URL + "/signup");
   }
// Account Information
    public void selectTitle(String title) {
       if(title.equalsIgnoreCase("Mr")){
          scrollAndClickOnElement(TITLE_MR);
       } else if (title.equalsIgnoreCase("Mrs")) {
          scrollAndClickOnElement(TITLE_MRS);
       }
    }

   public void selectDay(String value) {
      Select selectDay = new Select(DAY);
      selectDay.selectByValue(value);
   }
   public void selectMonth(String value) {
      Select selectMonth = new Select(MONTH);
      selectMonth.selectByValue(value);
   }
   public void selectYear(String value) {
      Select selectYear = new Select(YEAR);
      selectYear.selectByValue(value);
   }
   public void selectCheckboxNewsLetter(){
      scrollAndClickOnElement(NEWSLETTER);
   }

   public void selectCheckboxOptin(){
      scrollAndClickOnElement(OPTIN);
   }
   public void selectCountry(String value) {
      if (COUNTRY != null) {
         Select selectCountry = new Select(COUNTRY);
         selectCountry.selectByVisibleText(value);
      }
   }
   public void fillAccountInformation(String title,String name, String email, String password,
                                      String day, String month, String year,
                                      boolean newsletter, boolean optin) {

      selectTitle(title);
      fillInput(EMAIL, email);
      fillInput(PASSWORD, password);

      selectDay(day);
      selectMonth(month);
      selectYear(year);

      if (newsletter) {
         selectCheckboxNewsLetter();
      }

      if (optin) {
         selectCheckboxOptin();
      }
   }


   //Address Information
   public void fillAddressInformation(String firstName, String lastName, String company,
                               String address, String address2, String country,
                               String state, String city, String zipcode, String mobileNumber) {

      fillInput(FIRSTNAME, firstName);
      fillInput(LASTNAME, lastName);
      fillInput(COMPANY, company);
      fillInput(ADDRESS, address);
      fillInput(ADDRESS2, address2);
      selectCountry(country);
      fillInput(STATE, state);
      fillInput(CITY, city);
      fillInput(ZIPCODE, zipcode);
      fillInput(MOBILE_NUMBER, mobileNumber);
   }
   public void clickOnCreateAccountButton(){
      scrollAndClickOnElement(CREATE_ACCOUNT_BUTTON);
   }













}
