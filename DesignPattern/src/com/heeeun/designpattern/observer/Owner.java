package com.heeeun.designpattern.observer;

public interface Owner {
    void Pass(Applicants employee);

    // void Fail(Employee employee);

    void notifyApplicant(String msg);
}
