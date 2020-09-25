package br.hdsa.buscape.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class TesteBuscapeSteps {

	private WebDriver driver = new ChromeDriver();
	

	@Quando("clicar em entrar")
	public void clicar_em_entrar() throws InterruptedException {
		driver.get("https://www.buscape.com.br/?og=17000&og=17000&msclkid=ce278627dd991d936c9ad94c4074030a&utm_"
				+ "source=bing&utm_medium=cpc&utm_campaign=BING%20BP%20-%20BRAND&utm_term=buscap%C3%A9&utm_content=BING%20BP%20-%20Buscap%C3%A9");
              driver.findElement(By.linkText("Entrar")).click();
	}

	@Quando("inserir email")
	public void inserir_email() {
        driver.findElement(By.id("email")).sendKeys("severinobento097@gmail.com");
	}

	@Quando("clicar em continuar")
	public void clicar_em_continuar() {
      driver.findElement(By.xpath("//button[@class='tags__Button-sc-160wlc5-2 bovzOq continuar-email']")).click();
	}

	@Quando("inserir um nome")
	public void inserir_um_nome() throws InterruptedException {
		Thread.sleep(5000);
      driver.findElement(By.name("nickname")).sendKeys("severino");
	}

	@Quando("clicar no botão para avançar")
	public void clicar_no_botão_para_avançar() {
      driver.findElement(By.xpath("//button[contains(text(),'OK, combinado!')]")).click();
	}

	@Então("o sistema exibe a página inicial")
	public void o_sistema_exibe_a_página_inicial() {
      String paginaInicial = driver.findElement(By.xpath("//strong[@class='UserMenu_UserGreetings__3G8nC']")).getText();
      System.out.println(paginaInicial);
      Assert.assertEquals("Oi, severino", paginaInicial);
	}

	@Quando("inserir o nome do produto")
	public void inserir_o_nome_do_produto() {

	}

	@Quando("clicar em Buscar")
	public void clicar_em_buscar() {

	}

	@Então("o sistema deve exibir o nome do produto")
	public void o_sistema_deve_exibir_o_nome_do_produto() {

	}

//	@After(order = 1)
//	public void screenshot(Scenario cenario) {
//		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(file, new File("target/screenshot/"+cenario.getId()+".jpg "));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

//	@After(order = 0)
//	public void finalizar() {
//		driver.quit();
//	}

}
