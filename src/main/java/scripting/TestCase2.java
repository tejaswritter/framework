package scripting;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import PomPages.SkillraryDemoLogin;
import PomPages.SkillraryLoginPage;
import PomPages.TestingPage;
import genericLib.BaseClass;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage (driver);
		s.gearsbutton();
		s.skillrarydemoapp();
		
		driverutilities.switchtabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilities.dropdown(sd.getCourseadd(), pdata.getdata("dropdownopt"));
		
		TestingPage tp=new TestingPage(driver);
		driverutilities.draganddrop(driver, tp.getSeleniumtraining(), tp.getCart());
		
		Point loc = tp.getTwitter().getLocation();
		int x=loc.getX();
		int y= loc.getY();
		driverutilities.scrollBar(driver, x, y);
		tp.twitterlogo();
		
	}

}
