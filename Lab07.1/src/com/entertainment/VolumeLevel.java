package com.entertainment;

public enum VolumeLevel {
    OFF(0),
    SOFT(25),
    MEDIUM(50),
    LOUD(75),
    MAX(100);

    private int level;

    VolumeLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }
}

