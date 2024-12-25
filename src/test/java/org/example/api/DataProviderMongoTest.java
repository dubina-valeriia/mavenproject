package org.example.api;

import org.apache.log4j.Logger;
import org.example.models.PersForApi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataProviderMongoTest {

    private static final Logger logger = Logger.getLogger(DataProviderMongoTest.class);

    @Test
    public void testSaveAndRetrieveRecord() {
        DataProviderMongo dataProvider = new DataProviderMongo();

        PersForApi person = new PersForApi();
        person.setId(1L);
        person.setName("John Doe");
        person.setEmail("johndoe@example.com");

        try {
            dataProvider.saveRecord(person);
            logger.info("Запись успешно сохранена.");
        } catch (Exception e) {
            logger.error("Ошибка при сохранении записи: " + e.getMessage(), e);
            fail("Ошибка при сохранении записи.");
        }

        try {
            PersForApi retrieved = dataProvider.getRecordById(1L);
            assertNotNull(retrieved, "Полученная запись не должна быть null");
            assertEquals(person.getId(), retrieved.getId(), "ID должны совпадать");
            assertEquals(person.getName(), retrieved.getName(), "Имена должны совпадать");
            assertEquals(person.getEmail(), retrieved.getEmail(), "Email должны совпадать");
            logger.info("Запись успешно получена.");
        } catch (Exception e) {
            logger.error("Ошибка при получении записи: " + e.getMessage(), e);
            fail("Ошибка при получении записи.");
        }
    }

    @Test
    public void testDeleteRecord() {
        DataProviderMongo dataProvider = new DataProviderMongo();

        PersForApi person = new PersForApi();
        person.setId(2L);
        person.setName("Jane Doe");
        person.setEmail("janedoe@example.com");

        try {
            dataProvider.saveRecord(person);
            logger.info("Запись успешно сохранена перед удалением.");
        } catch (Exception e) {
            logger.error("Ошибка при сохранении записи: " + e.getMessage(), e);
            fail("Ошибка при сохранении записи.");
        }

        try {
            dataProvider.deleteRecord(2L);
            logger.info("Запись успешно удалена.");
        } catch (Exception e) {
            logger.error("Ошибка при удалении записи: " + e.getMessage(), e);
            fail("Ошибка при удалении записи.");
        }

        try {
            PersForApi deleted = dataProvider.getRecordById(2L);
            assertNull(deleted, "Удалённая запись должна быть null");
            logger.info("Удаление записи подтверждено.");
        } catch (Exception e) {
            logger.error("Ошибка при проверке удаления записи: " + e.getMessage(), e);
            fail("Ошибка при проверке удаления записи.");
        }
    }

    @Test
    public void testRetrieveNonExistentRecord() {
        DataProviderMongo dataProvider = new DataProviderMongo();

        try {
            PersForApi retrieved = dataProvider.getRecordById(999L);
            assertNull(retrieved, "Несуществующая запись должна быть null");
            logger.info("Проверка получения несуществующей записи успешно завершена.");
        } catch (Exception e) {
            logger.error("Ошибка при попытке получить несуществующую запись: " + e.getMessage(), e);
            fail("Ошибка при попытке получить несуществующую запись.");
        }
    }

    @Test
    public void testInitDataSource() {
        DataProviderMongo dataProvider = new DataProviderMongo();

        try {
            dataProvider.initDataSource();
            logger.info("Инициализация источника данных успешно завершена.");
        } catch (Exception e) {
            logger.error("Ошибка при инициализации источника данных: " + e.getMessage(), e);
            fail("Ошибка при инициализации источника данных.");
        }
    }
}
