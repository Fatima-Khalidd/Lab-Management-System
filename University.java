public class University {

	private String name;
	private Campus camp[];
	private int count;

	public University(String name, int count) {

		this.name=name;
		this.camp=new Campus[count];
	}

	public String getName() {

		return name;
	}

	public void addNewCam(Campus c) {

		camp[count++]=c;
	}

	@Override
	public String toString(){
 
        	StringBuilder campdetails = new StringBuilder("\n\n Campus Details\n");
        	for (int i = 0; i < count; i++) {
            		campdetails.append("\n").append(camp[i]);
        	}
        	return String.format("University name: %s",name) + campdetails;
    	}

	@Override
	public Object clone(){
		return new University(name,count);
	}
	@Override
	public boolean equals(Object o)
	{
		University p=(University)o;
		return this.name.equals(p.name);
	}	

}