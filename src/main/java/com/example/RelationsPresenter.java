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
class RelationsPresenter implements Presenter{

	@Autowired
	Model model;

	private RelationsView view;

	@Override
	public void buttonClick(String operation) {
		log.info("RelationsPresenter, Operation: " + operation);
		if (operation.equals("Groups")) {
			UI.getCurrent().getNavigator().navigateTo(GroupsView.VIEW_NAME);
		}
		if (operation.equals("Relations")) {
			UI.getCurrent().getNavigator().navigateTo(RelationsView.VIEW_NAME);
			UI.getCurrent().getNavigator().getCurrentView();
		}
		else {
			view.setContentLabel(model.getContent() + " " + operation + " Button pressed");
		}
	}

	@Override
	public void setup(View v) {
		view = (RelationsView) v;
	}

}