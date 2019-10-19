package multiplescenarioSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome=true, // cette option permet de supprimer les caractaire non utiles afficher sur la console lors de l'execution des tests
			features  = {"src/test/ressources/multiplescenarioFF"},
			glue= {"com/basic/multiplescenarioSD"},
			plugin = {"prety",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report.json"
					
			}
			)
	public class RunMultipeScenarioTest {
		
}
