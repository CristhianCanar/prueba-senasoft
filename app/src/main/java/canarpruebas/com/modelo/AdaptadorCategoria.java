package canarpruebas.com.modelo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import canarpruebas.com.R;

public class AdaptadorCategoria extends BaseAdapter {

    Context context;
    int[] imagenes = {R.drawable.hotel_img, R.drawable.logo_hotel};
    String[] listItems = {"Hotel", "Restaurante"};
    LayoutInflater layoutInflater;

    public AdaptadorCategoria(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return listItems.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imgCategoria;
        ImageView logoCategoria;
        TextView tituloCategoria;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = layoutInflater.inflate(R.layout.item_categoria, viewGroup, false);

        imgCategoria = itemView.findViewById(R.id.imgCategoria);
        logoCategoria = itemView.findViewById(R.id.logoCategoria);
        tituloCategoria = itemView.findViewById(R.id.textCategoria);

        imgCategoria.setImageResource(imagenes[0]);
        logoCategoria.setImageResource(imagenes[1]);
        tituloCategoria.setText(listItems[i]);

        return itemView;
    }



}
