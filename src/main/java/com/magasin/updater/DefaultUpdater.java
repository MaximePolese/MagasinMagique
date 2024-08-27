package com.magasin.updater;

import com.magasin.Item;

public class DefaultUpdater extends Updater {
    @Override
    public void update(Item item) {
        updateSellIn(item);
        if (item.sellIn >= 0) item.quality--;
        else item.quality -= 2;
        checkQuality(item);
    }
}