package com.library.library.pojo;

/**
 * 图书表
 */
public class doubanbookInfo {
    //全球图书编号
    private String isbn;
    //图书名
    private String title;
    //作者
    private String author;
    //作者介绍
    private String authorIntro;
    //标签
    private String tag;
    //评分人数
    private Integer numRaters;
    //评分
    private float average;
    //豆瓣id
    private String id;
    //精装/简装
    private String binding;
    //页数
    private Integer pages;
    //出版商
    private String publisher;
    //图书原名
    private String originTitle;
    //豆瓣链接
    private String url;
    //图书图片
    private String image;
    //图书概述
    private String summary;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorIntro() {
        return authorIntro;
    }

    public void setAuthorIntro(String authorIntro) {
        this.authorIntro = authorIntro;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getNumRaters() {
        return numRaters;
    }

    public void setNumRaters(Integer numRaters) {
        this.numRaters = numRaters;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getOriginTitle() {
        return originTitle;
    }

    public void setOriginTitle(String originTitle) {
        this.originTitle = originTitle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 有参构造
     * @param isbn
     * @param title
     * @param author
     * @param authorIntro
     * @param tag
     * @param numRaters
     * @param average
     * @param id
     * @param binding
     * @param pages
     * @param publisher
     * @param originTitle
     * @param url
     * @param image
     * @param summary
     */
    public doubanbookInfo(String isbn, String title, String author, String authorIntro, String tag, Integer numRaters, float average, String id, String binding, Integer pages, String publisher, String originTitle, String url, String image, String summary) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.authorIntro = authorIntro;
        this.tag = tag;
        this.numRaters = numRaters;
        this.average = average;
        this.id = id;
        this.binding = binding;
        this.pages = pages;
        this.publisher = publisher;
        this.originTitle = originTitle;
        this.url = url;
        this.image = image;
        this.summary = summary;
    }

    /**
     * 无参构造
     */
    public doubanbookInfo(){}
}
