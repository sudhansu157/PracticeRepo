package pack2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Main {

	

	public static void main(String[] args) throws ParseException {
		Scanner sc= new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Contact> mlist = new ArrayList<Contact>();
		System.out.println("Enter the number of contact details:");
		int n=Integer.parseInt(sc.nextLine());
		
		
		for(int i=1; i<=n; i++) {
			String data= sc.nextLine();
			String a[] = data.split(",");
			Contact contact =null;
			try {
				contact = new Contact(a[0],a[1],a[2],a[3],a[4],a[5],sdf.parse(a[6]));
			} catch (Exception e ) {
				e.printStackTrace();
			}
			if(contact!=null)
				mlist.add(contact);
			
			}
		System.out.println("Enter a search type:\n1.By Name\n2.By Date created\n3.By Email domain");
		int ch = Integer.parseInt(sc.nextLine());
		if(ch==1) {
			System.out.println("Enter the names:");
			String name = sc.nextLine();
			String names[] =name.split(",");
			List<Contact> contactList = new ContactBO().findContact(mlist, Arrays.asList(names));
			System.out.format("%-15s %-15s %-20s %-15s %-20s %-15s %s\n", "Name","Company","Title","Mobile","Alternate Mobile","Email","Date Created");
			for(Contact m:contactList) {
				System.out.format("%-15s %-15s %-20s %-15s %-20s %-15s %s\n", 
						m.getName(),m.getCompany(),m.getTitle(),m.getMobile(),m.getAlternateMobile(),m.getEmail(),sdf.format(m.getDateCreated()));
			}

	}
		else if (ch==2) {
			System.out.println("Enter the date to search contacts that were created on that date:");
			Date date = sdf.parse(sc.nextLine());
			List<Contact> contactList = new ContactBO().findContact(mlist,date);
			System.out.format("%-15s %-15s %-20s %-15s %-20s %-15s %s\n", "Name","Company","Title","Mobile","Alternate Mobile","Email","Date Created");
			for(Contact m:contactList) {
				System.out.format("%-15s %-15s %-20s %-15s %-20s %-15s %s\n", 
						m.getName(),m.getCompany(),m.getTitle(),m.getMobile(),m.getAlternateMobile(),m.getEmail(),sdf.format(m.getDateCreated()));
				}		
		}
		else if (ch==3) {
			System.out.println("Enter the Email domain to search contacts that have same email domain:");
			String email = sc.nextLine();
			List<Contact> contactList = new ContactBO().findContact(mlist,email );
			
			System.out.format("%-15s %-15s %-20s %-15s %-20s %-15s %s\n", "Name","Company","Title","Mobile","Alternate Mobile","Email","Date Created");
			for(Contact m:contactList) {
				System.out.format("%-15s %-15s %-20s %-15s %-20s %-15s %s", 
						m.getName(),m.getCompany(),m.getTitle(),m.getMobile(),m.getAlternateMobile(),m.getEmail(),sdf.format(m.getDateCreated()));
				}		
		}	
		

		else
			System.out.println("Invalid Choice");

}
}
