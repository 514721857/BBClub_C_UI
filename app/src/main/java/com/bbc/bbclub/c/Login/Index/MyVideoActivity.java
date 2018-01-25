package com.bbc.bbclub.c.Login.Index;

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

public class MyVideoActivity extends BaseActivity {


    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @BindView(R.id.video_myvideo_list)
    RecyclerView video_myvideo_list;

    MyVideoAdapter myVideoAdapter;

    @BindView(R.id.image_right)
    ImageView image_right;



    @Override
    protected int setLayoutId() {
        return R.layout.activity_my_video;
    }

    @Override
    protected void initView() {
        top_view_title.setText(getString(R.string.my_video));
        image_right.setVisibility(View.VISIBLE);
        image_right.setImageResource(R.mipmap.edit);
        video_myvideo_list.setLayoutManager(new GridLayoutManager(this,2));
        myVideoAdapter = new MyVideoAdapter();
        video_myvideo_list.setAdapter(myVideoAdapter);
    }
    @OnClick({R.id.top_view_back,R.id.myvideo_up,R.id.image_right})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.myvideo_up://拍视频
                StartActivityUtil.skipAnotherActivity(this,RecordingVideoActivity.class);
                break;
            case R.id.image_right:
                StartActivityUtil.skipAnotherActivity(this,EditVideoActivity.class);
                break;
        }
    }
}
