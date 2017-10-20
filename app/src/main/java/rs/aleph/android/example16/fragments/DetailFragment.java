package rs.aleph.android.example16.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import rs.aleph.android.example16.R;
import rs.aleph.android.example16.provider.ProviderCategory;
import rs.aleph.android.example16.provider.ProviderJelo;

/**
 * Created by androiddevelopment on 20.10.17..
 */

public class DetailFragment extends Fragment {

    private int position = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            position = savedInstanceState.getInt("position", 0);
        }

        ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getAssets().open(ProviderJelo.getJeloById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Finds "tvName" TextView and sets "text" property
        TextView tvNaziv = (TextView) findViewById(R.id.tv_naziv);
        tvNaziv.setText(ProviderJelo.getJeloById(position).getNaziv());

        // Finds "tvDescription" TextView and sets "text" property
        TextView tvOpis = (TextView) findViewById(R.id.tv_opis);
        tvOpis.setText(ProviderJelo.getJeloById(position).getOpis());

        // Finds "tvName" TextView and sets "text" property
        TextView tvSastojci = (TextView) findViewById(R.id.tv_sastojci);
        tvSastojci.setText(ProviderJelo.getJeloById(position).getSastojci());

        // Finds "tvDescription" TextView and sets "text" property
        TextView tvKalorijskaVrednost = (TextView) findViewById(R.id.tv_kalorijskaVrdnost);
        tvKalorijskaVrednost.setText(ProviderJelo.getJeloById(position).getKalorijskaVrednost() + "");

        TextView tvCena = (TextView) findViewById(R.id.tv_cena);
        tvCena.setText(ProviderJelo.getJeloById(position).getCena() + "");

        // Finds "spCategory" Spiner and sets "selection" property
        Spinner category = (Spinner) findViewById(R.id.sp_category);
        List<String> categories = ProviderCategory.getCategoryNaziv();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection((int)ProviderJelo.getJeloById(position).getCategory().getId());

        // Finds "btnBuy" Button and sets "onClickListener" listener
        Button btnBuy = (Button) findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "Narucili ste " + ProviderJelo.getJeloById(position).getNaziv() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        savedInstanceState.putInt("position", position);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void setContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "setContent() sets position to " + position);
    }
    public void updateContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "updateContent() sets position to " + position);

        ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getAssets().open(ProviderJelo.getJeloById(position).getImage());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Finds "tvName" TextView and sets "text" property
        TextView tvNaziv = (TextView) findViewById(R.id.tv_naziv);
        tvNaziv.setText(ProviderJelo.getJeloById(position).getNaziv());

        // Finds "tvDescription" TextView and sets "text" property
        TextView tvOpis = (TextView) findViewById(R.id.tv_opis);
        tvOpis.setText(ProviderJelo.getJeloById(position).getOpis());

        // Finds "tvName" TextView and sets "text" property
        TextView tvSastojci = (TextView) findViewById(R.id.tv_sastojci);
        tvSastojci.setText(ProviderJelo.getJeloById(position).getSastojci());

        // Finds "tvDescription" TextView and sets "text" property
        TextView tvKalorijskaVrednost = (TextView) findViewById(R.id.tv_kalorijskaVrdnost);
        tvKalorijskaVrednost.setText(ProviderJelo.getJeloById(position).getKalorijskaVrednost() + "");

        TextView tvCena = (TextView) findViewById(R.id.tv_cena);
        tvCena.setText(ProviderJelo.getJeloById(position).getCena() + "");

        // Finds "spCategory" Spiner and sets "selection" property
        Spinner category = (Spinner) findViewById(R.id.sp_category);
        List<String> categories = ProviderCategory.getCategoryNaziv();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection((int)ProviderJelo.getJeloById(position).getCategory().getId());

        // Finds "btnBuy" Button and sets "onClickListener" listener
        Button btnBuy = (Button) findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "Narucili ste " + ProviderJelo.getJeloById(position).getNaziv() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}
