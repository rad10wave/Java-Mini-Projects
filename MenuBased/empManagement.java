package new_project;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;  
class Employee implements Serializable{  
 int id;  
 String name;  
 int age;
 int sal;
 public Employee(int id, String name, int age, int sal) {  
  this.id = id;  
  this.name = name;
  this.age = age;
  this.sal = sal;
 }  
}  

public class empManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int choice;
        do {
        	System.out.println("1.Add an Employee\n2. Display All\n3. Exit");
        	choice = inp.nextInt();
			switch(choice){
			case 1:{
				int id;  
				 String name;  
				 int age;
				 int sal;
				System.out.println("Enter ID");
				id=inp.nextInt();
				System.out.println("Enter Name");
				name=inp.next();
				System.out.println("Enter Age");
				age=inp.nextInt();
				System.out.println("Enter Salary");
				sal=inp.nextInt();
				try{  
				Employee e1=new Employee(id,name,age,sal);
				 FileOutputStream fout=new FileOutputStream("f.txt");  
				  ObjectOutputStream out=new ObjectOutputStream(fout);  
				  out.writeObject(e1);  
				  out.flush();  
				  out.close();  
				}catch(Exception e){System.out.println(e);}  
				break;
			}
			case 2:{
				try{  
				
					  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
					  Employee s=(Employee)in.readObject();  
					  System.out.println(s.id+" "+s.name+" "+s.age+" "+s.sal);  
					  in.close();  
					  }catch(Exception e){System.out.println(e);}  
				break;
			}
			case 3:{
				choice=6;
			}
			default:{
				System.out.println("Wrong command");
				break;}
				
				
			}	
			
		}
        while(!(choice==6));
		inp.close();
		
	}

}
