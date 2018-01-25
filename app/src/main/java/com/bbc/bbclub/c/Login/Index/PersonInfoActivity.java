package com.bbc.bbclub.c.Login.Index;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class PersonInfoActivity extends BaseActivity {
    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.btn_next)
    Button btn_next;

    @BindView(R.id.image_right)
    ImageView image_right;



    @Override
    protected int setLayoutId() {
        return R.layout.activity_person_info;
    }
    @Override
    protected void initImmersionBar() {
        super.initImmersionBar();
    }
    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void initView() {
        super.initView();
        image_right.setVisibility(View.VISIBLE);
        image_right.setImageResource(R.mipmap.edit);
    }
    @OnClick({R.id.top_view_back,R.id.image_right,R.id.info_myvideo})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.image_right:
                StartActivityUtil.skipAnotherActivity(this,UpdatePersonInfoActivity.class);
                break;
            case R.id.info_myvideo:
                StartActivityUtil.skipAnotherActivity(this,MyVideoActivity.class);
                break;
        }
    }
}
