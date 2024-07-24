package Testscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Lib.Generall;

public class TC001 extends Generall {
//public static void main(String[] args) throws Exception {
	@Test
	public void test1() throws Exception {
	
	Generall s=new Generall();
	s.openapp();
	s.loginapp();
	s.closeapp();
	
}
}
