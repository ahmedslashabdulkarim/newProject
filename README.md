- README‑Inhalt für dein passwort-validation -

Projekt: Password Validator (Maven, Java 23)
Dieses Projekt implementiert eine robuste Passwortvalidierung in Java. Die Entwicklung erfolgt testgetrieben (TDD) mit JUnit 5 und wird automatisch über GitHub Actions getestet.

Passwort‑Policy (Basis)
Ein Passwort ist gültig, wenn alle folgenden Bedingungen erfüllt sind:

mindestens 8 Zeichen

mindestens eine Ziffer (0–9)

mindestens ein Großbuchstabe

mindestens ein Kleinbuchstabe

nicht in der internen Liste häufiger/schwacher Passwörter enthalten
(Vergleich erfolgt in Kleinbuchstaben und getrimmt)

Nicht enthalten:  
Keine Sonderzeichenpflicht, keine Mindestanzahl von Zeichengruppen.