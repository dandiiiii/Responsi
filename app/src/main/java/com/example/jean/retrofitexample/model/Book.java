package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

public class Book{

	@SerializedName("brief")
	private static String brief;

	@SerializedName("id")
	private String id;

	@SerializedName("title")
	private static String title;

	@SerializedName("filesource")
	private String filesource;

	public void setBrief(String brief){
		this.brief = brief;
	}

	public static String getBrief(){
		return brief;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public static String getTitle(){
		return title;
	}

	public void setFilesource(String filesource){
		this.filesource = filesource;
	}

	public String getFilesource(){
		return filesource;
	}

	@Override
 	public String toString(){
		return 
			"Book{" + 
			"brief = '" + brief + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",filesource = '" + filesource + '\'' + 
			"}";
		}
}