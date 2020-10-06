package com.example.androidsupportdesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banner {
    private Integer image;

    public Banner(Integer image) {
        this.image = image;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
    public static List<Banner> getDataMock(){
        return new ArrayList<>(Arrays.asList(
                new Banner(R.drawable.rom),
                new Banner(R.drawable.unfami),
                new Banner(R.drawable.bigfoot),
                new Banner(R.drawable.blood),
                new Banner(R.drawable.breaksilent),
                new Banner(R.drawable.greenland),
                new Banner(R.drawable.hunter),
                new Banner(R.drawable.defend),
                new Banner(R.drawable.newmutan),
                new Banner(R.drawable.jungle),
                new Banner(R.drawable.zombie)
                ));
    }
}
