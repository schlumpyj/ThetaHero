package com.schlumpyj.thetahero;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/v1/marketdata/chains?")
    Single<OptionsData> getOptionsData(@Query("api_key") String apiKey,
                                      @Query("symbol") String symbol,
                                      @Query("contractType") String contractType,
                                      @Query("strikeCount") Integer strikeCount,
                                      @Query("includeQuotes") Boolean includeQuotes);
}
