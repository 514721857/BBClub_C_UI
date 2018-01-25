package com.bbc.bbclub.c.UnLogin;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bbc.bbclub.c.Adapter.HomeShufAdapter;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;
import com.xyz.xruler.XyzRuler;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.BindView;
import butterknife.OnClick;

public class EditInfoActivity extends BaseActivity implements HomeShufAdapter.OnPageSelectListener {

    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.info_height)
    TextView info_height;

    @BindView(R.id.ruler)
    XyzRuler ruler;

    @BindView(R.id.btn_next)
    Button btn_next;

    @BindView(R.id.vp_home_shuf)
    ViewPager vp_home_shuf;

    @BindView(R.id.info_sex)
    RelativeLayout rl_home_shuf;

    private HomeShufAdapter mShufAdapter;

    private List<ImageView> mShufImages;


    @Override
    protected void initImmersionBar() {
        super.initImmersionBar();
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_edit_info;
    }
    @Override
    protected void initView() {
        /**
         * 设置选中的条目
         */

        ruler.setOnSelectItem(new XyzRuler.SelectItem() {
            @Override
            public int setSelectItem() {
                return 170;
            }
        });

        /**
         * 监听拖动时值得变化
         */

        ruler.setOnRulerValueChangeListener(new XyzRuler.RulerValue() {
            @Override
            public void value(int value) {
                info_height.setText(value+"\ncm");
            }
        });
        //性别选择
        mShufImages = new ArrayList<>();

        ImageView  imageView=new ImageView(this);
        imageView.setImageResource(R.mipmap.info_boy);

        ImageView  imageView1=new ImageView(this);
        imageView1.setImageResource(R.mipmap.info_girl);

        mShufImages.add(imageView);
        mShufImages.add(imageView1);


        mShufAdapter = new HomeShufAdapter(mShufImages);
        mShufAdapter.setOnPageSelectListener(this);

        vp_home_shuf.setAdapter(mShufAdapter);
        vp_home_shuf.addOnPageChangeListener(mShufAdapter);
        vp_home_shuf.setOffscreenPageLimit(2);
        rl_home_shuf.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return vp_home_shuf.dispatchTouchEvent(event);
            }
        });

    }

    @OnClick({R.id.top_view_back,R.id.btn_next})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.btn_next:
                StartActivityUtil.skipAnotherActivity(this,EditNameActivity.class);
                break;
        }
    }

    @Override
    public void select(int position) {
        if(position==0){
            Toast.makeText(this,"男",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"女",Toast.LENGTH_SHORT).show();
        }
    }
}
