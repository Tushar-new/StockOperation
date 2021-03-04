package classes;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.PrintWriter;

public class CalculateDailyAverageRange {
public void getAvg(String c1,String c2,String c3,String news) {
	String path=c1;
	String paths=c2;
	String pathss=c3;
	String newc=news;
	String line1="";
	String line2="";
	String line3="";
	PrintWriter pw=null;
	StringBuilder sb=null;
	
	try {
		BufferedReader bf1=new BufferedReader(new FileReader(path));
		BufferedReader bf2=new BufferedReader(new FileReader(paths));
		BufferedReader bf3=new BufferedReader(new FileReader(pathss));
		File f=new File(newc);
		 pw=new PrintWriter(f);
		 sb=new StringBuilder();
		 
		 sb.append("SYMBOL"+","+"AVG"+","+"\n");
	while((line1=bf1.readLine())!=null&&(line2=bf2.readLine())!=null&&(line3=bf3.readLine())!=null) {
		
		
		String[] values=line1.split(",");
		String[] values1=line2.split(",");
		String[] values2=line3.split(",");
		String val=values[0];
		String  x=values[1];
		String y=values1[1];
		String z =values2[1];
		float a=Float.parseFloat(x);
		float b=Float.parseFloat(y);
		float c=Float.parseFloat(z);
		float d=(a+b+c)/3;
		System.out.println(d);
		sb.append(val+","+d+","+"\n");
			
	}
	pw.write(sb.toString());
	bf1.close();
	bf2.close();
	bf3.close();
	pw.close();
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	
	
}
	public static void main(String[] args) {
		CalculateDailyAverageRange ca=new CalculateDailyAverageRange();
		ca.getAvg("src/classes/DailyRange1.csv", "src/classes/DailyRange2.csv", "src/classes/DailyRange3.csv", "src/classes/NewAVGCSV.csv");

	}

}
