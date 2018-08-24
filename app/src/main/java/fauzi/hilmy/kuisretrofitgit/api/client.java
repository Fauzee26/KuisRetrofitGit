package fauzi.hilmy.kuisretrofitgit.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class client {
    public static final String Url = "http://192.168.10.46/gitlat/";
    public static Retrofit setInit(){
        return new Retrofit.Builder()
                .baseUrl(Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static client getInstance(){
        return setInit().create(client.class);
    }
}
