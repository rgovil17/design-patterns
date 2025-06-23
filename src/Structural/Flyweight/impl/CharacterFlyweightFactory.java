package Structural.Flyweight.impl;

import Structural.Flyweight.interfaces.CharacterFlyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightFactory {
    private static final Map<String, CharacterFlyweight> flyweightCache = new HashMap<>();

    public static CharacterFlyweight getFlyweight(char symbol, String fontFamily, int fontSize, String color) {
        String key = String.format("%s-%s-%d-%s", symbol, fontFamily, fontSize, color);
        if (!flyweightCache.containsKey(key)) {
            flyweightCache.put(key, new CharacterGlyph(symbol, fontFamily, fontSize, color));
        }
        return flyweightCache.get(key);
    }

    public int getFlyweightCount() {
        return flyweightCache.size();
    }
}
