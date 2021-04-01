ALTER TABLE planet ADD imagem varchar(255) AFTER name;

UPDATE planet SET imagem = '/images/planetas/mercury.png' WHERE name = 'Mercury';
UPDATE planet SET imagem = '/images/planetas/venus.png' WHERE name = 'Venus';
UPDATE planet SET imagem = '/images/planetas/earth.png' WHERE name = 'Earth';
UPDATE planet SET imagem = '/images/planetas/mars.png' WHERE name = 'Mars';
UPDATE planet SET imagem = '/images/planetas/jupiter.png' WHERE name = 'Jupiter';
UPDATE planet SET imagem = '/images/planetas/saturn.png' WHERE name = 'Saturn';
UPDATE planet SET imagem = '/images/planetas/uranus.jpg' WHERE name = 'Uranus';
UPDATE planet SET imagem = '/images/planetas/neptune.jpg' WHERE name = 'Neptune';
UPDATE planet SET imagem = '/images/planetas/pluto.jpg' WHERE name = 'Pluto';
UPDATE planet SET imagem = '/images/planetas/ceres.jpg' WHERE name = 'Ceres';
UPDATE planet SET imagem = '/images/planetas/haumea.jpg' WHERE name = 'Haumea';
UPDATE planet SET imagem = '/images/planetas/makemake.png' WHERE name = 'Makemake';
UPDATE planet SET imagem = '/images/planetas/eris.jpg' WHERE name = 'Eris';