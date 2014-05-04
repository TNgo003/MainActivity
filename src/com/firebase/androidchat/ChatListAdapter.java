package com.firebase.androidchat;


import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.firebase.client.Query;

/**
 * User: greg
 * Date: 6/21/13
 * Time: 2:39 PM
 */

/**
 * This class is an example of how to use FirebaseListAdapter. It uses the <code>Chat</code> class to encapsulate the
 * data for each individual chat message
 */
public class ChatListAdapter extends FirebaseListAdapter<Chat> {

    // The username for this client. We use this to indicate which messages originated from this user
    private String username;

    public ChatListAdapter(Query ref, Activity activity, int layout, String username) {
        super(ref, Chat.class, layout, activity);
        this.username = username;
    }

    /**
     * Bind an instance of the <code>Chat</code> class to our view. This method is called by <code>FirebaseListAdapter</code>
     * when there is a data change, and we are given an instance of a View that corresponds to the layout that we passed
     * to the constructor, as well as a single <code>Chat</code> instance that represents the current data to bind.
     * @param view A view instance corresponding to the layout we passed to the constructor.
     * @param chat An instance representing the current state of a chat message
     */
    @Override
    protected void populateView(View view, Chat chat) {
        // Map a Chat object to an entry in our listview
        String author = chat.getAuthor();
        TextView authorText = (TextView)view.findViewById(R.id.author);
        ImageView image = (ImageView) view.findViewById(R.id.pic2);
        Log.d("WORDS", chat.getMessage());
        authorText.setText(author + ": ");
        // If the message was sent by this user, color it differently
        if(author == null)
        	author = "name";
        if (author.equals(username)) {
            authorText.setTextColor(Color.RED);
            view.findViewById(R.id.pic).setVisibility(View.INVISIBLE);
            view.findViewById(R.id.pic2).setVisibility(View.VISIBLE);
        } else {
            authorText.setTextColor(Color.BLUE);
            view.findViewById(R.id.pic).setVisibility(View.VISIBLE);
            view.findViewById(R.id.pic2).setVisibility(View.INVISIBLE);
            //image.setVisibility(View.INVISIBLE);
        }
        ((TextView)view.findViewById(R.id.message)).setText(chat.getMessage());
        
    }
}
