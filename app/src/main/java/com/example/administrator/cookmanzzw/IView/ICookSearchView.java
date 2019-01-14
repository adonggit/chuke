package com.example.administrator.cookmanzzw.IView;

import com.example.administrator.cookmanzzw.model.entity.CookEntity.CookDetail;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/2/22.
 */

public interface ICookSearchView {

    public void onCookSearchSuccess(ArrayList<CookDetail> list, int totalPages);
    public void onCookSearchFaile(String msg);
    public void onCookSearchEmpty();

}
