package com.demo.springdemo.model;


import lombok.*;
import org.hibernate.internal.build.AllowPrintStacktrace;

@Getter
@Setter
/*@AllArgsConstructor
@NoArgsConstructor*/
@ToString
@Builder
public class Song {
    private String title;
    private String album;
    private int lengthInSeconds;
    private int releaseYear;

    //unused
    public String lengthToString(Song current) {
        int nrMin = current.lengthInSeconds / 60;
        int nrSec = current.lengthInSeconds % 59;
        return String.valueOf(nrMin) + ":" + String.valueOf(nrSec);
    }
}
