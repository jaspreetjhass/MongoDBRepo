package org.jp.models;

public class Topic {

	private String topicName;
	private Integer pages;

	public Topic() {

	}

	public Topic(String topicName, Integer pages) {
		super();
		this.topicName = topicName;
		this.pages = pages;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Topic [topicName=" + topicName + ", pages=" + pages + "]";
	}
}
