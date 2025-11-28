package cz.czechitas.java2webapps.ukol7.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Length(min=3, max=100)
  @NotBlank
  private String slug;

  @Length(min=3, max=100)
  @NotBlank
  private String author;

  @Length(min=3, max=255)
  @NotBlank
  private String title;

  @NotBlank
  private String perex;

  @NotBlank
  private String body;

  @PastOrPresent
  private LocalDate published;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPerex() {
    return perex;
  }

  public void setPerex(String perex) {
    this.perex = perex;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public LocalDate getPublished() {
    return published;
  }

  public void setPublished(LocalDate published) {
    this.published = published;
  }
}
