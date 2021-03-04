package classes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class CalculateDailyRange {
	
	public void getRange(String pa,String dest) {
		
	String path=pa;
	String paths=dest;
	String line=" ";
	PrintWriter pw=null;
	StringBuilder sb=null;
	try {
		BufferedReader bf=new BufferedReader(new FileReader(path));
		File f=new File(paths);
		 pw=new PrintWriter(f);
		 sb=new StringBuilder();
		 
	while((line=bf.readLine())!=null) {
		
		
		String[] values=line.split(",");
		String val=values[0];
		String  high=values[3];
		String low=values[4];
		float a=Float.parseFloat(high);
		float b=Float.parseFloat(low);
		float c=a-b;
		
		System.out.println(c);
		sb.append(val+","+c+","+"\n");
		
	
		
	}
	pw.write(sb.toString());
	bf.close();
	pw.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		}
	
	
	public static void main(String[] args) {
CalculateDailyRange r=new CalculateDailyRange();
r.getRange("src/classes/cm29JAN2020bhav.csv","src/classes/DailyRange1.csv");
r.getRange("src/classes/cm30JAN2020bhav.csv","src/classes/DailyRange2.csv");
r.getRange("src/classes/cm31JAN2020bhav.csv","src/classes/DailyRange3.csv");
	
	}
} 