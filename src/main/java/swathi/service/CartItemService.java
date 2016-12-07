package swathi.service;

import swathi.model.Cart;
import swathi.model.CartItem;

/**
 * Created by Le on 1/25/2016.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);
}
