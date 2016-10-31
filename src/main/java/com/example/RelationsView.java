package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button.ClickEvent;

@UIScope
@SpringView(name = RelationsView.VIEW_NAME)
public class RelationsView extends TemplateDesign implements View {
	public static final String VIEW_NAME = "Relations_View";

	@Autowired
	RelationsPresenter presenter;

	@PostConstruct
	void init() {
		groupsButton.addClickListener(this::buttonClick);
		relationsButton.addClickListener(this::buttonClick);
		usersButton.addClickListener(this::buttonClick);
		appButton.addClickListener(this::buttonClick);
		authButton.addClickListener(this::buttonClick);
		structureButton.addClickListener(this::buttonClick);
		contentLabel.setValue("Relations");
		presenter.setup(this);
	}

	public void buttonClick(ClickEvent event) {
		// Button-Beschriftung bestimmt die Op - nicht so ideal vielleicht
		presenter.buttonClick(event.getButton().getCaption());
	}

	public void setContentLabel(String text){
		contentLabel.setValue(text);
	}

	@Override
	public void enter(ViewChangeEvent event) {

	}

}
