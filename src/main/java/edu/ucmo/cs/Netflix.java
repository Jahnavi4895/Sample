package edu.ucmo.cs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "netflix")
public class Netflix {
    @Id
    private String _id;
    private String age_certification;
    private String description;
    private List<String> genres;

    private String id;
    private List<String> production_countries;
    private Integer release_year;
    private Integer runtime;
    private String title;
    private String type;

    public Netflix() {

    }

    public Netflix(String _id, String age_certification, String description, List<String> genres, String id, List<String> production_countries, Integer release_year, Integer runtime, String title, String type) {
        this._id = _id;
        this.age_certification = age_certification;
        this.description = description;
        this.genres = genres;
        this.id = id;
        this.production_countries = production_countries;
        this.release_year = release_year;
        this.runtime = runtime;
        this.title = title;
        this.type = type;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAge_certification() {
        return age_certification;
    }

    public void setAge_certification(String age_certification) {
        this.age_certification = age_certification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getProduction_countries() {
        return production_countries;
    }

    public void setProduction_countries(List<String> production_countries) {
        this.production_countries = production_countries;
    }

    public Integer getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Integer release_year) {
        this.release_year = release_year;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
