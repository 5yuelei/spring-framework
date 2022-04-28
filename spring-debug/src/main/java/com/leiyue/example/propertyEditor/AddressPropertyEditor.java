package com.leiyue.example.propertyEditor;

import java.beans.PropertyEditorSupport;

public class AddressPropertyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] split = text.split(",");
		Address address = new Address();
		address.setCity(split[0]);
		address.setProvince(split[1]);
		address.setDistrict(split[2]);
		this.setValue(address);
	}
}
