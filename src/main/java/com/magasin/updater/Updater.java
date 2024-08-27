package com.magasin.updater;

import com.magasin.Item;

public abstract class Updater {
    public abstract void update(Item item);

    protected void updateSellIn(Item item) {
        item.sellIn--;
    }

    protected void checkQuality(Item item) {
        if (item.quality < 0) item.quality = 0;
        if (item.quality > 50) item.quality = 50;
    }
}