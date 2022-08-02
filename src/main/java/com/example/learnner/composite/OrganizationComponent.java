package com.example.learnner.composite;

/**
 * Author: zhangbicheng
 * Date: 2022/8/2
 */
public abstract class OrganizationComponent {
    private String name;
    private String desc;

    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected abstract void print();
}
