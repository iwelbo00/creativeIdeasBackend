package OrdersAPI.Models.ResponseModels;

import OrdersAPI.Models.Shared.Order;
import lombok.*;

import java.util.List;

@Getter @Setter
public class GetOrderHistoryResponse {

    private List<Order> history;

    public GetOrderHistoryResponse( List<Order> history){
        this.history = history;
    }
}
