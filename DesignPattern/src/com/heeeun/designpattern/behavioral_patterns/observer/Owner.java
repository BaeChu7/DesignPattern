package com.heeeun.designpattern.behavioral_patterns.observer;

public interface Owner {
    void Pass(Applicants employee);

    // void Fail(Employee employee);

    void notifyApplicant(String msg);
}
