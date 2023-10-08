package org.example.builder;

public class IpsEmployeeBuilder {

    private String name;

    private String role;

    private int age;

    private String location;

    private String phone;

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public static class Builder {
        private IpsEmployeeBuilder employee;

        public Builder() {
            employee = new IpsEmployeeBuilder();
        }

        public Builder name(String name) {
            employee.name = name;
            return this;
        }

        public Builder role(String role) {
            employee.role = role;
            return this;
        }

        public Builder age(int age) {
            employee.age = age;
            return this;
        }

        public Builder location(String location) {
            employee.location = location;
            return this;
        }

        public Builder phone(String phone) {
            employee.phone = phone;
            return this;
        }

        public IpsEmployeeBuilder build() {
            return employee;
        }
    }

}
