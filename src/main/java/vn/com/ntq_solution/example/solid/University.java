package vn.com.ntq_solution.example.solid;

public class University {
    private String id;
    private String Name;
    private Package pkg;

    public University(String id, String name, Package pkg) {
        super();
        this.id = id;
        Name = name;
        this.pkg = pkg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Package getPkg() {
        return pkg;
    }

    public void setPkg(Package pkg) {
        this.pkg = pkg;
    }

}
