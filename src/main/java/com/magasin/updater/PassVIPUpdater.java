package com.magasin.updater;

import com.magasin.Item;

public class PassVIPUpdater extends Updater {
    @Override
    public void update(Item item) {
        updateSellIn(item);
        if (item.sellIn < 0) item.quality = 0;
        else if (item.sellIn < 5) item.quality += 3;
        else if (item.sellIn < 10) item.quality += 2;
        else item.quality ++;
        checkQuality(item);
    }
}