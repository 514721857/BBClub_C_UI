package com.bbc.bbclub.c.Adapter;


import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.View.CommonViewHolder;
import com.bbc.bbclub.c.bean.DataServer;
import com.bbc.bbclub.c.bean.PersonItem;
import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */


public class MyVideoAdapter extends BaseQuickAdapter<PersonItem,CommonViewHolder> {
    List<PersonItem> datas;
    public MyVideoAdapter() {
        super(R.layout.item_myvideo_view, DataServer.getSampleData(10));
        datas=DataServer.getSampleData(10);
    }


    @Override
    protected void convert(CommonViewHolder baseViewHolder, PersonItem personItem) {
        switch (baseViewHolder.getLayoutPosition() %
                2) {
            case 0:

                if( baseViewHolder.getLayoutPosition()==datas.size()-1&& baseViewHolder.getLayoutPosition()>0) {
                    baseViewHolder.setBackgroundRes(R.id.video_bg,R.mipmap.video_bg);
                }else {
                    baseViewHolder.setBackgroundRes(R.id.video_bg,R.mipmap.video_bg_left);
                }
                break;
            case 1:
                baseViewHolder.setBackgroundRes(R.id.video_bg,R.mipmap.video_bg_right);
                break;

        }

    }
}