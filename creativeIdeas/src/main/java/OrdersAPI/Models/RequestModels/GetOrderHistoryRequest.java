package OrdersAPI.Models.RequestModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class GetOrderHistoryRequest {

    @JsonProperty("userId")
    public String id;

}
