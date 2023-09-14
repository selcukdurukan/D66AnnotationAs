package com.ba.boost.annotationexp4;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        LordOfRing lordOfRing = new LordOfRing("Return Of The King", 250, "fantasy");

        Class<?> clazz = lordOfRing.getClass();

        if (clazz.isAnnotationPresent(AuthorAnnotation.class)) {
            AuthorAnnotation ann = clazz.getAnnotation(AuthorAnnotation.class);

            Field[] lorDeclaredFields = clazz.getDeclaredFields();

            List<Object> fieldNames = getFieldNames(lorDeclaredFields, lordOfRing);

            System.out.println(
                    "AuthorName: " + ann.authorName() + "\n"
                            + "Author dateOfBirth: " + ann.dateOfBirth() + "\n"
                            + "BookName: " + fieldNames.get(0) + "\n"
                            + "pageOfBook: " + fieldNames.get(1) + "\n"
                            + "Subject Of The Book: " + fieldNames.get(2)
            );

        }

    }

    public static List<Object> getFieldNames(Field[] fields, LordOfRing lor) throws IllegalAccessException {
        List<Object> filedNames = new ArrayList<>();

        for (Field f : fields) {
            f.setAccessible(true);
            filedNames.add(f.get(lor));
        }
        return filedNames;
    }
}
