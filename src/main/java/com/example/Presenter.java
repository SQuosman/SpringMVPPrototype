package com.example;

import com.vaadin.navigator.View;

public interface Presenter {
	public void buttonClick(String operation);
	public void setup(View view);
}
