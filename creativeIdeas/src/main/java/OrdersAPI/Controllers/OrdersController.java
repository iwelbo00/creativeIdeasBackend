package OrdersAPI.Controllers;


import OrdersAPI.Logic.OrdersEngine;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import OrdersAPI.Models.RequestModels.*;
import OrdersAPI.Models.ResponseModels.*;


@RestController
@RequestMapping("/Orders")
public class OrdersController {

    private final OrdersEngine _ordersEngine;

    public OrdersController(OrdersEngine ordersEngine) {
        this._ordersEngine = ordersEngine;
    }

    @GetMapping("Test")
    public String test() {
        return "Hello from the Orders API! " + System.currentTimeMillis();
    }

    @PostMapping("GetOrderHistory")
    public ResponseEntity<GetOrderHistoryResponse> GetOrderHistoryForUser(@RequestBody GetOrderHistoryRequest request) {

        GetOrderHistoryResponse response = _ordersEngine.getHistoryForUser(request);
        return ResponseEntity.ok(response);

    }

}
