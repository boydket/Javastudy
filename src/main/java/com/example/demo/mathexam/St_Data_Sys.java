package com.example.demo.mathexam;

public class St_Data_Sys {
    St_Data[] st;
    int total;

    St_Data_Sys() {
        st = new St_Data[20000];
        total=0;
    }

    void Insert(long no, String name) {
        if(total==0) {
            st[0] = new St_Data(no, name);
            return;
        }

       // for(int i=1; i<total; i++) {
        //   if (no)
      //  }
    }

    void MakeSpace(int idx) {
        for(int i=total; i>idx; i--) {
            Swap(i, i-1);
        }
    }

    void Swap(int a, int b) {
        St_Data tmp = st[b];
        st[b]=st[a];
        st[a]=tmp;
    }
}
