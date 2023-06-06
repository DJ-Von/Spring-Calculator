# Калькулятор на Java (framework: Spring Boot)
Для тестирования нужно запустить проект на своём компьютере и перейти по ссылке: http://localhost:9090/swagger-ui/index.html
 - Добавлены MockMvc тесты
# Как использовать?
 - Для использования необходимо установить *PostgreSQL* и указать параметры подключения в *application.properties*.
 - Для использования графического интерфейса необходимо к основной ссылке добавить  __*/swagger-ui*__.
 - В случае, если вы не используете графический интерфейс, для операций плюс, минус, умножить, поделить нужно к ссылке добавить следующее:
   - __*plus/nервое_число/второе_число*__;
   - __*minus/nервое_число/второе_число*__;
   - __*multiple/nервое_число/второе_число*__;
   - __*divide/nервое_число/второе_число*__
  соответственно.
 - Для просмотра всех операций к основной ссылке добавить __*/get-all-calculations*__.
## Скриншоты работы
![Screenshot_1](https://github.com/DJ-Von/Spring-Calculator/assets/16465651/931b9ba9-35e5-4c7d-a045-edcb654f640a)
![Screenshot_2](https://github.com/DJ-Von/Spring-Calculator/assets/16465651/83137bc1-dd51-4c1a-8ccc-07db370dcabc)
![Screenshot_3](https://github.com/DJ-Von/Spring-Calculator/assets/16465651/21aa684e-a629-4871-9b53-30090198bdf7)
<br>
## Пройденные тесты
![tests](https://github.com/DJ-Von/Spring-Calculator/assets/16465651/2c4f4a1d-4c51-42fc-86c6-1e54c1bf7745)
