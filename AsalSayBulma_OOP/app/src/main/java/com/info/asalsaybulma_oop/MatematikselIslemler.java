package com.info.asalsaybulma_oop;

public class MatematikselIslemler {

    public int sayi1,sayi2;


    public void Topla(int _sayi1, int _sayi2) {
            sayi1 = _sayi1;
            sayi2 = _sayi2;
            Yazdir(sayi1+sayi2);
        }


    public void Cikar(int _sayi1, int _sayi2) {
            sayi1 = _sayi1;
            sayi2 = _sayi2;
            Yazdir(sayi1-sayi2);
        }


        private void Yazdir (int sonuc) {
         System.out.println(sonuc);
        }

    }


