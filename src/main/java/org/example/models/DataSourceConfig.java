package org.example.models;

import org.example.api.DataProviderMongo;
import org.example.api.DataProviderPostgres;
import org.example.api.IDataProvider;

public class DataSourceConfig {

    public IDataProvider<?> getDataProvider(String dbType) {
        switch (dbType.toLowerCase()) {
            case "mongodb":
                return new DataProviderMongo();
            case "postgresql":
                return new DataProviderPostgres();
            default:
                throw new IllegalArgumentException("Неподдерживаемый тип БД");
        }
    }
}
