package com.company.model;

public final class Customer extends User {

    private final int id;
    private final String name;
    private final String address;
    private final String phone;
    private final String orderNo;

    public Customer(String name, String address, String phone, String email,
                    String password, String userName, int id, String orderNo) {
        super(userName, email, password);
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.id = id;
        this.orderNo = orderNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public int getId() {
        return id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private int id;
        private String name;
        private String address;
        private String phone;
        private String email;
        private String password;
        private String userName;
        private String orderNo;

        private Builder() {
        }



        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder orderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Customer build() {
            return new Customer(name, address, phone, email, password, userName, id, orderNo);
        }
    }
}
