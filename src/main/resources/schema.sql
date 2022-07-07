CREATE TABLE t_song (
    id integer auto_increment,
    title varchar(50),
    album varchar(50),
    length_in_seconds integer,
    release_year integer,
    primary key(id)
);
CREATE TABLE t_band(
    id integer auto_increment,
    name varchar(50),
    genre varchar(50),
    country_of_origin varchar(50),
    year_of_founding integer,
    number_of_albums integer,
    primary key(id)
)