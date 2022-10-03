package cucumber.framework.scenariotest.jcadmin.nisa;

public enum JCAdminTesting {
	M001("Admin invalid login simpan"),
	M002("Admin invalid login klik submit"),
	M003("Admin invalid login input username"),
	M004("Admin valid login input password"),
	M005("Admin invalid login input password uppercase"),
	M006("Admin invalid login upper"),
	M007("Admin invalid login input spasi"),
	M008("Admin invalid login user tanpa format email");
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
