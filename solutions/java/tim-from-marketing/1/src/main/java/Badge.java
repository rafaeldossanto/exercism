class Badge {
    public String print(Integer id, String name, String department) {
        String prefix = (id != null) ? "[" + id + "] - " : "";
        String dept = (department != null) ? department.toUpperCase() : "OWNER";
        return prefix + name + " - " + dept;
    }
}
