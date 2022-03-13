package Pages.paylocityPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashbordPage {
    public DashbordPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "btnAddEmployee")
    WebElement addemployeeButton;
    @FindBy(xpath = "//label[.='First Name:']//..//input")
    WebElement firstName;
    @FindBy(xpath = "//label[.='Last Name:']//..//input")
    WebElement lastName;
    @FindBy(xpath = "//label[.='Dependants:']//..//input")
    WebElement dependants;
    @FindBy(xpath = "//button[.='Submit']")
    WebElement submitButton;
    @FindBy(xpath = "//td[.='Cristina']")
    WebElement employeeName;
    @FindBy(xpath = "//td[.='269.23']")
    WebElement benefitCost;




    public void clickAddEmployeeBtn(){
        addemployeeButton.click();
    }
    public void EmployeeDetails(){
        firstName.sendKeys("Cristina");
        lastName.sendKeys("Kim");
        dependants.sendKeys("12");
        submitButton.click();
    }
    public String ValidatedName(){
        return firstName.getText().trim();

    }
    public boolean NameIsDisplayed(){
        return firstName.isDisplayed();
    }
    public String BenefitCost(){
        return benefitCost.getText().trim();
    }


    public void TaskCase2(){

    }

}
