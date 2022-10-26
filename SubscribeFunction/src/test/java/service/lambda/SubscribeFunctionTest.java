package service.lambda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SubscribeFunctionTest {
  @Test
  public void successfulResponse() {
    SubscribeFunction app = new SubscribeFunction();
/*    APIGatewayProxyResponseEvent result = app.handleRequest(null, null, null);
    assertEquals(200, result.getStatusCode().intValue());
    assertEquals("application/json", result.getHeaders().get("Content-Type"));
    String content = result.getBody();
    assertNotNull(content);
    assertTrue(content.contains("\"message\""));
    assertTrue(content.contains("\"hello world\""));
    assertTrue(content.contains("\"location\""));*/
  }
}
