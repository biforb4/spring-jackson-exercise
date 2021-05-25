package pl.infoshare.jackson.recordings.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class AudioBookChapter {
    String title;

    @JsonCreator
    public AudioBookChapter(@JsonProperty("title") String title) {
        this.title = title;
    }
}
