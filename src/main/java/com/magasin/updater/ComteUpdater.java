package com.magasin.updater;

import com.magasin.Item;

public class ComteUpdater extends Updater {
    @Override
    public void update(Item item) {
        updateSellIn(item);
        item.quality++;
        checkQuality(item);
    }
}