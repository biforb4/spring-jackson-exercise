package pl.infoshare.jackson.recordings.model;

public interface Recording {
    Integer getId();
    RecordingType getType();
    String getTitle();
    Recording withId(Integer id);


    default RecordingId getExternalId() {
        return new RecordingId(getId(), getType());
    }
}
