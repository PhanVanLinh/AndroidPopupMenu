package vn.linh.androidpopupmenu.popupmenuinrecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import vn.linh.androidpopupmenu.R;
import vn.linh.androidpopupmenu.popupmenuinrecyclerview.model.RecyclerItem;

public class OneItemTypeAdapter extends RecyclerView.Adapter<OneItemTypeAdapter.ViewHolder> {
    private static final String TAG = "OneItemTypeAdapter";
    private List<RecyclerItem> data;

    public void setData(List<RecyclerItem> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RecyclerItem item = data.get(position);
        holder.bindItem(item);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView myTextView;

        private ViewHolder(final View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.info_text);
            itemView.findViewById(R.id.button_show).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showPopupMenu(itemView.getContext(), itemView.findViewById(R.id.button_show));
                }
            });
            itemView.setOnClickListener(this);
        }

        void bindItem(RecyclerItem item) {
            myTextView.setText(item.getTitle());
        }

        @Override
        public void onClick(View view) {
        }

        private void showPopupMenu(final Context context, View achor) {
            PopupMenu popup = new PopupMenu(context, achor);
            popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem item) {
                    Toast.makeText(context, "You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT)
                            .show();
                    return true;
                }
            });
            popup.show();
        }
    }
}