package com.java;

import java.io.File;

public class FilePath {
	
public static void main(String[] args) {
	//String currentDirectory = System.getProperty("user.dir");
	String path = System.getProperty("user.dir")+"/temp";
	System.out.println(path);
    File f1= new File(path);
    boolean b= f1.mkdir();
	//String path=currentDirectory;	
	//boolean f1= new File(System.getProperty("user.dir")+"/temp").mkdir();
	//System.out.println(f1.getAbsolutePath().concat(str));
	//boolean b=f1.mkdir();
	System.out.println(b);
	
}

}
