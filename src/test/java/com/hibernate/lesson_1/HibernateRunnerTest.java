package com.hibernate.lesson_1;

class HibernateRunnerTest {
//    @Test
//    public void testHibernateApi() throws SQLException, IllegalAccessException {
//        Genre genre = Genre.builder()
//                .id(58L)
//                .tmdbId(556L)
//                .name("Gena")
//                .build();
//
//        String sql = """
//                insert into
//                %s
//                (%s)
//                values
//                (%s)
//                """;
//
//        // Получаем имя таблицы
//        String tableName = Optional.ofNullable(genre.getClass().getAnnotation(Table.class))
//                .map(table -> (table.schema().isEmpty() ? "" : table.schema() + ".") + table.name())
//                .orElse(genre.getClass().getSimpleName()); // Если нет аннотации, используем простое имя класса
//
//        // Получаем названия столбцов
//        Field[] fields = genre.getClass().getDeclaredFields();
//        String columnNames = Arrays.stream(fields)
//                .map(field -> Optional.ofNullable(field.getAnnotation(Column.class))
//                        .map(Column::name)
//                        .orElse(field.getName()) // Если нет аннотации, используем имя поля
//                ).collect(Collectors.joining(", "));
//
//        // Места для значений
//        String columnValues = Arrays.stream(fields)
//                .map(field -> "?")
//                .collect(Collectors.joining(", "));
//
//        // Соединение через try-with-resources для автоматического закрытия
//        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/movies_db", "postgres", "postgres");
//             PreparedStatement ps = conn.prepareStatement(sql.formatted(tableName, columnNames, columnValues))) {
//
//            // Устанавливаем значения параметров
//            for (int i = 0; i < fields.length; i++) {
//                fields[i].setAccessible(true);
//                ps.setObject(i + 1, fields[i].get(genre));
//            }
//
//            // Выводим запрос для проверки
//            System.out.println(ps);
//
//            // Выполняем запрос
//            ps.executeUpdate();
//        }
//    }
}