-- GENRES

INSERT INTO genres (id_genre, genre_name) VALUES (default,'Drama');
INSERT INTO genres (id_genre, genre_name) VALUES (default,'Comedy');
INSERT INTO genres (id_genre, genre_name) VALUES (default,'Fantasy');
INSERT INTO genres (id_genre, genre_name) VALUES (default,'Documental');

--ACTORS
INSERT INTO actors (id_actor, actor_name) VALUES (default, 'Enzo Vogrincic Roldán');
INSERT INTO actors (id_actor, actor_name) VALUES (default, 'Agustin Prdella');
INSERT INTO actors (id_actor, actor_name) VALUES (default, 'Beyonce');
INSERT INTO actors (id_actor, actor_name) VALUES (default, 'Diana Ross');
INSERT INTO actors (id_actor, actor_name) VALUES (default, 'Choko lida');
INSERT INTO actors (id_actor, actor_name) VALUES (default, 'Hohi Aoki');
INSERT INTO actors (id_actor, actor_name) VALUES (default, 'Eitaro Ozawa');
INSERT INTO actors (id_actor, actor_name) VALUES (default, 'Alma Pöysti');
INSERT INTO actors (id_actor, actor_name) VALUES (default, 'Jussi Vatanen');
INSERT INTO actors (id_actor, actor_name) VALUES (default, 'Ryunosuke Kamiki');
INSERT INTO actors (id_actor, actor_name) VALUES (default, 'Minami Hamabe');


-- MOVIES

INSERT INTO movies (id_movie, title, release_year, description, running_time, genre_id) VALUES (default, 'La sociedad de la nieve', 2023, 'En 1972, el vuelo 571 de la Fuerza Aérea Uruguaya, fletado para llevar a un equipo de rugby a Chile, se estrella en un glaciar en el corazón de los Andes.', 144, 1);

INSERT INTO movies (id_movie, title, release_year, description, running_time, genre_id) VALUES (default, 'Renaissance: A Film by Beyoncé', 2023, 'El viaje del Renaissance World Tour, desde su inicio en la apertura en Estocolmo, Suecia, hasta el final en Kansas City, Missouri.', 170, 4);

INSERT INTO movies (id_movie, title, release_year, description, running_time, genre_id) VALUES (default,'Historia de un vecindario', 1947, 'En el Japón de la postguerra, un hombre encuentra en la calle a un niño perdido y lo lleva a su casa, pero nadie quiere acogerlo, ni siquiera por una noche.', 72, 1);

INSERT INTO movies (id_movie, title, release_year, description, running_time, genre_id) VALUES (default,'Fallen Leaves', 2023, 'Ansa es soltera y vive en Helsinki. Trabaja con un contrato de cero horas en un supermercado, abasteciendo los estantes; luego clasifica el plástico reciclable. ', 81, 2);

INSERT INTO movies (id_movie, title, release_year, description, running_time, genre_id) VALUES (default,'Godzilla: Minus One', 2023, 'Japón, desolado tras el fin de la segunda guerra mundial, entra en crisis tras la aparencia de un monstruo atómico.', 125, 3);


/* --ACTORS_MOVIES

INSERT INTO actors_movies (actor_id, movie_id) VALUES (1, 1);
INSERT INTO actors_movies (actor_id, movie_id) VALUES (2, 1);
INSERT INTO actors_movies (actor_id, movie_id) VALUES (3, 2);
INSERT INTO actors_movies (actor_id, movie_id) VALUES (4, 2);
INSERT INTO actors_movies (actor_id, movie_id) VALUES (5, 3);
INSERT INTO actors_movies (actor_id, movie_id) VALUES (6, 3);
INSERT INTO actors_movies (actor_id, movie_id) VALUES (7, 3);
INSERT INTO actors_movies (actor_id, movie_id) VALUES (8, 4);
INSERT INTO actors_movies (actor_id, movie_id) VALUES (9, 4);
INSERT INTO actors_movies (actor_id, movie_id) VALUES (10, 5);
INSERT INTO actors_movies (actor_id, movie_id) VALUES (11, 5); */

