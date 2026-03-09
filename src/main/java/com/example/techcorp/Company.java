import java.util.ArrayList;
import java.util.List;
public class Company{
    private String name;
    private double cash;
    private List<Employee> ListOfEmployees;
    private List<Project> ListOfProjects;
    public Company(String name,double cash) {
        this.name = name;
        this.cash=cash;
        this.ListOfEmployees=new ArrayList<>();
        this.ListOfProjects=new ArrayList<>();
    }
    public void hire(Employee employee) {
        ListOfEmployees.add(employee);
    }
    public void startProject(Project project) {
        ListOfProjects.add(project);
    }
    public void showStatus() {
        System.out.println("--- Status firmy: " + name + " ---");
        System.out.println("--- Budżet firmy: " + cash + " ---");
        System.out.println("Liczba pracowników: " + ListOfEmployees.size());
        System.out.println("Liczba projektów: " + ListOfProjects.size());
        System.out.println("---------------------------------");
        for(Project project:ListOfProjects){
            System.println(project.getName(), project.getRequiredWork(), project.getProgress(),project.isFinished());


        }

    }
    public String getName(){
        return name;
    }
    public double getCash(){
        return cash;
    }
    public List<Employee> getEmployees(){
        return ListOfEmployees;
    }
    public List<Project> getProjects(){
        return ListOfProjects;
    }

}