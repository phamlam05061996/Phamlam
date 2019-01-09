package comm.example.pc.storepham;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CommodityAdapter extends BaseAdapter {
    private Context context;
    private int layout ;
    private List<Commodity> commodityList;

    public CommodityAdapter(Context context, int layout, List<Commodity> commodityList) {
        this.context = context;
        this.layout = layout;
        this.commodityList = commodityList;
    }

    @Override
    public int getCount() {

        return commodityList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        ImageView imageHinhanh;
        TextView textviewTenSanPham,textviewHang,textviewKichthuoc,textviewBaohanh,textviewGia,textviewSoluongcon;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view =inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.textviewTenSanPham = view.findViewById(R.id.textviewTenSanPham);
            holder.textviewHang = view.findViewById(R.id.textviewHang);
            holder.textviewKichthuoc = view.findViewById(R.id.textviewKichthuoc);
            holder.textviewBaohanh = view.findViewById(R.id.textviewBaohanh);
            holder.textviewGia = view.findViewById(R.id.textviewGia);
            holder.textviewSoluongcon = view.findViewById(R.id.textviewSoluongcon);
            holder.imageHinhanh = view.findViewById(R.id.imageHinhanh);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        Commodity commodity = commodityList.get(i);
        holder.textviewTenSanPham.setText(commodity.getTenSanPham());
        holder.textviewHang.setText(commodity.getHang());
        holder.textviewKichthuoc.setText(commodity.getKichthuoc());
        holder.textviewBaohanh.setText(commodity.getBaohanh());
        holder.textviewGia.setText(commodity.getGia());
        holder.textviewSoluongcon.setText(commodity.getSoluongcon());
        holder.imageHinhanh.setImageResource(commodity.getHinhanh());
        return view;
    }
}
