Să se realizeze un proiect web dinamic care permite gestiunea simplificată a mașinilor din parcul
auto al unei firme. Accesul în aplicație se realizează prin utilizator şi parolă. Persoanele autorizate să
acceseze aplicația pot avea următoarele roluri:
- rolul de utilizator (ROLE_USER) care poate să vizualizeze datele despre mașini și poate le filtreze
aplicând filtre dinamice
- rolul de editor (ROLE_EDITOR) poate vizualiza şi filtra datele despre maşini, dar în plus poate şi
adăuga, modifica sau şterge maşini.
Pentru simplitate, conturile utilizatorilor se vor salva în baza de date prin comenzi SQL completate
în fişierul data.sql (opțional poate să fie făcut încă un rol, cel de administrator, care gestionează conturile).
Tot opțional se poate dezvolta și posibilitatea de înregistrare în aplicație în vederea obținerii unui cont de
utilizator.
Aplicaţia va avea două tabele MySQL:
• utilizatori cu câmpurile id_utilizator – cheie primara si autoincrement, nume, utilizator, parola - se va
salva criptograma parolei obţinută prin criptarea cu BCryptPasswordEncoder(), rolul (cu valorile posibile
ROLE_USER, ROLE_EDITOR)
• masini (nr_inmatriculare – cheie primara), id_utilizator (id-ul utilizatorului care a adăugat maşina),
marca, modelul, cularea, anul_fabricatiei, capacitatea_cilindrica, tipul_de_combustibil, puterea, cuplul,
volumul_portbagajului, pretul
