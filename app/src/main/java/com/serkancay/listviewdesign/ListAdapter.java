package com.serkancay.listviewdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by serkan on 9.03.2016.
 */
public class ListAdapter extends BaseAdapter {
    // Veri olarak kişi listesini kullanacak.
    private List<Kisi> list;
    LayoutInflater layoutInflater;
    Context context;

    public ListAdapter(Context context, List<Kisi> list) {
        this.context = context;
        // Layout Inflater tanımlanıyor...
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Burada inflate işlemi yapılıyor.
        // Tasarımını yaptığımız layout dosyamızı view olarak alıyoruz
        View satirView = layoutInflater.inflate(R.layout.satir_tasarimi, null);

        // Öğelerimizi satirView'dan çağırıyoruz.
        ImageView ivKisiResmi = (ImageView) satirView.findViewById(R.id.ivKisiResmi);
        TextView tvAd = (TextView) satirView.findViewById(R.id.tvAd);
        TextView tvSoyad = (TextView) satirView.findViewById(R.id.tvSoyad);
        TextView tvSehir = (TextView) satirView.findViewById(R.id.tvSehir);
        TextView tvIlgiAlani = (TextView) satirView.findViewById(R.id.tvIlgiAlani);

        // Mevcut pozisyon için kisi nesnesi oluşturuluyor.
        Kisi kisi = list.get(position);

        // Öğelerimize verilerimizi yüklüyoruz.
        ivKisiResmi.setImageResource(kisi.getResimId());
        tvAd.setText(kisi.getAd());
        tvSoyad.setText(kisi.getSoyad());
        tvSehir.setText(kisi.getSehir());
        tvIlgiAlani.setText(kisi.getIlgiAlani());

        // Mevcut satır için işlem tamam ve view return ediliyor.
        return satirView;
    }
}
