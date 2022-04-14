public class constructor {
String name;
int id;
String department;
String designation;
int salary;

    public constructor(String name, int id, String department, String designation, int salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public static void main(String[] args) {
        constructor Employee1 = new constructor("Anand",29023," Production", "AE", 35000);
        constructor Employee2 = new constructor("Himanshu",1540558," Finance", "TL", 25000);
        constructor Employee3 = new constructor("Chaya",29728," Quality  ", "DET", 20000);
        System.out.println("\n============Employee's Data===========");
        System.out.println("\n-------- Employee1 Detail---------");
        System.out.println("Employee name:"+Employee1.name);
        System.out.println("Employee id:"+Employee1.id);
        System.out.println("Employee department:"+Employee1.department);
        System.out.println("Employee designation:"+Employee1.designation);
        System.out.println("Employee salary:"+Employee1.salary);
        System.out.println("\n");
        System.out.println("\n-------- Employee2 Detail---------");
        System.out.println("Employee name:"+Employee2.name);
        System.out.println("Employee id:"+Employee2.id);
        System.out.println("Employee department:"+Employee2.department);
        System.out.println("Employee designation:"+Employee2.designation);
        System.out.println("Employee salary:"+Employee2.salary);
        System.out.println("\n");
        System.out.println("\n-------- Employee3 Detail---------");
        System.out.println("Employee name:"+Employee3.name);
        System.out.println("Employee id:"+Employee3.id);
        System.out.println("Employee department:"+Employee3.department);
        System.out.println("Employee designation:"+Employee3.designation);
        System.out.println("Employee salary:"+Employee3.salary);
        System.out.println("\n");
        System.out.println("\n");
        constructor Doctor1= new constructor("Princy",4672,"Dental","Dentist",40000);
        constructor Doctor2= new constructor("Rohit",5015,"Cardio","Cardiologist",95000);
        constructor Doctor3= new constructor("Abhay",8904,"Neurology","Neurologist",150000);

        System.out.println("\n==============Doctor's Data=============");
        System.out.println("\n-------- Doctor1 Detail---------");
        System.out.println("Doctor name:"+Doctor1.name);
        System.out.println("Doctor id:"+Doctor1.id);
        System.out.println("Doctor department:"+Doctor1.department);
        System.out.println("Doctor designation:"+Doctor1.designation);
        System.out.println("Doctor salary:"+Doctor1.salary);
        System.out.println("\n");
        System.out.println("\n-------- Doctor2 Detail---------");
        System.out.println("Doctor name:"+Doctor2.name);
        System.out.println("Doctor id:"+Doctor2.id);
        System.out.println("Doctor department:"+Doctor2.department);
        System.out.println("Doctor designation:"+Doctor2.designation);
        System.out.println("Doctor salary:"+Doctor2.salary);
        System.out.println("\n");
        System.out.println("\n-------- Doctor3 Detail---------");
        System.out.println("Doctor name:"+Doctor3.name);
        System.out.println("Doctor id:"+Doctor3.id);
        System.out.println("Doctor department:"+Doctor3.department);
        System.out.println("Doctor designation:"+Doctor3.designation);
        System.out.println("Doctor salary:"+Doctor3.salary);

    }
}
