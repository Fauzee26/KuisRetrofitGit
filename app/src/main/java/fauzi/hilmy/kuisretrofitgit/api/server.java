package fauzi.hilmy.kuisretrofitgit.api;

import fauzi.hilmy.kuisretrofitgit.response.ResponseData;
import retrofit2.Call;
import retrofit2.http.GET;

public interface server {
    @GET("read_data.php")
    Call<ResponseData> response_read();
}
