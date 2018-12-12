package com.etaluma;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class StopLogger implements JavaDelegate {

    public void execute(DelegateExecution execution) {
        System.out.println("\nprocessed stopped by user");
    }

}
