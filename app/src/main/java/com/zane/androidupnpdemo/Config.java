package com.zane.androidupnpdemo;

/**
 * 说明：
 * 作者：zhouzhan
 * 日期：17/7/6 11:32
 */

public class Config {

    // mp4 格式
    //http://mp4.res.hunantv.com/video/1155/79c71f27a58042b23776691d206d23bf.mp4
    // ts 格式
//    public static String TEST_URL = "http://ottvideows.hifuntv.com/b36ea6f167c7b5785f3aa46c47b6d983/595f51c1/internettv/c1/2017/03/29/41E0B7C03C15AD472DB008A5FF4566EB.ts?uuid=0c18530ecda4454db49665b178396ff7";
    // flv 格式
//    public static String TEST_URL = "http://sdtel.stream.kugou.com/live/fx_hifi_1309321536.flv?token=0814adf3c22c79159a8081f066f421ca&us=0&tp=1594091794000523&ti=30&kd=69&ua=fx-alone-android&cn=fx&cp=2763559799&lr=0&fx-ps=2-0-1594091794525";
    // m3u8 格式
    public static String TEST_URL = "rtmp://183.57.150.180:1935/live/fx_hifi_1309321536_low_avc?token=3114f18ebdff028cacb3ace718686300&us=0&tp=1594091794000523&ti=30&kd=69&ua=fx-alone-android&cn=fx&cp=2763559799&lr=0&fx-ps=2-0-1594091794525";

    /*** 因为后台给的地址是固定的，如果不测试投屏，请设置为 false*/
    public static final boolean DLAN_DEBUG = true;
    /*** 轮询获取播放位置时间间隔(单位毫秒)*/
    public static final long REQUEST_GET_INFO_INTERVAL = 2000;
    /** 投屏设备支持进度回传 */
    private boolean hasRelTimePosCallback;
    private static Config mInstance;

    public static Config getInstance() {
        if (null == mInstance) {
            mInstance = new Config();
        }
        return mInstance;
    }

    public boolean getHasRelTimePosCallback() {
        return hasRelTimePosCallback;
    }

    public void setHasRelTimePosCallback(boolean hasRelTimePosCallback) {
        this.hasRelTimePosCallback = hasRelTimePosCallback;
    }

}
