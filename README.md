# Acceso Predeterminado (prototipo)

Prototipo personal en Kotlin: un **tile de Ajustes rápidos** que abre la pantalla del sistema de **aplicaciones predeterminadas**.

No cambia ningún valor predeterminado por código; solo es un acceso directo (estilo Caffeine, pero de atajo a Ajustes).

## Requisitos

- Android Studio (recomendado) o JDK 11+
- Android SDK con `compileSdk` / plataforma 36
- Dispositivo o emulador con Android 7.0 (API 24) o superior

## Abrir y compilar en Android Studio

1. Abre Android Studio → **File → Open** → selecciona esta carpeta:
   `C:\Sources\Android\acceso-predeterminado-prototipo`
2. Espera a que Gradle sincronice.
3. Conecta un dispositivo con depuración USB o inicia un emulador.
4. Pulsa **Run** (▶) o genera el APK de depuración:
   - Menú **Build → Build Bundle(s) / APK(s) → Build APK(s)**
5. Desde terminal (opcional), con el JDK de Android Studio:

```bat
cd C:\Sources\Android\acceso-predeterminado-prototipo
set JAVA_HOME=C:\Program Files\Android\Android Studio\jbr
gradlew.bat assembleDebug
```

El APK queda en `app\build\outputs\apk\debug\app-debug.apk`.

## Cómo añadir el tile (Jose Jr.)

1. Instala e inicia la app una vez (así Android registra el servicio del tile).
2. Desliza hacia abajo **dos veces** para abrir el panel de Ajustes rápidos.
3. Toca el **lápiz** / **editar**.
4. Busca el tile **«Apps predeterminadas»** y arrástralo al panel.
5. Guarda los cambios.
6. Al tocarlo, se abre la pantalla del sistema de apps predeterminadas y se cierra el panel de QS.

## Qué hace / qué no hace

| Hace | No hace |
|------|---------|
| Abre `Settings.ACTION_MANAGE_DEFAULT_APPS_SETTINGS` | Cambiar navegador, SMS, launcher, etc. por código |
| Colapsa el panel de Ajustes rápidos al abrir Ajustes | Requiere red, cuenta ni permisos especiales |
| Muestra instrucciones breves en la Activity | Automatizar o forzar valores predeterminados |

## Detalles técnicos

- **applicationId / package:** `com.josejr.accesopredeterminado`
- **minSdk:** 24 · **targetSdk / compileSdk:** 36
- **Clases principales:**
  - `DefaultAppsTileService` — `TileService` con `BIND_QUICK_SETTINGS_TILE`
  - `MainActivity` — instrucciones en español
