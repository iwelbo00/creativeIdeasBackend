package OrdersAPI.Logic;

import OrdersAPI.Models.RequestModels.GetOrderHistoryRequest;
import OrdersAPI.Models.ResponseModels.GetOrderHistoryResponse;
import OrdersAPI.Models.Shared.Order;
import OrdersAPI.Models.Shared.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrdersEngine {

    private final OrdersRepository _ordersRepository;
    @Autowired
    public OrdersEngine(OrdersRepository ordersRepository) {
        this._ordersRepository = ordersRepository;
    }

    public GetOrderHistoryResponse getHistoryForUser(GetOrderHistoryRequest request) {
        try{

            //TODO: uncomment and add validation/logic for getting history for users
            //Optional<List<Order>> orders = _ordersRepository.getOrders(Integer.parseInt(request.id));

            //sending dummy info
            if(Integer.parseInt(request.id) == 1) {
                Order o = new Order(Long.parseLong("1234"), 1);
                List<Order> history = new ArrayList<Order>();
                history.add(o);
                return(new GetOrderHistoryResponse(history));
            } else {
              return null;
            }


        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
