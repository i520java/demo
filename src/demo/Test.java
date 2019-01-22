package demo;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		  File  file=new  File("/Users/jinge/static/admin/images");
		  if(file.isFile()){
			  System.out.println("---------");
		  }
		  //file.mkdirs();
		  System.out.println("ok");
	}

}
