package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    //    public void updateQuality() {
//        for (int i = 0; i < items.length; i++) {
//            if (!items[i].name.equals("Comté")
//                    && !items[i].name.equals("Pass VIP Concert")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Kryptonite")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals("Pass VIP Concert")) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!items[i].name.equals("Kryptonite")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Comté")) {
//                    if (!items[i].name.equals("Pass VIP Concert")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals("Kryptonite")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }
//    }
    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Kryptonite")) item.sellIn--;
            applyQualityChange(item);

            if (item.name.equals("Kryptonite")) continue;

            checkValidity(item);
        }
    }

    public void applyQualityChange(Item item) {
        switch (item.name) {
            case "Comté":
                item.quality++;
                break;

            case "Pass VIP Concert":
                if (item.sellIn < 0) item.quality = 0;
                else if (item.sellIn < 5) item.quality += 3;
                else if (item.sellIn < 10) item.quality += 2;
                else item.quality++;
                break;

            case "Kryptonite":
                item.quality = 80;
                break;

            case "Pouvoirs magiques":
                if (item.sellIn >= 0) item.quality--;
                else item.quality -= 2;

            default:
                if (item.sellIn >= 0) item.quality--;
                else item.quality -= 2;

        }
    }

    public void checkValidity(Item item) {
        if (item.quality < 0) item.quality = 0;
        if (item.quality > 50) item.quality = 50;
    }
}
