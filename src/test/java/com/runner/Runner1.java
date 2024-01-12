package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//we use runner file for parallel excution of feature files

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/Resources/Features/Test1.feature"},
		glue = {"com.stepDefination"}, // package of step def file
	//	plugin= {"pretty","html:target/cucumber-reports/cucumber.html"},  //for html report  ,  it open with browser
	//	plugin= {"pretty","json:target/cucumber-reports/cucumber.json"} ,  //for json report ,  it open with tex editor
		plugin= {"pretty","junit:target/cucumber-reports/cucumber.xml"}    //for xml report ,open it with text editor


//		tags= ("@Positive or @Negative"), //tags that has to be executed
//		dryRun = false // chekc wheather all the steps are implemented
)



public class Runner1 {

}
