package com.example.campeonatotorneo;
import android.provider.BaseColumns;

public final class EstructuraBBDD {

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE IF NOT EXISTS "+ EstructuraCampeonatoTorneo.TABLE_NAME_CAMPEONATOTORNEO +
                    "(" + EstructuraCampeonatoTorneo._ID + " integer PRIMARY KEY, "
                    + EstructuraCampeonatoTorneo.COLUMN_NAME_TITULO + " text, "
                    + EstructuraCampeonatoTorneo.COLUMN_NAME_COMPOSITOR + " text, "
                    + EstructuraCampeonatoTorneo.COLUMN_FOTO_COMPOSITOR + " integer, "
                    + EstructuraCampeonatoTorneo.COLUMN_FOTO_CAPTURA + " blob, "
                    + EstructuraCampeonatoTorneo.COLUMN_NAME_YEAR + " integer);";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS  " + EstructuraCampeonatoTorneo.TABLE_NAME_CAMPEONATOTORNEO;

    private EstructuraBBDD() {}

    /* Clase interna que define la estructura de la tabla de operas */
    public static class EstructuraCampeonatoTorneo implements BaseColumns {
        public static final String TABLE_NAME_CAMPEONATOTORNEO = "operas";
        public static final String COLUMN_NAME_TITULO = "titulo";
        public static final String COLUMN_NAME_COMPOSITOR = "compositor";
        public static final String COLUMN_FOTO_COMPOSITOR = "foto";
        public static final String COLUMN_FOTO_CAPTURA = "captura";
        public static final String COLUMN_NAME_YEAR = "year";
    }
}
