package com.bbc.bbclub.c.Login.Index;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bbc.bbclub.c.Login.Club.UpSuccessActivity;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class RecordingVideoActivity extends BaseActivity {
    @BindView(R.id.top_view_title)
    TextView top_view_title;
    @Override
    protected int setLayoutId() {
        return R.layout.activity_recording_video;
    }
    @Override
    protected void initView() {
        super.initView();
        top_view_title.setText(getString(R.string.up_video_text));
    }
    @OnClick({R.id.top_view_back,R.id.up_comfirm})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.up_comfirm:
                StartActivityUtil.skipAnotherActivity(this,UpSuccessActivity.class);
                break;
            case R.id.top_view_back:
                finish();
                break;

        }
    }
}
