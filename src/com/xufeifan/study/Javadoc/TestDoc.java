/**
* <pre>
* public class TestDoc
* </pre>
* @author xufeifan
* @version 1.0.0
* @since 1.5
*/
public class TestDoc{

	/**
	* @param fieldStatic
	*/
	public static int fieldStatic = 10;
	
	/**
	* @param num
	* @return 10
	*/
	public static int methodStatic(int num){
		System.out.println("this is methodStatic method");
		return fieldStatic;
	}

}