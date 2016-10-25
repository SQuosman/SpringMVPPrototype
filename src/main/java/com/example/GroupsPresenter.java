package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.UI;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@UIScope
@Component
class GroupsPresenter implements Presenter{

	@Autowired
	Model model;

	//TODO: Interface von View ableiten und Presenter damit verbinden
	private GroupsView view;

	@Override
	public void buttonClick(String operation) {
		// 3. Presenter führt die geforderte Operation mit Hilfe des Models aus
		// und gibt das Ergebnis am ende der Methode an die View weiter
		log.info("GroupsPresenter, Operation: " + operation);
		if (operation.equals("Goups")) {
			UI.getCurrent().getNavigator().navigateTo(GroupsView.VIEW_NAME);
		}
		if (operation.equals("Relations")) {
			UI.getCurrent().getNavigator().navigateTo(RelationsView.VIEW_NAME);
		}
	}

	@Override
	public void setup(View v) {
		this.view = (GroupsView) v;
	}
}