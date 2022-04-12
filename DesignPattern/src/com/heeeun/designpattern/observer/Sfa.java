package com.heeeun.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Sfa implements Owner {
    private List<Applicants> applicants = new ArrayList<>();

    @Override
    public void Pass(Applicants applicant) {
        applicants.add(applicant);
    };

    // @Override
    // public void Fail(Employee employee) {
    // employees.remove(employee);
    // };

    @Override
    public void notifyApplicant(String msg) {
        applicants.forEach(applicant -> applicant.update(msg));
    };
}