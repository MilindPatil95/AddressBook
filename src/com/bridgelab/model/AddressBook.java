package com.bridgelab.model;


import java.util.List;
import java.util.stream.Collectors;

import com.bridgelab.repository.JsonAddressBookConnection;
import com.bridgelab.util.Utility;

public class AddressBook
{ 
  JsonAddressBookConnection connection=new JsonAddressBookConnection();

  List<Person> list;
	String filename="Addressbook.json";
   public void  addnewUser(List<Person> list1)
    {  this.list=list1; 
	   Person person =new Person();
       System.out.println("Enter Firstname");
       person.setName(Utility.inputString());
       System.out.println("Enter LastName");
       person.setLastname(Utility.inputString());
       System.out.println("Enter State");
       person.setState(Utility.inputString());
       System.out.println("Enter City");
       person.setCity(Utility.inputString());
       System.out.println("Enter Zipcode");
       person.setZipcode(Utility.inputString());
       
       System.out.println("Enter Mobile Number");
       person.setMobileno(Utility.inputLong());
       System.out.println("Enter address");
       person.setAddress(Utility.inputString());       
       list.add(person);     
      
   }
   public void editUser(List list,Person obj,int index)
   {    
	   Person editobj= obj;
	   System.out.println("Enter your choice");
	   System.out.println("1 :	LastName");
       System.out.println("2 :	State");
       System.out.println("3 :	City");
       System.out.println("4 :	Zipcode");       
       System.out.println("5 :	Mobile Number");
       System.out.println("6 :	address");
       System.out.println("7 :	Exit");
	   int ch=Utility.inputInt();
	   switch(ch)
	   {
	   case 1:
		   	 editobj.setLastname(Utility.inputString());
		     break;
	   case 2: 
		   	 editobj.setState(Utility.inputString());
		     break;
	   case 3: 
		     editobj.setCity(Utility.inputString());
		     break;
	   case  4: editobj.setZipcode(Utility.inputString());
		     break;
	   case   5: editobj.setMobileno(Utility.inputLong());
		    break;
	   case 6:
		     editobj.setAddress(Utility.inputString());
	         break;
	   case 7:
		       break;
	       
	   }
	   list.set(index, editobj);
	  
   }
   
   public void sortByLastName(List<Person> list)
   {
	  
	  this.list=list.stream().sorted((list1,list2) -> list1.getLastname().compareTo(list2.getLastname())).collect(Collectors.toList());

   }
   public void sortByZipcode(List<Person> list)
   {
	   this.list=list.stream().sorted((list1,list2) -> list1.getZipcode().compareTo(list2.getZipcode())).collect(Collectors.toList());
	 
   }
  
   public void printListOfAddressBook(List<Person> list1)

   {  int i=1;
     
	   for(Person person:list1)
	   { System.out.println("===========================================================================");
		   System.out.println("USER 	:" +i);
		   System.out.println("Firstname	 :"+person.getName());
	       System.out.println("LastName		 :"+person.getLastname());
	   	   System.out.println("State		 :"+person.getState());
	       System.out.println("City			 :"+person.getCity());	   
	       System.out.println("Zipcode		 :"+person.getZipcode());   
	       System.out.println("Mobile Number :"+person.getMobileno());
	       System.out.println("Address		 :"+person.getAddress());
	       	  i++;
	       	  
	   }
   }

  public void writeFile(List<Person> list1)
  {
	  connection.writeFile(filename,list1);
  }
  
  public List<Person> readFile()

  {
	  return connection.readFile(filename);
  }
  public List<Person> getList()
  {
	   return list;
	    
  }  
  
 public void setList(List<Person> list1)
  {
	  list=list1;
	    
	    
  } 
  
}
