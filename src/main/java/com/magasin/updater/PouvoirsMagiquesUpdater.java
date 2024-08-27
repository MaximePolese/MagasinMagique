package com.magasin.updater;

import com.magasin.Item;

public class PouvoirsMagiquesUpdater extends Updater {
    @Override
    public void update(Item item) {
        updateSellIn(item);
        if (item.sellIn >= 0) item.quality -= 2;
        else item.quality -= 4;
        checkQuality(item);
    }
}