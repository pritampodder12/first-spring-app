-- Initialize Student table

INSERT INTO students (name, birth_date)
SELECT 'Pritam Podder', '1996-03-22'
WHERE NOT EXISTS (SELECT 1 FROM students WHERE name = 'Pritam Podder' AND birth_date = '1996-03-22');

INSERT INTO students (name, birth_date)
SELECT 'Harry Potter', '1980-07-31'
WHERE NOT EXISTS (SELECT 1 FROM students WHERE name = 'Harry Potter' AND birth_date = '1980-07-31');

INSERT INTO students (name, birth_date)
SELECT 'Ron Weasley', '1980-03-01'
WHERE NOT EXISTS (SELECT 1 FROM students WHERE name = 'Ron Weasley' AND birth_date = '1980-03-01');

INSERT INTO students (name, birth_date)
SELECT 'Hermione Granger', '1980-07-30'
WHERE NOT EXISTS (SELECT 1 FROM students WHERE name = 'Hermione Granger' AND birth_date = '1980-07-30');

INSERT INTO students (name, birth_date)
SELECT 'Neville Longbottom', '1979-09-19'
WHERE NOT EXISTS (SELECT 1 FROM students WHERE name = 'Neville Longbottom' AND birth_date = '1979-09-19');


-- Initialize Course table

INSERT INTO course (code, description, subject)
SELECT 'CH104', 'you will learn spells concerned with giving an object new and unexpected properties.', 'Charms'
WHERE NOT EXISTS (SELECT 1 FROM course WHERE code = 'CH104' AND description = 'you will learn spells concerned with giving an object new and unexpected properties.' AND subject = 'Charms');

INSERT INTO course (code, description, subject)
SELECT 'DADA', 'In this class, you will learn defensive techniques against the dark arts.', 'Defence Against the Dark Arts'
WHERE NOT EXISTS (SELECT 1 FROM course WHERE code = 'DADA' AND description = 'In this class, you will learn defensive techniques against the dark arts.' AND subject = 'Defence Against the Dark Arts');

INSERT INTO course (code, description, subject)
SELECT 'HB311', 'In this class, you will learn the study of magical plants and how to take care of, utilise and combat them.', 'Herbology'
WHERE NOT EXISTS (SELECT 1 FROM course WHERE code = 'HB311' AND description = 'In this class, you will learn the study of magical plants and how to take care of, utilise and combat them.' AND subject = 'Herbology');

INSERT INTO course (code, description, subject)
SELECT 'HIS393', 'In this class, you will learn about significant events in wizarding history.', 'History of Magic'
WHERE NOT EXISTS (SELECT 1 FROM course WHERE code = 'HIS393' AND description = 'In this class, you will learn about significant events in wizarding history.' AND subject = 'History of Magic');

INSERT INTO course (code, description, subject)
SELECT 'POT102', 'In this class, you will learn correct mixing and stirring of ingredients to create mixtures with magical effects.', 'Potions'
WHERE NOT EXISTS (SELECT 1 FROM course WHERE code = 'POT102' AND description = 'In this class, you will learn correct mixing and stirring of ingredients to create mixtures with magical effects.' AND subject = 'Potions');

INSERT INTO course (code, description, subject)
SELECT 'TR442', 'In this class, you will learn the art of changing the form or appearance of an object.', 'Transfiguration'
WHERE NOT EXISTS (SELECT 1 FROM course WHERE code = 'TR442' AND description = 'In this class, you will learn the art of changing the form or appearance of an object.' AND subject = 'Transfiguration');