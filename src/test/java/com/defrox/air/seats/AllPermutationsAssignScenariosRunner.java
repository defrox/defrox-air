package com.defrox.air.seats;

import com.defrox.air.seats.jobs.CheckAllPossibileSeatArrangementsJob;

public class AllPermutationsAssignScenariosRunner extends AbstractInputScenariosRunner {

    public AllPermutationsAssignScenariosRunner(String testName, String testData) {
        super(testName, testData);
    }

    @Override
    public void init() {
        job = CheckAllPossibileSeatArrangementsJob.builder()
                .inputData(inputData)
                .build();
    }
    
}
