package com.xworkz.enquery_application.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.xworkz.enquery_application.dto.EnquiryDto;

public class EnquiryFile { 

	public void enquiry(EnquiryDto dto) {
		File file = new File("taseer.txt");
		try {
			if(!file.exists()) {
				if(file.createNewFile()) {
					System.out.println("file created");
					addObject(dto, file);
				}
				else {
					System.out.println();
					addObject(dto, file);
				}
			}
		System.err.println(file.getAbsolutePath());
		}catch(IOException e){
			System.out.println("file not created");	
		}
	}

	private static void addObject(EnquiryDto dto, File file) throws IOException {
		try(FileOutputStream out = new FileOutputStream(file);
				ObjectOutputStream in = new ObjectOutputStream(out)){
			in.writeObject(dto);
			System.out.println("data is saved ");

		}catch(FileNotFoundException e) {
			System.out.println("file not created");
		}
	}
	private static Object read(File file) {
		try(FileInputStream filein = new FileInputStream(file);
				ObjectInputStream fileread = new ObjectInputStream(filein) ){
			return	fileread.readObject();
		}
		catch(IOException |ClassNotFoundException e) { 
			System.out.println("cant read "+e.getMessage());
			return new Object();

		} 
	}
}
