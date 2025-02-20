package org.kie.drl.insurance;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

public class InsuranceUnit implements RuleUnitData {

	private DataStore<TravelInsuranceApplication> applications;

	public InsuranceUnit(DataStore<TravelInsuranceApplication> applications) {
		this.applications = applications;
	}

	public InsuranceUnit() {
		this(DataSource.createStore());
	}

	// Create the Getter and Setters for the DataStore of the RuleUnit's Data Store
	public DataStore<TravelInsuranceApplication> getApplications() {
		return applications;
	}

	public void setApplications(DataStore<TravelInsuranceApplication> applications) {
		this.applications = applications;
	}
}
