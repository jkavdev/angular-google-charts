package br.com.jakvdev.angular.google.charts.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "video")
public class Video implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "id")
	private Long id;
	@XmlElement(name = "category")
	private Category category;
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "likeCount")
	private Integer likeCount;
	@XmlElement(name = "dislikeCount")
	private Integer dislikeCount;

	public Video() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

	public Integer getDislikeCount() {
		return dislikeCount;
	}

	public void setDislikeCount(Integer dislikeCount) {
		this.dislikeCount = dislikeCount;
	}

}