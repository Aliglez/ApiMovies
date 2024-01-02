-- GENRES

INSERT INTO genres (id_genre, genre_name) VALUES (default,'Drama');
INSERT INTO genres (id_genre, genre_name) VALUES (default,'Comedy');
INSERT INTO genres (id_genre, genre_name) VALUES (default,'Fantasy');
INSERT INTO genres (id_genre, genre_name) VALUES (default,'Documental');


-- MOVIES

INSERT INTO movies (id_movie, title, release_year, description, running_time, genre_id) VALUES (default, 'La sociedad de la nieve', 2023, 'En 1972, el vuelo 571 de la Fuerza Aérea Uruguaya, fletado para llevar a un equipo de rugby a Chile, se estrella en un glaciar en el corazón de los Andes.', 144, 1);

INSERT INTO movies (id_movie, title, release_year, description, running_time, genre_id) VALUES (default, 'Renaissance: A Film by Beyoncé', 2023, 'El viaje del Renaissance World Tour, desde su inicio en la apertura en Estocolmo, Suecia, hasta el final en Kansas City, Missouri.', 170, 4);

INSERT INTO movies (id_movie, title, release_year, description, running_time, genre_id) VALUES (default,'Historia de un vecindario', 1947, 'En el Japón de la postguerra, un hombre encuentra en la calle a un niño perdido y lo lleva a su casa, pero nadie quiere acogerlo, ni siquiera por una noche.', 72, 1);

INSERT INTO movies (id_movie, title, release_year, description, running_time, genre_id) VALUES (default,'Fallen Leaves', 2023, 'Ansa es soltera y vive en Helsinki. Trabaja con un contrato de cero horas en un supermercado, abasteciendo los estantes; luego clasifica el plástico reciclable. ', 81, 2);

INSERT INTO movies (id_movie, title, release_year, description, running_time, genre_id) VALUES (default,'Godzilla: Minus One', 2023, 'Japón, desolado tras el fin de la segunda guerra mundial, entra en crisis tras la aparencia de un monstruo atómico.', 125, 3);




