package com.bbc.bbclub.c.Login.Index;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.c.Adapter.EditVideoAdapter;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;
import com.bbc.bbclub.c.bean.DataServer;

import butterknife.BindView;
import butterknife.OnClick;

public class EditVideoActivity extends BaseActivity {
    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @BindView(R.id.top_view_right_text)
    TextView top_view_right_text;


    @BindView(R.id.video_editvideo_list)
    RecyclerView video_editvideo_list;

    EditVideoAdapter editVideoAdapter;

    @BindView(R.id.image_right)
    ImageView image_right;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_edit_video;
    }
    @Override
    protected void initView() {
        super.initView();
        top_view_title.setText(getString(R.string.del_video));
        top_view_right_text.setVisibility(View.VISIBLE);
        top_view_right_text.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(this,R.mipmap.select_all_round), null,null,null);



 /*       image_right.setVisibility(View.VISIBLE);
        image_right.setImageResource(R.mipmap.select_all_round);*/
        video_editvideo_list.setLayoutManager(new GridLayoutManager(this,2));
//        video_editvideo_list.addItemDecoration(new SpaceItemDecoration(0));

        editVideoAdapter = new EditVideoAdapter(DataServer.getSampleData(5));
        video_editvideo_list.setAdapter(editVideoAdapter);
    }
    @OnClick({R.id.top_view_back,R.id.image_right,R.id.comfirm_del})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.image_right://点击全选
                StartActivityUtil.skipAnotherActivity(this,UpdatePersonInfoActivity.class);
                break;
            case R.id.comfirm_del://确认删除
                StartActivityUtil.skipAnotherActivity(this,DelVideoSuccessActivity.class);
                break;
            case R.id.top_view_right_text://点击全选

                break;
        }
    }

}
