ALTER TABLE planet ADD ordem int AFTER id;

UPDATE planet SET ordem = 1 WHERE name = 'Mercury';
UPDATE planet SET ordem = 2 WHERE name = 'Venus';
UPDATE planet SET ordem = 3 WHERE name = 'Earth';
UPDATE planet SET ordem = 4 WHERE name = 'Mars';
UPDATE planet SET ordem = 5 WHERE name = 'Jupiter';
UPDATE planet SET ordem = 6 WHERE name = 'Saturn';
UPDATE planet SET ordem = 7 WHERE name = 'Uranus';
UPDATE planet SET ordem = 8 WHERE name = 'Neptune';
UPDATE planet SET ordem = 9 WHERE name = 'Pluto';