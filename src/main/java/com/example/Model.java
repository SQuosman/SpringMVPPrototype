package com.example;

import org.springframework.stereotype.Component;

@Component
class Model {
	private String content = "Model reporting in Sir!";

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}