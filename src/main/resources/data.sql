INSERT INTO member (id, name, surname, country) VALUES (1, 'krzysiek', 'dudziak', 'niemcy');
INSERT INTO member (id, name, surname, country) VALUES (2, 'jakub', 'dudziak', 'burkina faso');
INSERT INTO member (id, name, surname, country) VALUES (3, 'kazimierz', 'paryciarz', 'polska');
INSERT INTO member (id, name, surname, country) VALUES (4, 'james', 'hatfield', 'USA');

INSERT INTO band (id, name, type, country, city) VALUES (1, 'dudzioki', 'metallica', 'niemcy', 'berlin');
INSERT INTO band (id, name, type, country, city) VALUES (2, 'metallica', 'metal', 'USA', 'los angeles');
INSERT INTO band (id, name, type, country, city) VALUES (3, 'paryta', 'melodic black metal', 'polska', 'piwniczna');

INSERT INTO member_band (band_id, member_id) VALUES (1, 1);
INSERT INTO member_band (band_id, member_id) VALUES (1, 2);
INSERT INTO member_band (band_id, member_id) VALUES (2, 4);
INSERT INTO member_band (band_id, member_id) VALUES (3, 3);