package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "C:\\Users\\Hp\\eclipse-workspace\\MayBDDPOM\\src\\test\\java\\featurePkg",
                  glue = "stepDefinitions",
                 // publish = true,
                  plugin = {"pretty","html:target/CucumberReport.html"},//"jason.target/JasonReport.jason"},
                  monochrome = true,
//                tags = "@Release2.0",
//                tags = "@Release1.0 and @Release2.0",
 //               tags = "@Smoke and Regression",
 //               tags = "@Release1.0 or @Release2.0",
 //               tags = "@E2E and not @Release2.0")
 //               tags = "@Release1.0"
                  tags = "@NewScenario"
                  )
public class RunnerClass {

}
