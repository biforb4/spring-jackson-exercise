package pl.infoshare.jackson.recordings.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import lombok.With;

import java.util.List;

@Value
public class AudioBook implements Recording {
    @With
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    Integer id;
    String title;
    @JsonProperty(value = "chapters", access = JsonProperty.Access.WRITE_ONLY)
    List<AudioBookChapter> chapters;

    @Override
    @JsonIgnore
    public RecordingType getType() {
        return RecordingType.AUDIOBOOK;
    }

    @JsonProperty("numberOfChapters")
    public int getNumberOfChapters() {
        return chapters.size();
    }
}
