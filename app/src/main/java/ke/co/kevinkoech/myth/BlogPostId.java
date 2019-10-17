package ke.co.kevinkoech.myth;

import android.support.annotation.NonNull;

import com.google.firebase.firestore.Exclude;

class BlogPostId {
    @Exclude
    String BlogPostId;
    @SuppressWarnings (value="unchecked")

    <T extends BlogPostId> T withId(@NonNull final String id) {
        this.BlogPostId = id;

        return (T) this;
    }

}
