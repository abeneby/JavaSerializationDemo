package com.cogent.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class SerializationTester {

	public static void main(String[] args) {

		String filename = "cnt_details.ser";
		Contact contact = new Contact("Tom", 2342322, "M.G.Road", LocalDate.now());
		System.out.println(contact instanceof Serializable);//check to see if object is serializable 
		writeObjectToFile(contact, filename);
		System.out.println("Object copied in file...");
	}

	static public void writeObjectToFile(Contact cnt, String filename) {

		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filename))) {
			output.writeObject(cnt);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static public void readObject(String filename) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			try {
				Contact c = (Contact) in.readObject();
				System.out.println(c);
				System.out.println(c.getName());
				System.out.println(c.getDateOfBirth());
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Stream of bytes
		// Character Streams -work with 16 bit data
		// Byte Streams -work with 8 bit data

		// Character Streams
		// BufferedReader =>read which allows you to read characters
		// BufferedWritter

		// Byte Streams
		// BufferedInputStream =>read which allows you to read bytes
		// BufferedOutputStream

		// Object =>
		// System.out.println(cnt); //toString()
		// System.out.println(cnt.getName());

		// ObjectInputStream =>read Object
		// ObjectOutputStream =>write Object

	}
}
