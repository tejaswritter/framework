package scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.CoreJavaPage;
import PomPages.SkillraryLoginPage;
import PomPages.WishListPage;
import genericLib.BaseClass;

public class TestCase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s1=new SkillraryLoginPage(driver);
		s1.searchtextbox(pdata.getdata("coursename"));
		s1.searchbutton();
		
		CoreJavaPage cp=new CoreJavaPage(driver);
		cp.java();
		
		WishListPage wlp=new WishListPage(driver);
		driverutilities.switchFrame(driver);
		wlp.playbutton();
		Thread.sleep(10000);
		wlp.pausebutton();
		driverutilities.switchbackframe(driver);
		wlp.addtowishlistbtn();
		
		
	}

}
