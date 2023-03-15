package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.ProfileSettingsPageBerti;
import com.cydeo.utilites.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfileSettingStepDefinition_Berti {
    ProfileSettingsPageBerti profileSettingsPageBerti = new ProfileSettingsPageBerti();
    LoginPage loginPage = new LoginPage();

    @Given("that you are in hectorWare")
    public void that_you_are_in_hector_ware() {
        loginPage.logIn();
        BrowserUtils.waitForPageToLoad(10);
    }

    @When("you click profile module")
    public void you_click_profile_module() {
        profileSettingsPageBerti.ProfileModule.click();
    }

    @When("when you click setting under profile module")
    public void when_you_click_setting_under_profile_module() {
        profileSettingsPageBerti.Settings.click();
    }

    @Then("you should see all the options of dropdown")
    public void you_should_see_all_the_options_of_dropdown() {
        List<String> expectedLanguageOptions = new ArrayList<>(Arrays.asList("English (US)", "English (US)", "Español (España)", "Français", "Deutsch (Persönlich: Du)",
                "Deutsch (Förmlich: Sie)", "Japanese (日本語)", "Русский", "Nederlands", "Italiano", "Português Brasileiro", "Português", "Dansk", "Svenska", "Türkçe",
                "简体中文", "한국어", "Afrikaans", "Asturianu", "Bahasa Indonesia", "Brezhoneg", "Català", "Eesti", "English (British English)", "Español (Argentina)",
                "Español (Chile)", "Español (Colombia)", "Español (Costa Rica)", "Español (Dominican Republic)", "Español (Ecuador)", "Español (El Salvador)", "Español (Guatemala)",
                "Español (Honduras)", "Español (Latin America)", "Español (México)", "Español (Nicaragua)", "Español (Panama)", "Español (Paraguay)", "Español (Peru)",
                "Español (Puerto Rico)", "Español (Uruguay)", "Esperanto", "Euskara", "Galego", "Latviešu", "Lietuvių", "Magyar", "Norsk bokmål", "Polski", "Română",
                "Shqip", "Slovenčina", "Slovenščina", "Tiếng Việt", "suomi", "Íslenska", "čeština", "Ελληνικά", "Български", "Македонски", "Српски", "Українська",
                "עברית", "فارسى", "ქართული", "正體中文（臺灣）", "hr"));
        List<String> actualLanguageOptions = new ArrayList<>();
        Select language = new Select(profileSettingsPageBerti.LanguageDropDown);
        for (WebElement eachOption : language.getOptions()) {
            actualLanguageOptions.add(eachOption.getText());
        }
        System.out.println(expectedLanguageOptions);
        System.out.println(actualLanguageOptions);
        Assert.assertEquals(actualLanguageOptions, expectedLanguageOptions);
    }


    @When("you write {string} input")
    public void you_write_input(String string) {
        BrowserUtils.waitForPageToLoad(10);
        profileSettingsPageBerti.FullName.clear();
        profileSettingsPageBerti.FullName.sendKeys(string);
        profileSettingsPageBerti.PhoneNumber.click();
        BrowserUtils.waitFor(3);
    }


    @Then("you should see the {string} on the phone number")
    public void you_should_see_the_on_the_phone_number(String expected) {
        profileSettingsPageBerti.getBackAndForwardIntoProfileModule();
        BrowserUtils.waitForPageToLoad(10);
        String actualFullName = profileSettingsPageBerti.FullName.getText();
        Assert.assertEquals(actualFullName, expected);
    }

    @Given("that you are in profile module information")
    public void thatYouAreInProfileModuleInformation() {
        profileSettingsPageBerti.goToProfileModule();
    }
}
