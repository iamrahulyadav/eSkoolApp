package eskool.com.eskoolapp.Gallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import eskool.com.eskoolapp.Home.ParentHome;
import eskool.com.eskoolapp.New;
import eskool.com.eskoolapp.R;

/**
 * Created by user on 5/12/2017.
 */

public class GalleryParent2 extends Fragment {
    ImageView image;
    Toolbar toolbar;


    public GalleryParent2() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.gallery_parent2, container, false);
        image = (ImageView) view.findViewById(R.id.image);
        toolbar = (Toolbar) ((ParentHome) getContext()).findViewById(R.id.tool_bar);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), New.class);
                startActivity(intent);
            }
        });

        return view;

    }

    @Override
    public void onResume() {
        super.onResume();
        toolbar.setTitle("Gallery");
    }
}