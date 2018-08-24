package fauzi.hilmy.kuisretrofitgit.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {
    public static final String Url = "http://192.168.10.46/gitlat/";
    public static Retrofit setInit(){
        return new Retrofit.Builder()
                .baseUrl(Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static Server getInstance(){
        return setInit().create(Server.class);
    }
}
