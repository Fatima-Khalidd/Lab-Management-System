class PcLab {
    private String labName;
    private Pc[] pcList;
    private String labAssistant;
    private String labInCharge;
    private int pcCount = 0;

    PcLab(String labName, int pcCount, String labAssistant, String labInCharge) {
        this.labName = labName;
        this.pcList = new Pc[pcCount];
        this.labAssistant = labAssistant;
        this.labInCharge = labInCharge;
    }

    // Getters and Setters
    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(String labAssistant) {
        this.labAssistant = labAssistant;
    }

    public String getLabInCharge() {
        return labInCharge;
    }

    public void setLabInCharge(String labInCharge) {
        this.labInCharge = labInCharge;
    }

    public void addPc(int id, String cpu, String ram, String storage, String lcdMaker, boolean hasGpu) {
        if (pcCount < pcList.length) {
            pcList[pcCount++] = new Pc(id, cpu, ram, storage, lcdMaker, hasGpu);
        }
    }

    @Override
    public String toString() {
        StringBuilder pcDetails = new StringBuilder("\n\nPC's Details\n");
        for (int i = 0; i < pcCount; i++) {
            pcDetails.append("\n").append(pcList[i]);
        }
        return String.format("Lab Name: %s\nLab InCharge: %s\nLab Assistant: %s", labName, labInCharge, labAssistant) + pcDetails;
    }

	public Pc[] getPcList(){
		return pcList;
	}

	public void setPcList(Pc newList[]){
		pcList=newList;

	}
@Override
public Object clone(){
return new PcLab(this.labName,this.pcCount,this.labAssistant ,this.labInCharge);
}
@Override
public boolean equals(Object o)
{
PcLab p=(PcLab)o;
return this.labAssistant.equals(p.labAssistant)&&this.labInCharge.equals(p.labInCharge);
}
	
}