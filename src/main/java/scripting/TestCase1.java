package scripting;

import org.testng.annotations.Test;

import PomPages.Addtocartpage;
import PomPages.SkillraryDemoLogin;
import PomPages.SkillraryLoginPage;
import genericLib.BaseClass;

public class TestCase1 extends BaseClass {
	
	@Test
	public void tc1() {
		
		SkillraryLoginPage s1=new SkillraryLoginPage (driver);
		s1.gearsbutton();
		s1.skillrarydemoapp();
		
		driverutilities.switchtabs(driver);
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin (driver) ;
		driverutilities.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		Addtocartpage ad=new Addtocartpage(driver);
		driverutilities.doubleclick(driver,ad.getPlus());
		ad.cartbutton();
		
	}

}
