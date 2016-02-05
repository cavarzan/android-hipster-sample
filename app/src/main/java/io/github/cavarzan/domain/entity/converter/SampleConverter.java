package io.github.cavarzan.domain.entity.converter;

import io.github.cavarzan.domain.entity.SampleEntity;
import io.github.cavarzan.model.Sample;

public class SampleConverter {

    public static Sample wrap(SampleEntity entity) {
        if (entity == null) return null;
        return Sample.builder()
                .id(entity.id)
                .build();
    }

    public static SampleEntity unwrap(Sample model) {
        SampleEntity entity = new SampleEntity();
        entity.id = model.id();
        return entity;
    }

}
