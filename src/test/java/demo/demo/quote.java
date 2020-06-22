package demo.demo;

import java.util.ArrayList;
import java.util.List;

/*
 * 
*/


public class quote {
	
	List<pack> pack = new ArrayList<pack>();
	//List<node1> node=new ArrayList<node1>();
	//List<quote> quote=new ArrayList<quote>();
	
	node1 nod=new node1();
	pack pk=new pack();
	
	
	
	
	public pack getPack() {
		return pk;
	}
	public void setPack(pack pack) {
		this.pk = pack;
	}
	public node1 getNode() {
		return nod;
	}
	public void setNode(node1 node) {
		this.nod = node;
	}
	
	
	
	
	

}
