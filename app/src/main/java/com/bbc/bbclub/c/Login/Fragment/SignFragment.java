package com.bbc.bbclub.c.Login.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.c.Login.Index.MedalDetailActivity;
import com.bbc.bbclub.c.Login.Index.NextMatchActivity;
import com.bbc.bbclub.c.Login.Index.RecentMatchActivity;
import com.bbc.bbclub.c.Login.Index.SignRecordActivity;
import com.bbc.bbclub.c.Login.Index.UpdatePersonInfoActivity;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;
import com.bbc.bbclub.c.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignFragment extends BaseFragment {

    @BindView(R.id.sign_times_text)
    TextView sign_times_text;

    @Override
    protected int setLayoutId() {
        return R.layout.fragment_sign;
    }

    @Override
    protected void initView() {
        super.initView();
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @OnClick({R.id.sign_times_text,R.id.sign_matchs_text,R.id.matchs_days_text,R.id.xunzhang_times_text})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sign_times_text:
                StartActivityUtil.skipAnotherActivity(getActivity(),SignRecordActivity.class);
                break;
            case R.id.sign_matchs_text:
                StartActivityUtil.skipAnotherActivity(getActivity(),RecentMatchActivity.class);
                break;
            case R.id.matchs_days_text:
                StartActivityUtil.skipAnotherActivity(getActivity(),NextMatchActivity.class);
                break;
            case R.id.xunzhang_times_text:
                StartActivityUtil.skipAnotherActivity(getActivity(),MedalDetailActivity.class);
                break;
        }
    }
}
