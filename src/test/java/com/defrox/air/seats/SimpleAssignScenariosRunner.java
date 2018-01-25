package com.defrox.air.seats;

import com.defrox.air.seats.jobs.SimpleAssignSeatsJob;

public class SimpleAssignScenariosRunner extends AbstractInputScenariosRunner {

    public SimpleAssignScenariosRunner(String testName, String testData) {
        super(testName, testData);
    }

    @Override
    public void init() {
        job = SimpleAssignSeatsJob.builder()
                .inputData(inputData)
                .build();
    }

}
