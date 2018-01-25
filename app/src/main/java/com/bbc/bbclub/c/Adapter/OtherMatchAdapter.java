package com.bbc.bbclub.c.Adapter;


import android.view.View;

import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.View.CommonViewHolder;
import com.bbc.bbclub.c.bean.DataServer;
import com.bbc.bbclub.c.bean.PersonItem;
import com.chad.library.adapter.base.BaseQuickAdapter;

/**
 * Created by Administrator on 2017/8/24.
 */


public class OtherMatchAdapter extends BaseQuickAdapter<PersonItem,CommonViewHolder> implements BaseQuickAdapter.OnItemChildClickListener{
    public OtherMatchAdapter() {
        super(R.layout.item_othermatch_view, DataServer.getSampleData(3));
    }


    @Override
    protected void convert(CommonViewHolder baseViewHolder, PersonItem personItem) {
        baseViewHolder.addOnClickListener(R.id.btn_once_join);
       /* baseViewHolder.setText(R.id.tv, personItem.getUserName());
        baseViewHolder.setText(R.id.tv1, personItem.getText());
        baseViewHolder.setImageResource(R.id.img, R.mipmap.ic_launcher_round);*/

    }

    @Override
    public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {

    }
}