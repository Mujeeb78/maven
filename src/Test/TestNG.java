package Test;


	import org.testng.annotations.Test;
    import org.testng.annotations.BeforeTest;
    import org.testng.AssertJUnit;
    import org.testng.annotations.AfterTest;


    public class TestNG {

        private TestNG classundertest;    

        @BeforeTest
        public void setUp() throws Exception {

        classundertest = new TestNG();

        }

        @Test
        public void testAdd() {
            //comment-3 : fail("Not yet implemented");

        long result = 10+2;
        AssertJUnit.assertEquals(result, classundertest.add(10,2));

        }

        private Object add(int i, int j) {
			// TODO Auto-generated method stub
			return null;
		}

		@Test(priority=1)
        public void testSubtract() {
        //comment-5: fail("Not yet implemented");
        long result = 10-2;
        AssertJUnit.assertEquals(result, classundertest.subtract(10,2));

        }
        private Object subtract(int i, int j) {
			// TODO Auto-generated method stub
			return null;
		}

		@AfterTest
        public void AfterTest() {
            System.out.println("Test cases ran successfully");

    }
}


