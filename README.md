**«Парсер»** - это десктопное приложение, которое помогает решать вопрос формирования выписок для Росеестра быстрее и удобнее при помощи написанного ведущими специалистами Отдела Информационных технологий НКО "Фонд капитального ремонта" программного кода.
Сервис Парсер будет особенно полезен для:

• 	юристов

• 	финансистов
Типовые задачи, решаемые с помощью «Парсер»:

• 	автоматическое формирование списков должников

• 	осуществление программного поиска кадастровых номеров в базе 

• 	формирование списков адресов для отправки выписок 

Основными выгодами от использования «Парсер» являются:

• 	простота использования конечным пользователем

• 	многократное ускорение процесса отправки выписок 

Разработка проекта была произведена согласно разработанным UML-диаграммам:
![image](https://github.com/user-attachments/assets/fdf9b007-a54d-4a70-a128-d7b52fa3c255)
![image](https://github.com/user-attachments/assets/884aa68a-f9ac-46f3-b79d-f845ce6be6f3)
![image](https://github.com/user-attachments/assets/8171cc11-3efa-496c-813e-245a46be2361)


**Пользовательский интерфейс**


Этот раздел описывает основные элементы пользовательского интерфейса «Парсер» 1.0: 

• 	основные страницы и экраны, 

• 	варианты настроек,

• 	типовые операции.

При запуске приложения открывается следующее окно с двумя кнопками: 
![image](https://github.com/user-attachments/assets/72840033-957b-43a3-8d37-3a55c19ea9dd)

Если вы нажали на зеленую кнопку и отменили операцию выбора файлов, об этом будет выведено уведомление. 
 
Для выбора файлов для дальнейшей обработки необходимо нажать зеленую кнопку «Выбрать файлы». После этого появится всплывающее окно проводника:
 
![image](https://github.com/user-attachments/assets/f81673e3-2397-4d5d-b793-84a3bd59ae04)

В проводнике необходимо выбрать нужный файл из папки (он обязательно должен быть в csv формате, другие типы файлов приложением умышленно не поддерживаются). Если файл выбран и процесс загрузки прошел успешно, название выбранного файла отобразится во всплывающем окне.
 ![image](https://github.com/user-attachments/assets/35c72d1e-2235-487b-9883-f0a518147b58)

После этого файл можно выбрать заново путем нажатия на зеленую кнопку.

Далее, после того как нужный файл выбран и успешно загружен в систему, необходимо подать его на обработку на сайт edrpru.com, на котором будет произведена операция поиска кадастровых номеров по адресам, указанным в ранее загруженном csv файле.

Для выполнения этих действий достаточно просто нажать на синюю кнопку «Подать на обработку», и все необходимые действия будут произведены программой автоматически.

После нажатия появится всплывающее окно выбора браузера. Выберите любой установленный на ваш компьютер браузер, и обработка будет произведена в нем. По умолчанию обработка производится в Chrome.
 
![image](https://github.com/user-attachments/assets/3f18fa2b-bfc3-4b0e-9264-b9c557734737)

![image](https://github.com/user-attachments/assets/c130c9a7-7ac5-4e4e-a46d-ec69aaca82bf)

Так выглядит окно программы после нажатия на синюю кнопку «Подать на обработку». Поиск кадастровых производится в отдельно открывшемся окне выбранного браузера. 

По завершению обработки файлов вы получите всплывающее окно с указанием места хранения файла csv со списком ваших обработанных файлов. 

![image](https://github.com/user-attachments/assets/4b563aa9-6c3e-4f11-8d12-be0d946d7d13)

Чтобы получить список полученных на почту выписок, нужно нажать на фиолетовую кнопку «Получить кадастровые и пришедшие выписки». 
Будет произведена операция выбора zip-архива:
 
![image](https://github.com/user-attachments/assets/3968bd11-6edb-4b55-bead-21dec8106c0c)

Нажмите на кнопку «Добавить файл». Будет запущен поток загрузки и обработки:
 
![image](https://github.com/user-attachments/assets/3adcd2f9-c5ad-4998-8fab-d10eedf81ee9)

После завершения этого процесса появится окно, которое уведомит вас о месте хранения ваших файлов:

![image](https://github.com/user-attachments/assets/6b30fe71-009f-4a3d-8438-47b72d77ef44)

В папке будут находиться 2 файла: список кадастровых номеров (csv файл) и папка с информацией о полученных выписках на почту:
 
![image](https://github.com/user-attachments/assets/ae294e3d-404b-416e-8904-37069226bcad)


Проект на текущий момент успешно внедрен в деятельность предприятия. В ближайшем времени планируются функциональные доработки и обновления. 
Следите за проектом!
