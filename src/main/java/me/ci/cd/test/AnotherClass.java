/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.ci.cd.test;

/**
 *
 * @author idmig
 */
public class AnotherClass {
    
    private String with;
    private int Another;
    private boolean things;
    private String more;

    public AnotherClass() {
    }

    public AnotherClass(String with, int Another, boolean things, String more) {
        this.with = with;
        this.Another = Another;
        this.things = things;
        this.more = more;
    }

    public String getWith() {
        return with;
    }

    public void setWith(String with) {
        this.with = with;
    }

    public int getAnother() {
        return Another;
    }

    public void setAnother(int Another) {
        this.Another = Another;
    }

    public boolean isThings() {
        return things;
    }

    public void setThings(boolean things) {
        this.things = things;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    @Override
    public String toString() {
        return "AnotherClass{" + "with=" + with + ", Another=" + Another + ", things=" + things + ", more=" + more + '}';
    }
    
    
    
    
}
