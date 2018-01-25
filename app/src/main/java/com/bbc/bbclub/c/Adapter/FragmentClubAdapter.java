package com.bbc.bbclub.c.Adapter;


import android.view.View;
import android.widget.Toast;

import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.View.CommonViewHolder;
import com.bbc.bbclub.c.bean.DataServer;
import com.bbc.bbclub.c.bean.PersonItem;
import com.chad.library.adapter.base.BaseQuickAdapter;

/**
 * Created by Administrator on 2017/8/24.
 */


public class FragmentClubAdapter extends BaseQuickAdapter<PersonItem,CommonViewHolder> implements BaseQuickAdapter.OnItemClickListener {
    public FragmentClubAdapter() {
        super(R.layout.item_fragmentclub_view, DataServer.getSampleData(10));
    }


    @Override
    protected void convert(CommonViewHolder baseViewHolder, PersonItem personItem) {
       /* baseViewHolder.setText(R.id.tv, personItem.getUserName());
        baseViewHolder.setText(R.id.tv1, personItem.getText());
        baseViewHolder.setImageResource(R.id.img, R.mipmap.ic_launcher_round);*/

    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

    }
}