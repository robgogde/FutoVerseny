CREATE TABLE futo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nev VARCHAR(255) NOT NULL,
    eletkor INT NOT NULL,
    nem VARCHAR(50) NOT NULL
);

CREATE TABLE verseny (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nev VARCHAR(255) NOT NULL,
    tavolsag DECIMAL(10, 3) NOT NULL
);

CREATE TABLE eredmeny (
    id INT AUTO_INCREMENT PRIMARY KEY,
    futo_id INT NOT NULL,
    verseny_id INT NOT NULL,
    ido_eredmeny INT NOT NULL,
    FOREIGN KEY (futo_id) REFERENCES futo(id),
    FOREIGN KEY (verseny_id) REFERENCES verseny(id)
);
