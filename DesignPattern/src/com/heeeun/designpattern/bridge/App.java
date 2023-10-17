package com.heeeun.designpattern.bridge;
//#endregion

// ex) jdbc
public class App {
    public static void main(String[] args) {
        Champion BraveAri = new 아리(new 용맹한전사());

        BraveAri.skillQ();
        BraveAri.skillW();

        
        Champion BraveMalpa = new 말파이트(new DJ());

        BraveMalpa.skillQ();
        BraveMalpa.skillW();
    }
}
