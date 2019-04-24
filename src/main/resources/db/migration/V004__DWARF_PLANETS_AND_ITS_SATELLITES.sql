
INSERT INTO planet
(name, nomeBR, mass, diameter, density, gravity, escape_velocity, rotation_period, length_of_day, distance_from_sun, perihelion, aphelion, orbital_period, orbital_velocity, orbital_inclination, orbital_eccentricity, obliquity_to_orbit, mean_temperature, surface_pressure, number_of_moons, has_ring_system, has_global_magnetic_field)
VALUES('Eris', 'Éris', 0.0166, 2326.000000, 2520.000000, 0.82, 1.38, 0.000000, 25.900000, 10166.000000, 5723.000000, 14602.000000, 203830.000000, 3.4338, 0.000000, 0.44068, 0.000000, -230.2, 0.000000, 1, 0, 0);

INSERT INTO satellite
(planet_id, name, gm, diameter, density, magnitude, albedo, surfaceGravity)
VALUES((SELECT id FROM planet WHERE name = "Eris"), 'Dysnomia', 0.0, 700.000000, 0.000000, 25.4, 0.04, 0.0);

INSERT INTO planet
(name, nomeBR, mass, diameter, density, gravity, escape_velocity, rotation_period, length_of_day, distance_from_sun, perihelion, aphelion, orbital_period, orbital_velocity, orbital_inclination, orbital_eccentricity, obliquity_to_orbit, mean_temperature, surface_pressure, number_of_moons, has_ring_system, has_global_magnetic_field)
VALUES('Haumea', 'Haumea', 0.004006, 1632.000000, 1885.000000, 0.401, 0.809, 0.163146, 3.9155, 6482.7, 5242.8, 7722.45, 103774.000000, 4.531, 0.000000, 0.19126, 0.000000, -241.0, 0.000000, 2, 0, 0);

INSERT INTO satellite
(planet_id, name, gm, diameter, density, magnitude, albedo, surfaceGravity)
VALUES((SELECT id FROM planet WHERE name = "Haumea"), 'Hi\'iaka', 0.0, 310.000000, 0.000000, 0.0, 0.0, 0.0);

INSERT INTO satellite
(planet_id, name, gm, diameter, density, magnitude, albedo, surfaceGravity)
VALUES((SELECT id FROM planet WHERE name = "Haumea"), 'Namaka', 0.0, 170.000000, 0.000000, 0.0, 0.0, 0.0);

INSERT INTO planet
(name, nomeBR, mass, diameter, density, gravity, escape_velocity, rotation_period, length_of_day, distance_from_sun, perihelion, aphelion, orbital_period, orbital_velocity, orbital_inclination, orbital_eccentricity, obliquity_to_orbit, mean_temperature, surface_pressure, number_of_moons, has_ring_system, has_global_magnetic_field)
VALUES('Ceres', 'Ceres', 0.0009393, 946.000000, 2161.000000, 0.28, 0.51, 0.000000, 9.074170, 414.01, 382.62, 445.41, 1681.63, 17.905, 0.000000, 0.075823, 0.000000, -38.0, 0.000000, 0, 0, 0);

INSERT INTO planet
(name, nomeBR, mass, diameter, density, gravity, escape_velocity, rotation_period, length_of_day, distance_from_sun, perihelion, aphelion, orbital_period, orbital_velocity, orbital_inclination, orbital_eccentricity, obliquity_to_orbit, mean_temperature, surface_pressure, number_of_moons, has_ring_system, has_global_magnetic_field)
VALUES('Makemake', 'Makemake', 0.0044, 1.430, 2300.000000, 0.5, 0.8, 0.000000, 22.8266, 6815.8, 5738.6, 7892.9, 112327, 4.419, 0.000000, 0.15804, 0.000000, -239.0, 0.000000, 1, 0, 0);

INSERT INTO satellite
(planet_id, name, gm, diameter, density, magnitude, albedo, surfaceGravity)
VALUES((SELECT id FROM planet WHERE name = "Makemake"), 'S/2015 (136472) 1', 0.0, 175.000000, 0.000000, 0.0, 0.0, 0.0);