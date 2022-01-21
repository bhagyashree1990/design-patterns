package com.pluralsight.factory;

import com.pluralsight.factory.page.AboutPage;
import com.pluralsight.factory.page.CommentPage;
import com.pluralsight.factory.page.ContactPage;
import com.pluralsight.factory.page.PostPage;

public class Blog extends Website{
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
