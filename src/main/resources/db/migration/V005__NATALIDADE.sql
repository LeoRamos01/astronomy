ALTER TABLE planet ADD natalidade varchar(255) AFTER name;

UPDATE planet SET natalidade = 'mercuriano(s)' WHERE name = 'Mercury';
UPDATE planet SET natalidade = 'venusiano(s)' WHERE name = 'Venus';
UPDATE planet SET natalidade = 'terráqueo(o)' WHERE name = 'Earth';
UPDATE planet SET natalidade = 'marciano(s)' WHERE name = 'Mars';
UPDATE planet SET natalidade = 'jupieriano(s)' WHERE name = 'Jupiter';
UPDATE planet SET natalidade = 'saturniano(s)' WHERE name = 'Saturn';
UPDATE planet SET natalidade = 'uraniano(s)' WHERE name = 'Uranus';
UPDATE planet SET natalidade = 'netuniano(s)' WHERE name = 'Neptune';
UPDATE planet SET natalidade = 'plutoniano(s)' WHERE name = 'Pluto';