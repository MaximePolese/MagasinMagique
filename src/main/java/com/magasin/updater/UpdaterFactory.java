package com.magasin.updater;

import com.magasin.Item;

public class UpdaterFactory {
    public static Updater createItem(Item item) {
        return switch (item.name) {
            case "Kryptonite" -> new KryptoniteUpdater();
            case "Comté" -> new ComteUpdater();
            case "Pass VIP Concert" -> new PassVIPUpdater();
            case "Pouvoirs magiques" -> new PouvoirsMagiquesUpdater();
            default -> new DefaultUpdater();
        };
    }
}