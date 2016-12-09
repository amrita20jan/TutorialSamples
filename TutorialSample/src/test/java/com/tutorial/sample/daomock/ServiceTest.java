package com.tutorial.sample.daomock;


public class ServiceTest {/*

	static Dao lDao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 lDao=Mockito.mock(Dao.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		lDao=null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testfetchKey() { 
	
		Mockito.when(lDao.findbyId(1)).thenReturn(new  Entity("World", "Pay")); 
	 
		
		Service service=new Service(lDao);
		
		assertEquals("World Pay", service.fetchKey(1));
		
		Mockito.verify(lDao).findbyId(1);
	}
	
	@Test
	public void testfetchKeyByName(){
		Mockito.when(lDao.findByName("Viresh")).thenReturn(new Entity("Singh","Parihar"));
		
		Service service=new Service(lDao);
		
		assertEquals("Singh Parihar", service.fetchKeyByName("Viresh"));
		
		Mockito.verify(lDao).findByName("Viresh");
	}

*/}
