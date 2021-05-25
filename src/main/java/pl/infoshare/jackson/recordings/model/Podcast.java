package pl.infoshare.jackson.recordings.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import lombok.With;

import java.time.LocalDate;

@Value
public class Podcast implements Recording {
    @With
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    Integer id;
    String title;
    @JsonProperty("date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    LocalDate dateOfRecording;

    public Podcast(Integer id,
                   String title,
                   @JsonProperty("date")
                   @JsonFormat(pattern = "dd.MM.yyyy")
                   LocalDate dateOfRecording) {
        this.id = id;
        this.title = title;
        this.dateOfRecording = dateOfRecording;
    }

    @Override
    @JsonIgnore
    public RecordingType getType() {
        return RecordingType.PODCAST;
    }
}
