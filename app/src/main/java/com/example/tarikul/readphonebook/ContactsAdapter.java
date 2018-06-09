package com.example.tarikul.readphonebook;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tarikul on 6/7/2018.
 */

public class ContactsAdapter extends BaseAdapter {
    private ArrayList<ContactModel> mcontacts;
    private LayoutInflater mInflater;
    Context mContext;

    public ContactsAdapter(final ArrayList<ContactModel> contact, Context context) {
        this.mcontacts = contact;
        this.mContext = context;
        mInflater = LayoutInflater.from(context);


    }


    @Override
    public int getCount() {
        return mcontacts.size();
    }

    @Override
    public Object getItem(int position) {
        return mcontacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        final ViewHolder holder;
        final View rootView;
        if (convertView == null) {
            holder = new ViewHolder();
            rootView = mInflater.inflate(R.layout.contact_list_item, parent, false);
            holder.contactsName = (TextView) rootView.findViewById(R.id.txv_user_name);
            holder.phoneNumber = (TextView) rootView.findViewById(R.id.txv_user_number);

            rootView.setTag(holder);
        } else {
            rootView = convertView;
            holder = (ViewHolder) rootView.getTag();
        }


        ContactModel contact = mcontacts.get(position);
        String name = contact.getUserName();
        String phone = contact.getContactNumber();

        holder.contactsName.setText(name);
        holder.phoneNumber.setText(phone);


        return rootView;
    }




    // /////////// //
    // ViewHolder //
    // ///////// //
    private static class ViewHolder {
        TextView contactsName,phoneNumber;


    }





}
