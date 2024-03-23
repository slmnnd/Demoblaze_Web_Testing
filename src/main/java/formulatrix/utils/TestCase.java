package formulatrix.utils;

public enum TestCase {

    T1("User inputs username and password with combination of letters and numbers"),

    T2("User login with valid username and password");

    private String testCaseName;
    TestCase(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
