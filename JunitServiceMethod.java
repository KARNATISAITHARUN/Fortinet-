package com.fortinet;

public class JunitServiceMethod {

	/*JUnit Test without bounded with concrete DBclosely by Using Mockito.
	 * Test if the method works as expected in isolation. This is the solely purpose of JUnit. 
	 * For unit testing, you must not connect to external resources like a database. 
	 * This is, you have to mock your data source provider and any other component
	 *  that is external to the class you're testing. 
	 * You can mock methods and classes using a mock framework like PowerMock, EasyMock or Mockito.
	

		private PersonService service;
		private PersonDao dao; //we will be mocking this class

		@Before
		public void setup() {
		dao = mock(PersonDao.class); //here is the actual mocking call

		service = new PersonService();
		service.setPersonDao(dao);
		}*/
}
