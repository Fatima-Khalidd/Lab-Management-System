class Department {

    private String dName;
    private String dHead;
    private PcLab[] pcLabs;
    private int counter = 0;

    public Department(String dName, String dHead, int labsCount) {
        this.dName = dName;
        this.dHead = dHead;
        this.pcLabs = new PcLab[labsCount];
    }

    public void addNewLab(PcLab lab) {
        pcLabs[counter++] = lab;
    }

    @Override
    public String toString() {
        StringBuilder labDetails = new StringBuilder("\n\nPcLab details\n");
        for (int i = 0; i < counter; i++) {
            labDetails.append("\n").append(pcLabs[i]);
        }
        return String.format("Department Name: %s\nDepartment Head: %s\n", dName, dHead) + labDetails;
    }

    public PcLab[] getLabs() {
        return pcLabs;
    }
@Override
public Object clone(){
return new Department(this.dName,this.dHead,this.counter);
}
@Override
public boolean equals(Object o)
{
Department p=(Department)o;
return this.dName.equals(p.dName)&&this.dHead.equals(p.dHead);
}
}