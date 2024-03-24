package formulatrix.utils;

public enum TestCase {

    T1("User inputs username and password with combination of letters and numbers"),

    T2("User inputs username and password with full numbers input"),
    T3("User inputs username and password with full special characters input"),
    T4("User just inputs password without username"),
    T5("User just inputs username without password"),
    T6("User Signs Up without username and password"),
    T7("User signs up with an existing username"),
    T8("User inputs username and password with one letter"),
    T9("User inputs username and password with all letters"),
    T10("User inputs username and password with unlimited letters"),
    T11("User input username and password with all numbers"),
    T12("User inputs username and password with unlimited numbers"),
    T13("User inputs valid username and password"),
    T14("User inputs valid username and wrong password"),
    T15("User inputs wrong username and valid password"),
    T16("User just inputs valid username"),
    T17("User just inputs valid password"),
    T18("User login without inputs anything"),
    T19("User views the details of the product"),
    T20("User Add to Cart the product"),
    T21("User repeat Add to Cart the product"),
    T22("User views the products based on phones category"),
    T23("User views the products based on laptops category"),
    T24("User views the products based on monitors category"),
    T25("User access Home Page properly"),
    T26("User is using menu Contact with valid data"),
    T27("User is using menu Contact without @ in contact email"),
    T28("User is using menu Contact with inputs full numbers in contact name"),
    T29("User is using menu Contact without inputs anything"),
    T30("User places order without product"),
    T31("User places an order one product"),
    T32("User places an order 2 products in the same various"),
    T33("User places an order without filling out the order form"),
    T34("User places an order with filling out the order form only in the inputs name and credit card"),
    T35("User places an order 3 products in the different devices"),
    T36("User log out from the account");


    private String testCaseName;
    TestCase(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
