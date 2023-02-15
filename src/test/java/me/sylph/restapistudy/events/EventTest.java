package me.sylph.restapistudy.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {

    @Test
    public void builder() {
        Event event = Event.builder()
                .name("RESTAPI")
                .description("description")
                .build();
        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean(){

        // Given
        Event event = new Event();
        String restapi_set = "RESTAPI_SET";
        String description = "Description";

        // When
        event.setName(restapi_set);
        event.setDescription(description);

        // Then
        assertThat(event.getName()).isEqualTo(restapi_set);
        assertThat(event.getDescription()).isEqualTo(description);
    }

}