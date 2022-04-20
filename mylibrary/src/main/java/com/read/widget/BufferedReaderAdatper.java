package com.read.widget;


public abstract class BufferedReaderAdatper implements PageLoaderAdapter {


    @Override
    public abstract int getSectionCount();

    @Override
    public abstract String getSectionName(int section);
}
