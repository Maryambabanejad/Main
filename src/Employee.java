public class Employee {
    private String name;
    private long id = 1001;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id > 999)
            this.id = id;
        else System.out.println("id must be grated than 999");
    }
}

class Main2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(900);
        System.out.println(employee.getId());

    }
}

