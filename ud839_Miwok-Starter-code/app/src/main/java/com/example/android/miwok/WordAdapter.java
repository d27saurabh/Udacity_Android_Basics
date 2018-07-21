package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    /**Resource ID for teh background color for this list of words*/
    private int mColorResourceId;

    /**
     *This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     * @param context current activity
     * @param words is the list of word to be displayed
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId ){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0,words);
        mColorResourceId = colorResourceId;
    }
    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_textView);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_textView);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()){
            //Set ImageView to the image resource specified in the current word
            iconView.setImageResource(currentWord.getImageResourceID());

            //make sure the word is visible
            iconView.setVisibility(View.VISIBLE);
        }
        else
        {
         //Otherwise hide the ImageView (set VISIBILITY to GONE)
            iconView.setVisibility(View.GONE);

        }

        //Set theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        //Set the background container of the text container View
        textContainer.setBackgroundColor(color);

        //Return teh whole lisy item layout(conatining 2 textViews) so that it can be shown in the listView
        return listItemView;

    }
}
