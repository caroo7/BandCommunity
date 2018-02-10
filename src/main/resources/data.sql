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

INSERT INTO instrument (id, type, kind) VALUES (1, 'guitar', 'strings')
INSERT INTO instrument (id, type, kind) VALUES (2, 'bass', 'strings')
INSERT INTO instrument (id, type, kind) VALUES (3, 'violin', 'strings')
INSERT INTO instrument (id, type, kind) VALUES (4, 'organ', 'keyboards')
INSERT INTO instrument (id, type, kind) VALUES (5, 'piano', 'keyboards')
INSERT INTO instrument (id, type, kind) VALUES (6, 'drums', 'percussion')
INSERT INTO instrument (id, type, kind) VALUES (7, 'singing', 'voice')
INSERT INTO instrument (id, type, kind) VALUES (8, 'growling', 'voice')
INSERT INTO instrument (id, type, kind) VALUES (9, 'trumpet', 'wind-instruments')

INSERT INTO member_instrument (member_id, instrument_id) VALUES (1, 7)
INSERT INTO member_instrument (member_id, instrument_id) VALUES (1, 2)
INSERT INTO member_instrument (member_id, instrument_id) VALUES (2, 6)
INSERT INTO member_instrument (member_id, instrument_id) VALUES (3, 8)
INSERT INTO member_instrument (member_id, instrument_id) VALUES (3, 3)
INSERT INTO member_instrument (member_id, instrument_id) VALUES (3, 9)
INSERT INTO member_instrument (member_id, instrument_id) VALUES (4, 7)
INSERT INTO member_instrument (member_id, instrument_id) VALUES (4, 3)
