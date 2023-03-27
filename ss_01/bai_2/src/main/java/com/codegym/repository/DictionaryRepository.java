package com.codegym.repository;

import java.security.Signature;
import java.util.ArrayList;

public class DictionaryRepository implements IDictionaryRepository{

   public String search(String tiengViet){
       String[] listTiengViet={"một","hai","ba","bốn","năm"};
       String[] listTiengAnh={"one","two","three","four","five"};
        for (int i=0; i<listTiengViet.length;i++){
            if (tiengViet.toLowerCase().equals(listTiengViet[i].toLowerCase())){
                return listTiengAnh[i];
            }
        }
        return null;
    }
}
