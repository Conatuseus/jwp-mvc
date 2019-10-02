package reflection;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionTest {
    private static final Logger logger = LoggerFactory.getLogger(ReflectionTest.class);

    @Test
    public void showClass() {
        Class<Question> clazz = Question.class;
        logger.debug(clazz.getName());

        logger.debug("getModifier: {} --- {}", clazz.getModifiers(), Modifier.toString(clazz.getModifiers()));
        logger.debug("\n");

        logger.debug("getFields: {}", Arrays.toString(clazz.getFields()));
        logger.debug("\n");

        logger.debug("getDeclaredFields: {}", Arrays.toString(clazz.getDeclaredFields()));
        logger.debug("\n");

        logger.debug("getConstructors: {}", Arrays.toString(clazz.getConstructors()));
        logger.debug("\n");

        logger.debug("getDeclaredConstructors: {}", Arrays.toString(clazz.getDeclaredConstructors()));
        logger.debug("\n");

        logger.debug("getMethods: {}", Arrays.toString(clazz.getMethods()));
        logger.debug("\n");

        logger.debug("getDeclaredMethods: {}", Arrays.toString(clazz.getDeclaredMethods()));

        // TODO Question 클래스의 모든 필드, 생성자, 메소드에 대한 정보를 출력한다.
    }

    @Test
    @SuppressWarnings("rawtypes")
    public void constructor_with_args() throws Exception {
        Class<Question> clazz = Question.class;
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] parameterTypes = constructor.getParameterTypes();
            logger.debug("paramer length : {}", parameterTypes.length);
            for (Class paramType : parameterTypes) {
                logger.debug("param type : {}", paramType);
            }
        }

        // TODO 인자를 가진 생성자를 활용해 인스턴스를 생성한다.
    }

    @Test
    public void privateFieldAccess() {
        Class<Student> clazz = Student.class;
        logger.debug(clazz.getName());

        // TODO Student private field에 값을 저장하고 조회한다.
    }
}
