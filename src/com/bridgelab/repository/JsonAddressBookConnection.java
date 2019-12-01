package com.bridgelab.repository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelab.model.Person;

public class JsonAddressBookConnection {

	public List<Person> readFile(String filename) 
	{
		List<Person> list1=null;
		try
		{
			ObjectMapper mapper = new ObjectMapper();
		    list1=mapper.readValue(new FileInputStream(filename), new TypeReference<List<Person>>() {
			});
		} catch (Exception e)
		{
			System.out.println();
		}
		return list1;
	}

	public void writeFile(String filename, List<Person> list) 
	{
		try 
		{
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new FileOutputStream(filename), list);

		} catch (Exception e)
		{
			System.out.println();
		}
	}
}
