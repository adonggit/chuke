package com.example.administrator.cookmanzzw.IView;

import com.example.administrator.cookmanzzw.model.entity.CookEntity.CookDetail;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/2/22.
 */

public interface ICookSearchResultView {

    public void onCookSearchLoadMoreSuccess(ArrayList<CookDetail> list);
    public void onCookSearchLoadMoreFaile(String msg);
    public void onCookSearchLoadMoreNoData();

}
