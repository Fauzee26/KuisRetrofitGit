package fauzi.hilmy.kuisretrofitgit.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseData{

	@SerializedName("pesan")
	private String pesan;

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("success")
	private boolean success;

	public void setPesan(String pesan){
		this.pesan = pesan;
	}

	public String getPesan(){
		return pesan;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setSuccess(boolean success){
		this.success = success;
	}

	public boolean isSuccess(){
		return success;
	}

	@Override
 	public String toString(){
		return 
			"ResponseData{" + 
			"pesan = '" + pesan + '\'' + 
			",data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}
}