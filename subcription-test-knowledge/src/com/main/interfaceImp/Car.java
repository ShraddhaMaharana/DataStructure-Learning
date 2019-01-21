package com.main.interfaceImp;

import com.main.interfacetest.Vehicle;

class Car implements Vehicle {

	@Override
	public boolean isAutomobile() {
		return true;
	}

	@Override
	public boolean isMachine() {
		return true;
	}

	@Override
	public boolean isGeneralInterface() {
		return true;
	}

	@Override
	public boolean isVehicle() {
		return true;
	}

}
