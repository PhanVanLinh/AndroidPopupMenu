package vn.linh.androidpopupmenu.popupmenuinrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import vn.linh.androidpopupmenu.R;
import vn.linh.androidpopupmenu.popupmenuinrecyclerview.adapter.OneItemTypeAdapter;
import vn.linh.androidpopupmenu.popupmenuinrecyclerview.model.RecyclerItem;

public class PopupMenuInsideRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu_inside_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        OneItemTypeAdapter adapter = new OneItemTypeAdapter();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);

        ArrayList<RecyclerItem> data = new ArrayList<>();
        data.add(new RecyclerItem("a", "b"));
        data.add(new RecyclerItem("c", "b"));
        data.add(new RecyclerItem("d", "b"));
        data.add(new RecyclerItem("e", "b"));
        data.add(new RecyclerItem("f", "b"));
        data.add(new RecyclerItem("g", "b"));
        data.add(new RecyclerItem("h", "b"));
        data.add(new RecyclerItem("j", "b"));
        data.add(new RecyclerItem("k", "b"));
        data.add(new RecyclerItem("l", "b"));
        data.add(new RecyclerItem("m", "b"));
        data.add(new RecyclerItem("n", "b"));
        data.add(new RecyclerItem("o", "b"));
        data.add(new RecyclerItem("u", "b"));
        data.add(new RecyclerItem("p", "b"));
        data.add(new RecyclerItem("q", "b"));
        data.add(new RecyclerItem("r", "b"));
        data.add(new RecyclerItem("s", "b"));
        data.add(new RecyclerItem("w", "b"));
        data.add(new RecyclerItem("y", "b"));

        adapter.setData(data);
    }
}
