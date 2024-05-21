-- Futók
INSERT INTO futo (nev, eletkor, nem) VALUES ('Minta Péter', 25, 'Férfi');
INSERT INTO futo (nev, eletkor, nem) VALUES ('Mézga Géza', 30, 'Nő');
INSERT INTO futo (nev, eletkor, nem) VALUES ('Sánta Sára', 28, 'Férfi');
INSERT INTO futo (nev, eletkor, nem) VALUES ('Jancsi Juliskája', 22, 'Nő');

-- Versenyek
INSERT INTO verseny (nev, tavolsag) VALUES ('Budapest Marathon', 42.195);
INSERT INTO verseny (nev, tavolsag) VALUES ('Balaton Félmaraton', 21.0975);

-- Eredmények
INSERT INTO eredmeny (futo_id, verseny_id, ido_eredmeny) VALUES (1, 1, 240);
INSERT INTO eredmeny (futo_id, verseny_id, ido_eredmeny) VALUES (2, 1, 260);
INSERT INTO eredmeny (futo_id, verseny_id, ido_eredmeny) VALUES (3, 1, 250);
INSERT INTO eredmeny (futo_id, verseny_id, ido_eredmeny) VALUES (4, 1, 270);
INSERT INTO eredmeny (futo_id, verseny_id, ido_eredmeny) VALUES (1, 2, 120);
INSERT INTO eredmeny (futo_id, verseny_id, ido_eredmeny) VALUES (2, 2, 130);
