package com.zhy.model;

import lombok.Data;

/**
 * @author: shangbing
 * @Date: 2018/7/17 20:49
 * Describe: 文章分类
 */
@Data
public class Categories {

    private int id;

    private String categoryName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
    

}
