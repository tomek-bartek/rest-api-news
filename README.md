# rest-api-news
Aplikacja w SpringBoot. Pozwala na wykonanie podstawowych operacji CRUD na podręcznej bazie danych H2. Obiektami, na których wykonywane są operacje to Artykuły.
Artykuł (News) składa się z pól:
-id: String
-author: String
-content: String
-date: LocalDate 
-nameOfMagazine: String
-timestamp (generowany automatycznie przy tworzeniu obiektu i dodaniu do bazy danych). 


Aplikacja obsługuje zapytania:
1. Wyświetlania wszystkich dodanych artykułów (newsów), posortowanych po dacie, pod adresem:
/newses/
Standardowe zapytanie GET.

2. Wyświetlania pojedynczego artykułu po nadanym jego id:
/newses/{id}
Zapytanie GET

Przykładowe zapytanie  /newses/1

3. Dodania artykułu poprzez wysłania zapytania POST wysłanego jako JSON - wymagane wszystkie pola:
-id: String
-author: String
-content: String
-date: LocalDate (format YYYY-MM-DD)
-nameOfMagazine: String
-timestamp (generowany automatycznie przy tworzeniu obiektu i dodaniu do bazy danych). 


Przykładowe zapytanie:
{
    "id":"3",
"author":	"Tomasz Kita 5",
"content": "Trzeci artykuł, To jest trzeci artykuł pisany przeze mnie",
"date": "1994-09-01",
"nameOfMagazine": "Abstrakcja magazyn"
}

4. Aktualizacji treści pól istniejącego artykuły poprzez wysłanie zapytania PUT pod adres /newses/{id} gdzie id, to id dodanego artykułu przykład
{
    "id":"3",
"author":	"Tomasz Kita zmieniony",
"content": "Trzeci artykuł, To jest trzeci artykuł pisany przeze mnie",
"date": "1999-09-01",
"nameOfMagazine": "Abstrakcja magazyn"
}
5. Skasowanie artykułu poprzez wysłanie zapytania DELETE:
/newses/{id}

6. Wyszukanie artykułu po contencie (w content jest tytuł i sam text artykułu), poprzez zapytanie GET /newses/word/{słowoszukane}
