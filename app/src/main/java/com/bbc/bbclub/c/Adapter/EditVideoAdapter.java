package com.bbc.bbclub.c.Adapter;


import android.util.Log;

import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.View.CommonViewHolder;
import com.bbc.bbclub.c.bean.DataServer;
import com.bbc.bbclub.c.bean.PersonItem;
import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */


public class EditVideoAdapter extends BaseQuickAdapter<PersonItem,CommonViewHolder> {

    private List<PersonItem> datas;
    public EditVideoAdapter(List<PersonItem> data) {
        super(R.layout.item_editvideo_view, data);
        datas=data;
        Log.v("shen","初始化");

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

       /* baseViewHolder.setText(R.id.tv, personItem.getUserName());
        baseViewHolder.setText(R.id.tv1, personItem.getText());
        baseViewHolder.setImageResource(R.id.img, R.mipmap.ic_launcher_round);*/

    }
}