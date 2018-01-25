package com.bbc.bbclub.c.Login.Index;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.c.Adapter.MoreVideoAdapter;
import com.bbc.bbclub.c.Adapter.SignRecordAdapter;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class SignRecordActivity extends BaseActivity {
    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @BindView(R.id.sign_record_list)
    RecyclerView sign_record_list;

    private SignRecordAdapter signRecordAdapter;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_sign_record;
    }

    @Override
    protected void initView() {
        top_view_title.setText(getString(R.string.sign_record));
        sign_record_list.setLayoutManager(new LinearLayoutManager(this));
        signRecordAdapter = new SignRecordAdapter();
        sign_record_list.setAdapter(signRecordAdapter);
    }

    @OnClick({R.id.top_view_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
        }
    }
}
