package pojoForSerAndDes;

public class PojoClass {
	String name;
	String id;
	int phno;
	/**
	 * @param name
	 * @param id
	 * @param phno
	 */
	public PojoClass(String name, String id, int phno) {
		super();
		this.name = name;
		this.id = id;
		this.phno = phno;
	}
	
public PojoClass() {
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public int getPhno() {
	return phno;
}

public void setPhno(int phno) {
	this.phno = phno;
}

}
