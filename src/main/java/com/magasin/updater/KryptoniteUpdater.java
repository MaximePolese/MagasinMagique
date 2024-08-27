package com.magasin.updater;

import com.magasin.Item;

public class KryptoniteUpdater extends Updater {
    @Override
    public void update(Item item) {
        if (item.quality != 80) item.quality = 80;
    }
}