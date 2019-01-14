package com.example.administrator.cookmanzzw.model.interfaces;

import com.example.administrator.cookmanzzw.constants.Constants;
import com.example.administrator.cookmanzzw.model.entity.CookEntity.subscriberEntity.CategorySubscriberResultInfo;
import com.example.administrator.cookmanzzw.model.entity.CookEntity.subscriberEntity.SearchCookMenuSubscriberResultInfo;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/2/17.
 */

public interface ICookService {

    @GET(Constants.Cook_Service_CategoryQuery)
    Observable<CategorySubscriberResultInfo> getCategoryQuery(@Query(Constants.Cook_Parameter_Key) String key);

    @GET(Constants.Cook_Service_MenuSearch)
    Observable<SearchCookMenuSubscriberResultInfo> searchCookMenuByID(
            @Query(Constants.Cook_Parameter_Key) String key
            , @Query(Constants.Cook_Parameter_Cid) String cid
            , @Query(Constants.Cook_Parameter_Page) int page
            , @Query(Constants.Cook_Parameter_Size) int size);

    @GET(Constants.Cook_Service_MenuSearch)
    Observable<SearchCookMenuSubscriberResultInfo> searchCookMenuByName(
            @Query(Constants.Cook_Parameter_Key) String key
            , @Query(Constants.Cook_Parameter_Name) String name
            , @Query(Constants.Cook_Parameter_Page) int page
            , @Query(Constants.Cook_Parameter_Size) int size);

}
