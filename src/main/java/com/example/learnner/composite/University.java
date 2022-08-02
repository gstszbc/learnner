package com.example.learnner.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zhangbicheng
 * Date: 2022/8/2
 */
public class University extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println(getName());
        //遍历list
        organizationComponents.stream().forEach(a -> a.print());
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

}
