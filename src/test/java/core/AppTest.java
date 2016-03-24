package core;

	import static org.junit.Assert.*;

	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Ignore;
	import org.junit.Test;

	public class AppTest {

		@BeforeClass // Code executed once before first Test Method
		public static void setUpBeforeClass() throws Exception {
			System.out.println("BeforeClass method will be executed once before first test method starts");
		}

		@AfterClass // Code executed once after last Test Method  
		public static void tearDownAfterClass() throws Exception {
			System.out.println("AfterClass method will be executed once after last test method starts");
		}

		@Before   // Code executed before each Test Method  
		public void setUp() throws Exception {
			System.out.println("Before method will be executed before each test method starts");
		}

		@After // Code executed after each Test Method 
		public void tearDown() throws Exception {
			System.out.println("After method will be executed after each test method starts");
		}
		
		@Test
		public void test01_AssertEquals_Pos(){
			assertEquals("String is the same","Hello Alex!",App.s);
			System.out.println("test01_AssertEquals_Pos");
		}
		
		@Test
		public void test02_AssertEquals_Neg(){
			assertEquals("String is not the same","Hello World!",App.s);
			System.out.println("test02_AssertEquals_Neg");
		}
		@Ignore
		@Test
		public void test03_AssertEguals_Ign(){
			assertEquals("String is not the same","Hello Mr.Khatilov!",App.s);
			System.out.println("test03_AssertEquals_Ign");
		}
		
		@Test
		public void test04_AssertSame_Pos(){
			assertSame("Integer is the same", 101, App.iw);
			System.out.println("test04_AssertSame_Pos");
		}
		@Test
		public void test05_AssertSame_Neg(){
			assertSame("Integer is not the same",127,App.iw);
			System.out.println("test05_AssertSame_Neg");
		}
		@Ignore
		@Test
		public void test06_AssertSame_Ign(){
			assertSame("Integer is not the same",99,App.iw);
			System.out.println("test06_AssertSame_Ign");
		}
		@Test
		public void test07_AssertFalse_Pos(){
			assertFalse("Boolean should be false",App.fw);
			System.out.println("test07_AssertFalse_Pos");
		}
		@Test
		public void test08_AssertFalse_Neg(){
			assertFalse("Boolean should be false",App.tw);
			System.out.print("test08_AssertTrue_Neg");
		}
		@Test
		public void test09_AssertTrue_Pos(){
			assertTrue("Boolean should be true",App.tw);
			System.out.println("test09_AssertTrue_Pos)");
		}
		@Test
		public void test10_AssertTrue_Neg(){
			assertTrue("Boolean should be true",App.fw);
			System.out.print("test10_AssertTrue_Neg");
		}
		}

