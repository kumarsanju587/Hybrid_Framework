package testscript;

import org.testng.annotations.Test;

import generic.Fetch_data;
import generic.Generic_class;
import pom.Pom;

public class Login_script extends Generic_class
{
@Test
public void test1() 
{
String un = Fetch_data.get_data("Sheet1",0,0);
String pwd = Fetch_data.get_data("Sheet1",0,1);
Pom p = new Pom(driver);
p.username(un);
 p.password(pwd);
 p.login_btn();
}
}