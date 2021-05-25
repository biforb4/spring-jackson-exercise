package pl.infoshare.jackson.recordings.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import lombok.With;

import java.time.Duration;

@Value
public class Song implements Recording {
    @With
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    Integer id;
    String title;
    Duration duration;

    public Song(Integer id, @JsonProperty("subject") String title, Duration duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    @Override
    @JsonIgnore
    public RecordingType getType() {
        return RecordingType.SONG;
    }

    @JsonProperty("name")
    public String getTitle() {
        return title;
    }
}
