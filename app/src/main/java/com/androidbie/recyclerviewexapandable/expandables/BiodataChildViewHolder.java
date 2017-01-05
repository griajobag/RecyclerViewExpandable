package com.androidbie.recyclerviewexapandable.expandables;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.androidbie.recyclerviewexapandable.R;
import com.androidbie.recyclerviewexapandable.libmoduleExpandable.ViewHolder.ChildViewHolder;
import com.androidbie.recyclerviewexapandable.models.BiodataChildModel;

/**
 * Created by putuguna on 04/01/17.
 */

public class BiodataChildViewHolder extends ChildViewHolder {

    private TextView tvStatus;
    private TextView tvDesc;

    public BiodataChildViewHolder(View itemView) {
        super(itemView);

        tvDesc = (TextView) itemView.findViewById(R.id.text_view_desc);
        tvStatus  = (TextView) itemView.findViewById(R.id.text_view_status);
    }

    public void bind(BiodataChildModel biodataChildModel){
        Log.d("TAG", "appears " + getAdapterPosition());
        tvStatus.setText(biodataChildModel.getStatus());
        tvDesc.setText(biodataChildModel.getDescriptions());
    }

}
