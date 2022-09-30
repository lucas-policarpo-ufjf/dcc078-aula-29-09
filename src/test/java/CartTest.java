import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CartTest {

    @Test
    void shouldReturnAmountCorrectly() {
        Cart.getInstance().setTotalAmount(5);
        assertEquals(5, Cart.getInstance().getTotalAmount());
    }

    @Test
    void shouldReturnTotalProductsPriceCorrectly() {
        Cart.getInstance().setTotalProductsPrice(55.9F);
        assertEquals(55.9F, Cart.getInstance().getTotalProductsPrice());
    }

    @Test
    void shouldReturnShippingPriceCorrectly() {
        Cart.getInstance().setShippingPrice(22.5F);
        assertEquals(22.5F, Cart.getInstance().getShippingPrice());
    }

    @Test
    void shouldReturnTotalPriceCorrectly() {
        Cart.getInstance().setShippingPrice(22.5F);
        Cart.getInstance().setTotalProductsPrice(55.9F);
        assertEquals(22.5F + 55.9F, Cart.getInstance().getTotalPrice());
    }
}