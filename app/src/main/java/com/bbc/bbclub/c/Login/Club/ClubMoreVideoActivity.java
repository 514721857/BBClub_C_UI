package com.bbc.bbclub.c.Login.Club;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.c.Adapter.MyVideoAdapter;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class ClubMoreVideoActivity extends BaseActivity {

    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @BindView(R.id.video_morevideo_list)
    RecyclerView video_morevideo_list;

    MyVideoAdapter myVideoAdapter;



    @Override
    protected int setLayoutId() {
        return R.layout.activity_club__more__video;
    }

    @Override
    protected void initView() {
        top_view_title.setText(getString(R.string.video_list));
        video_morevideo_list.setLayoutManager(new GridLayoutManager(this,2));
        myVideoAdapter = new MyVideoAdapter();
        video_morevideo_list.setAdapter(myVideoAdapter);
    }
    @OnClick({R.id.top_view_back,R.id.myvideo_up,R.id.image_right})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.myvideo_up://拍视频

                break;

        }
    }
}
