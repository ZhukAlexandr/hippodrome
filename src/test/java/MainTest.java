import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;



class MainTest {

    @Test
    @Disabled
    @Timeout(value = 22)
    void failsWhenExecutionTimeExceeds22Seconds() {
        try {
            Main.main(new String[]{});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}