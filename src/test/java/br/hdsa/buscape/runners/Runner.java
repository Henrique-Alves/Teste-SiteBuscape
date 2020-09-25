package br.hdsa.buscape.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/Teste_site_buscape.feature",
		glue = "br.hdsa.buscape.steps",
		tags = "",
		plugin = {"pretty", "html:target/report-html"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = false
		)
public class Runner {

}
