class Campus{
private String name;
private String directorname;
private String address;
private Department[] dep;
private int count=0;
Campus(String name,String directorname,String address,int count)
{
this.directorname=directorname;
this.address=address;
this.name=name;
this.dep=new Department[count];


}
public void addNewdep(Department d){
dep[count++]=d;}

@Override
public String toString(){
 
        StringBuilder depdetails = new StringBuilder("\n\n deaprtment details\n");
        for (int i = 0; i < count; i++) {
            depdetails.append("\n").append(dep[i]);
        }
        return String.format("campus name: %s\ndirector name: %s\n adress: %s ", name,directorname,address) + depdetails;
    }
@Override
public Object clone(){
return new Campus(this.name,this.directorname ,this.address,this.count);
}
@Override
public boolean equals(Object o)
{
Campus p=(Campus)o;
return this.name.equals(p.name)&&this.address.equals(p.address);
}





}