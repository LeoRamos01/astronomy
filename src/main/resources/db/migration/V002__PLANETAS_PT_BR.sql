ALTER TABLE planet ADD nomeBR varchar(255) AFTER name;

UPDATE planet SET nomeBr = 'Mercúrio' WHERE name = 'Mercury';
UPDATE planet SET nomeBr = 'Vênus' WHERE name = 'Venus';
UPDATE planet SET nomeBr = 'Terra' WHERE name = 'Earth';
UPDATE planet SET nomeBr = 'Marte' WHERE name = 'Mars';
UPDATE planet SET nomeBr = 'Júpiter' WHERE name = 'Jupiter';
UPDATE planet SET nomeBr = 'Saturno' WHERE name = 'Saturn';
UPDATE planet SET nomeBr = 'Urano' WHERE name = 'Uranus';
UPDATE planet SET nomeBr = 'Netuno' WHERE name = 'Neptune';
UPDATE planet SET nomeBr = 'Plutão' WHERE name = 'Pluto';