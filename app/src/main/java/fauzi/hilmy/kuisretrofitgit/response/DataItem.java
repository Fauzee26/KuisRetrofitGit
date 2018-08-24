package fauzi.hilmy.kuisretrofitgit.response;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("image")
	private String image;

	@SerializedName("address")
	private String address;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"image = '" + image + '\'' + 
			",address = '" + address + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}