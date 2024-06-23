public class Main {
    public static void main(String[] args) {
        // Create PC labs
        PcLab pcLab1 = new PcLab("OOP Lab", 10, "Ali Raza", "Muhammad Danish");
        pcLab1.addPc(123, "Core i7", "16 GB", "512 SSD", "HP", true);
        pcLab1.addPc(124, "Core i7", "16 GB", "512 SSD", "HP", true);

        // Create a department
        Department csDepartment = new Department("Computer Science", "Head Name", 10);
        csDepartment.addNewLab(pcLab1);

        // Create a campus
        Campus campus = new Campus("Main Campus", "Director Name", "Campus Address",1);
        campus.addNewdep(csDepartment);

        // Create a university
        University university = new University("University Name", 1);
        university.addNewCam(campus);

        // Printing university information
        System.out.println(university);
    }
}