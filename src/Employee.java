public class Employee extends Member{
    Employee(String Name, double age , String Address, double Salary, long Phone, String department, String specialization){
        this.Name= Name;
        this.Age=age;
        this.Address=Address;
        this.Salary= Salary;
        this.Phone= Phone;
        this.department= department;
        this.specialization= specialization;
    }
    String specialization, department;
    public String toString(){
        return "I am "+ Name+ " and my age is "+ Age+"\n. I live in "+Address+".\n My salary is "+ Salary+ ".\n My phone number is "
                + Phone+".\n I work at "+department+ "department " +"\n specialization= "+specialization;
    }

}
