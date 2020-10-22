import de.fayard.refreshVersions.bootstrapRefreshVersions

// Plugin : ha un tasks refreshVersion che:
// 1- legge la configurazione delle nostre dipendenze,
// 2- guarda i nomi degli artefatti,
// 3- si collega ai repository che abbiamo configurato
// --> e inizia a cercare la versione più aggiornata

// Se ci sono versioni più recenti li annota come commenti nel file versions.properties
// Ecco perchè questo plugin viene inserito nelle proprietà di gradle e non nella build
buildscript {
    repositories { gradlePluginPortal() }
    dependencies {
        classpath("de.fayard.refreshVersions:refreshVersions:0.9.7")
    }
}
bootstrapRefreshVersions()

rootProject.name = "greetings-plugin-complete"
