package com.example.frontend4backendbasic;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookmarkAjaxRestController {

  private List<Bookmark> bookmarks = new ArrayList<>();

  @RequestMapping(method = RequestMethod.POST, path = "/bookmark")
  public String registerBookmark(@RequestBody Bookmark bookmark) {
    bookmarks.add(bookmark);
    return "registered";
  }

  @RequestMapping(method = RequestMethod.GET, path = "/bookmark")
  public List<Bookmark> getBookmarks() {
    return bookmarks;
  }
}
