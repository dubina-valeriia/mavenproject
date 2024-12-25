package org.example.api;

import com.mongodb.client.*;
import org.apache.log4j.Logger;
import org.bson.Document;
import org.example.models.PersForApi;
import ru.sfedu.dubina.Constants;
import com.mongodb.client.model.Filters;


public class DataProviderMongo implements IDataProvider<PersForApi> {
    private MongoCollection<Document> collection;
    private Logger logger = Logger.getLogger(DataProviderMongo.class);

    public DataProviderMongo() {
        MongoClient mongoClient = MongoClients.create(Constants.CLIENT_ID);
        MongoDatabase mongoDatabase = mongoClient.getDatabase(Constants.DATABASE_NAME);
        this.collection = mongoDatabase.getCollection(Constants.COLLECTION_NAME);
    }


    @Override
    public void saveRecord(PersForApi record) {
        try {
            Document document = new Document("id", record.getId())
                    .append("name", record.getName())
                    .append("email", record.getEmail());

            collection.insertOne(document);
        } catch (Exception exception) {
            logger.error("Ошибка при сохранении записи", exception);
        }
    }

    @Override
    public void deleteRecord(Long id) {
        try {
            collection.deleteOne(Filters.eq("id", id));
        } catch (Exception e) {
            logger.error("Ошибка при удалении записи", e);
        }
    }

    @Override
    public PersForApi getRecordById(Long id) {
        try {
            Document document = collection.find(Filters.eq("id", id)).first();
            if (document != null) {
                return new PersForApi(
                        document.getLong("id"),
                        document.getString("name"),
                        document.getString("email")
                );
            }
        } catch (Exception e) {
            logger.error("Ошибка при получении записи", e);
        }
        return null;
    }

    @Override
    public void initDataSource() {
        try {
            logger.info("Инициализация источника данных MongoDB завершена успешно");
        } catch (Exception e) {
            logger.error("Ошибка при инициализации источника данных", e);
        }
    }
}
