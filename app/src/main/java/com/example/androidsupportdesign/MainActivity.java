package com.example.androidsupportdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvBanner,mRcvProduct;
    BannerAdapter mBannerAdapter;
    List<Banner> mArrayBanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRcvBanner = findViewById(R.id.recyclerViewBanner);
        mRcvProduct = findViewById(R.id.recyclerViewProduct);

        mArrayBanner = Banner.getDataMock();
        mBannerAdapter = new BannerAdapter(mArrayBanner);

        mRcvBanner.setAdapter(mBannerAdapter);
        mRcvProduct.setAdapter(mBannerAdapter);
    }
}