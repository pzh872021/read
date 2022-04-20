package com.read.widget;



public interface OnPageChangeListener {
    void onChapterChange(int pos);

    //页码改变
    void onPageCountChange(int count);

    //页面改变
    void onPageChange(int pos);
}
