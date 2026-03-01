Dieses Projekt dient als Übungsprojekt für TDD, Maven und CI/CD.

# Password Validation – TDD, Maven, JUnit 5

Dieses Projekt implementiert eine Passwortvalidierung gemäß definierter Policy.  
Die Entwicklung erfolgte testgetrieben (TDD) mit JUnit 5.  
Der Code ist vollständig ohne Regex implementiert (Schleifen + Character‑Methoden).

---

## Passwort‑Policy

### Basis‑Kriterien
Ein Passwort ist gültig, wenn:

- mindestens **8 Zeichen**  
- mindestens **eine Ziffer**  
- mindestens **ein Großbuchstabe**  
- mindestens **ein Kleinbuchstabe**  
- **nicht** in der Liste häufiger Passwörter:  
  `password`, `passwort1`, `12345678`, `aa345678`

### Bonus (optional)
- mindestens ein Sonderzeichen aus: `!@#$%^&*()-_+=?.,;:`
- mindestens 3 von 4 Zeichengruppen erfüllt


---
## Projektstruktur

GitHub Actions Workflow:
.github/workflows/ci.yml

Automatisch ausführen:
mvn -B clean verify

---
## Build & Test

bash
mvn clean verify
bash
mvn package

