# PAPB Hands-on: Jetpack Compose Navigation

## Deskripsi Proyek

Proyek ini merupakan aplikasi Android yang dibuat sebagai latihan (hands-on) untuk mata kuliah Praktikum Aplikasi Perangkat Bergerak (PAPB). Aplikasi ini mendemonstrasikan implementasi komprehensif dari **Jetpack Compose Navigation**, mencakup berbagai pola navigasi modern dalam satu aplikasi.

Tujuan utamanya adalah untuk mempraktikkan cara mengelola alur layar (screen flow), mengirim data antar-halaman, dan membangun struktur UI utama menggunakan komponen Material 3.

---

## Fitur Utama

Aplikasi ini mengimplementasikan beberapa fitur navigasi dan UI, antara lain:

-   **Splash Screen**: Halaman pembuka yang muncul sesaat sebelum masuk ke aplikasi utama.
-   **Navigasi Bertingkat (Nested Navigation)**: Memisahkan alur navigasi utama (splash screen) dengan alur navigasi di dalam aplikasi (main graph).
-   **Scaffold dengan UI Lengkap**: Menggunakan `Scaffold` sebagai kerangka utama yang berisi:
    -   **Top App Bar**: Bar atas aplikasi.
    -   **Bottom Navigation Bar**: Navigasi bawah untuk berpindah antara halaman utama (Home, Profile, Settings).
    -   **Navigation Drawer**: Menu samping yang dapat diakses dari ikon di Top App Bar.
    -   **Floating Action Button (FAB)**: Tombol melayang untuk menuju halaman tambah data.
-   **Alur Daftar ke Detail (List-to-Detail)**: Halaman `Home` menampilkan daftar item, yang masing-masing dapat diklik untuk melihat halaman `Detail` atau `Edit`.
-   **Pengiriman Argumen/Data**: Mengirimkan `ID` dari `HomeScreen` ke `DetailScreen` dan `EditScreen` sebagai parameter navigasi.

---

## Teknologi & Library

Proyek ini dibangun menggunakan:

-   **Bahasa Pemrograman**: [Kotlin](https://kotlinlang.org/)
-   **UI Toolkit**: [Jetpack Compose](https://developer.android.com/jetpack/compose) (UI deklaratif modern)
-   **Navigasi**: [Jetpack Compose Navigation](https://developer.android.com/jetpack/compose/navigation)
-   **Desain Sistem**: [Material 3](https://m3.material.io/)

---

## 📂 Struktur Proyek

Struktur file dan direktori utama dalam proyek ini diatur sebagai berikut untuk memisahkan tanggung jawab kode:

```plaintext
.
└── /ui
    ├── /components
    │   └── PlaceholderComponent.kt
    │
    ├── /navigation
    │   ├── Routes.kt
    │   ├── RootNavGraph.kt
    │   └── MainScaffold.kt
    │
    ├── /screens
    │   ├── SplashScreen.kt
    │   ├── HomeScreen.kt
    │   ├── DetailScreen.kt
    │   ├── EditScreen.kt
    │   ├── AddScreen.kt
    │   ├── ProfileScreen.kt
    │   ├── SettingsScreen.kt
    │   ├── PlaceholderHomeScreen.kt
    │   └── PlaceholderScreen.kt
    │
    └── /theme
        ├── Color.kt
        ├── Theme.kt
        └── Type.kt
