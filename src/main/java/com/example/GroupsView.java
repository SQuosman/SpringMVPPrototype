package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button.ClickEvent;

@UIScope
@SpringView(name = GroupsView.VIEW_NAME)
public class GroupsView extends GroupsViewDesign implements View{
	public static final String VIEW_NAME = "Groups View";

	@Autowired
	GroupsPresenter presenter;

	@PostConstruct
	void init() {
		groupsButton.addClickListener(this::buttonClick);
		relationsButton.addClickListener(this::buttonClick);
		presenter.setup(this);
	}

	public void setLabelValue(String text){
		label1.setValue(text);
	}

	public void buttonClick(ClickEvent event) {
		// TODO Button-Beschriftung bestimmt die Op - nicht so ideal
		presenter.buttonClick(event.getButton().getCaption());
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}
