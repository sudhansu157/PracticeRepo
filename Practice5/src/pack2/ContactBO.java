package pack2;
import java.util.*;




public class ContactBO {
	public List<Contact> findContact (List<Contact> contactList,List<String> names){
		List<Contact> mlist = new ArrayList<Contact>();
		for(Contact m:contactList) {
			     if(names.contains(m.getName().trim())) {
				       mlist.add(m);
			       }
			
		}
		return mlist;
}
	
	public List<Contact> findContact (List<Contact> contactList,Date dateCreated) {
		
		List<Contact> mlist = new ArrayList<Contact>();
		for(Contact m:contactList) {
			if(m.getDateCreated().equals(dateCreated))
				mlist.add(m);
		}
		return mlist;
		
		}
	
	public List<Contact> findContact (List<Contact> contactList,String emailDomain) {
		
		List<Contact> mlist = new ArrayList<Contact>();
		for(Contact m:contactList) {
			if(m.getEmail().indexOf(emailDomain)!=-1)
				mlist.add(m);
		}
		
		return mlist;
		
	}
	
}