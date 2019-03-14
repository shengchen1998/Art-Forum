package DB_util;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;


public class post {
    /****the following variables are for displaying use****/
    public String Title;
    public String OwnerName = null;
    public String postContent;
    public Date postDate;
    boolean mLinkImage;
    public String link;
    public ArrayList<comment> mComments;
    /*******the following variables are for internal use****/
    public ObjectId _postId;
    public ObjectId ownerId;
    public ArrayList<ObjectId> mCommentIds;

    /*****for front-end Use Only******/
    // Note: if there is no link, please pass in an empty _link String.
    public post(String _Title, String _OwnerName, String _postContent, String _link,
                boolean isImage)
    {
        Title = _Title;
        OwnerName = _OwnerName;
        _postId = null;
        ownerId = null;
        mCommentIds = null;
        mComments = null;
        postContent = _postContent;
        if (_link.trim().isEmpty())
        {
            link = null;
        }
        else
        {
            link = _link;
        }
        mLinkImage = isImage;

    }
    /******for internal use***************/
    public post()
    {
        mComments = new ArrayList<comment>();
        mCommentIds = new ArrayList<ObjectId>();
        _postId = null;
        ownerId = null;
    }

}
