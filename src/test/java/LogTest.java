import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * 日志测试
 * @author pan_junbiao
 **/
public class LogTest
{
    @BeforeEach
    void setUp()
    {
        System.out.println("@BeforeEach，测试开始");
    }

    @AfterEach
    void tearDown()
    {
        System.out.println("@AfterEach，测试结束");
    }

    @Test
    void LogTest()
    {
        Logger logger = LogManager.getLogger(LogTest.class);
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }
}
