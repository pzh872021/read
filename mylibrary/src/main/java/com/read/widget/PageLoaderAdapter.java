package com.read.widget;

import java.util.List;


public interface PageLoaderAdapter {

    int getPageCount(int section, PageProperty property);

    List<String> getPageLines(int section, int page, PageProperty property);

    int getSectionCount();

    String getSectionName(int section);

    boolean hasNextSection(int currentSection);

    boolean hasPreviousSection(int currentSection);


}
