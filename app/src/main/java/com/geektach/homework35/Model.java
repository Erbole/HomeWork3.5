package com.geektach.homework35;

public class Model{
    private String names;
    private int flags;
    private int keuId;

    public Model(String names, int flags, int keuId) {
        this.names = names;
        this.flags = flags;
        this.keuId = keuId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public int getKeuId() {
        return keuId;
    }

    public void setKeuId(int keuId) {
        this.keuId = keuId;
    }

    public Model(String names, int flags) {
        this.names = names;
        this.flags = flags;
    }
}

