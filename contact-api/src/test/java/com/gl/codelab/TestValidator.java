package com.gl.codelab;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.*;
import org.junit.platform.launcher.core.*;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

public class TestValidator {
	public static void main(String[] args) {
		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
				.selectors(DiscoverySelectors.selectClass(AssignmentTest.class)).build();

		Launcher launcher = LauncherFactory.create();

		TestPlan testPlan = launcher.discover(request);

		launcher.registerTestExecutionListeners(new SummaryGeneratingListener() {
			@Override
			public void testPlanExecutionFinished(TestPlan testPlan) {
				System.out.println("All tests finished.");
			}

			@Override
			public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult result) {
				if (testIdentifier.isTest()) {
					System.out.println("Test: " + testIdentifier.getDisplayName() + " -> " + result.getStatus());
				}
			}
		});

		launcher.execute(request);
	}
}
