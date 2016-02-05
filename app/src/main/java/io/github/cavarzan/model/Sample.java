package io.github.cavarzan.model;

import auto.parcel.AutoParcel;

import io.github.cavarzan.util.gson.AutoGson;

@AutoParcel
@AutoGson(autoValueClass = AutoParcel_Sample.class)
public abstract class Sample {

    public abstract Long id();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new AutoParcel_Sample.Builder();
    }

    @AutoParcel.Builder
    public abstract static class Builder {

        public abstract Builder id(Long id);

        public abstract Sample build();
    }

}
