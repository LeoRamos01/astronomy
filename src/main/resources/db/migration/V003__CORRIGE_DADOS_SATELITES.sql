 -- densidade de g/cm³ para kg/m³
 -- trocando raio para diâmetro
 -- Calculando gravidade superficial a partir de GM conforme fórmula:
 -- 	satelite.gm / (satelite.radius * satelite.radius) * 1000

UPDATE satellite
SET density = density * 1000,
    radius = radius * 2;


ALTER TABLE satellite ADD surfaceGravity decimal(16, 6);


ALTER TABLE satellite CHANGE radius diameter decimal(16, 6);


UPDATE satellite
SET surfaceGravity = gm / (diameter/2 * diameter/2) * 1000;