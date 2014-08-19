package process;

import java.io.IOException;

public class RunTimeTest {
	
	public void testRun() {
		
		try {
			Runtime runtime = Runtime.getRuntime();
			String path= "e:/hurry";
			System.out.println(path.substring(0, 2));
			
			String cmdstr = "cmd /k cd " + path + " & start";
			System.out.println(cmdstr);
//			"cmd /k start"
			Process process = runtime.exec(cmdstr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RunTimeTest run = new RunTimeTest();
		run.testRun();
	}

}
