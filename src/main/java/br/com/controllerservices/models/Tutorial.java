package br.com.controllerservices.models;

public class Tutorial {

	private Long id;
	private String name;
	private String description;
	private Long categoryId;
	private Long publisherId;

	public Tutorial(long id, String name, String description, long categoryId, long publisherId) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.categoryId = categoryId;
		this.publisherId = publisherId;

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}

}
