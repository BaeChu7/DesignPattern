package com.heeeun.designpattern.creational_patterns.builder.after;

import java.time.LocalDate;

import com.heeeun.designpattern.creational_patterns.builder.before.TourPlan;

public interface TourPlanBuilder {

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();

}
