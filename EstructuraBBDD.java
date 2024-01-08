package com.example.campeonatotorneo;
import android.provider.BaseColumns;

public final class EstructuraBBDD {

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE IF NOT EXISTS "+ EstructuraCampeonatoTorneo.TABLE_NAME_OPERAS +
                    "(" + EstructuraOperas._ID + " integer PRIMARY KEY, "
                    + EstructuraOperas.COLUMN_NAME_TITULO + " text, "
                    + EstructuraOperas.COLUMN_NAME_COMPOSITOR + " text, "
                    + EstructuraOperas.COLUMN_FOTO_COMPOSITOR + " integer, "
                    + EstructuraOperas.COLUMN_FOTO_CAPTURA + " blob, "
                    + EstructuraOperas.COLUMN_NAME_YEAR + " integer);";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS  " + EstructuraOperas.TABLE_NAME_OPERAS;

    private EstructuraBBDD() {}

    /* Clase interna que define la estructura de la tabla de operas */
    public static class EstructuraCampeonatoTorneo implements BaseColumns {
        public static final String TABLE_NAME_OPERAS = "operas";
        public static final String COLUMN_NAME_TITULO = "titulo";
        public static final String COLUMN_NAME_COMPOSITOR = "compositor";
        public static final String COLUMN_FOTO_COMPOSITOR = "foto";
        public static final String COLUMN_FOTO_CAPTURA = "captura";
        public static final String COLUMN_NAME_YEAR = "year";
    }
}
