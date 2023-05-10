package TestProject01.Testing_Proje1;

import UtiLity.BaseDriver;
import UtiLity.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

public class TestingProje_1 extends BaseDriver {
    /*
        Test Case 1: Kayıt oluşturma
    • Siteye Gidin.
    • “Sign Up” tıklatınız.
    • “Ad new User” altındaki açılan formu eksiksiz doldurunuz.
    • Submit butonuna tıklatınız.
    • Başarılı bir şekilde kayıt oluşturduğunuzu doğrulayınız.
    Test Case 2: Giriş Yapma
    • Siteye gidiniz.
    • “Login” butonuna tıklatınız.
    • Oluşturmuş olduğunuz username ve password’u giriniz.
    • Login Butonuna tıklayınız.
    • Siteye giriş yaptığınızı doğrulayınız.
    Test Case 3: Yeni Müşteri Oluşturma
    • Siteye gidin.
    • Siteye giriş yapın.
    • “CREATE NEW” Butonuna tıklayınız.
    • Customer altındaki formu doldurunuz.
    • Create Butonuna tıklatınız.
         */
    @Test
    public void Test1() {

        MyFunc.Bekle(2);
        driver.get("https://itera-qa.azurewebsites.net/");
        MyFunc.Bekle(2);
        WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign Up']"));
        signUp.click();

        MyFunc.Bekle(2);
        WebElement firstName = driver.findElement(By.xpath("//input[@data-val-required='Please enter first name']"));
        firstName.sendKeys("Havva");
        MyFunc.Bekle(2);
        WebElement surName = driver.findElement(By.xpath("//input[@data-val-required='Please enter surname']"));
        surName.sendKeys("Gonul");

        MyFunc.Bekle(2);
        WebElement eMail = driver.findElement(By.xpath("//input[@id='E_post']"));
        eMail.sendKeys("hgonul123@gmail");

        MyFunc.Bekle(2);
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='Mobile']"));
        phoneNumber.sendKeys("123456");

        MyFunc.Bekle(2);
        WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
        userName.sendKeys("hgonull");

        MyFunc.Bekle(2);
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("123456");

        MyFunc.Bekle(2);
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("123456");

        MyFunc.Bekle(2);
        WebElement submit = driver.findElement(By.xpath("//input[@id='submit']"));
        submit.click();


        WebElement confirmation = driver.findElement(By.xpath("//label[text()='Username already exist']"));
        String confirmationStr = "Username already exist";

        Assert.assertTrue("Registration unsuccessful", confirmation.getText().equals(confirmationStr));
        //BekleKapat();


    }

    @Test
    public void Test2() {

        driver.get("https://itera-qa.azurewebsites.net/");


        MyFunc.Bekle(2);
        WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
        login.click();

        MyFunc.Bekle(2);
        WebElement userName = driver.findElement(By.xpath("//input[@data-val-required='Please enter username']"));
        userName.sendKeys("hgonull");

        MyFunc.Bekle(2);
        WebElement password = driver.findElement(By.xpath("//input[@data-val-required='Please enter password']"));
        password.sendKeys("123456");
        //MyFunc.Bekle(2);
        WebElement loginButton = driver.findElement(By.xpath("//input[@name='login']"));
        loginButton.click();

        MyFunc.Bekle(2);
        WebElement confirmation = driver.findElement(By.xpath("//h3[text()='Welcome hgonull']"));
        String confirmationStr = "Welcome hgonull";

        Assert.assertTrue("Login unsuccessful", confirmation.getText().equals(confirmationStr));


        //  BekleKapat();
        MyFunc.Bekle(2);
        WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Log out']"));
        logoutButton.click();


    }

    @Test
    public void Test3() {

        driver.get("https://itera-qa.azurewebsites.net/");

        MyFunc.Bekle(2);
        WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
        login.click();

        MyFunc.Bekle(2);
        WebElement userName = driver.findElement(By.xpath("//input[@data-val-required='Please enter username']"));
        userName.sendKeys("hgonull");

        MyFunc.Bekle(2);
        WebElement password = driver.findElement(By.xpath("//input[@data-val-required='Please enter password']"));
        password.sendKeys("123456");
        MyFunc.Bekle(2);
        WebElement loginButton = driver.findElement(By.xpath("//input[@name='login']"));
        loginButton.click();

        WebElement createButton = driver.findElement(By.xpath("//a[text()='Create New']"));
        createButton.click();

        MyFunc.Bekle(2);
        WebElement Name = driver.findElement(By.xpath("//input[@id='Name']"));
        Name.sendKeys("Furkan");

        MyFunc.Bekle(2);
        WebElement comany = driver.findElement(By.xpath("//input[@id='Company']"));
        comany.sendKeys("TechnoStudy");

        MyFunc.Bekle(2);
        WebElement adress = driver.findElement(By.xpath("//input[@id='Address']"));
        adress.sendKeys("USA");

        MyFunc.Bekle(2);
        WebElement city = driver.findElement(By.xpath("//input[@id='City']"));
        city.sendKeys("OHIO");

        MyFunc.Bekle(2);
        WebElement phone = driver.findElement(By.xpath("//input[@id='Phone']"));
        phone.sendKeys("123456987");


        MyFunc.Bekle(2);
        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.sendKeys("123456@gmail.com");

        MyFunc.Bekle(2);
        WebElement createButton2 = driver.findElement(By.xpath("//input[@value='Create']"));
        createButton2.click();

        BekleKapat();


    }
}
