package OrdersAPI.Models.Shared;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Orders")
@Getter @Setter @NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int userId;

    //add columns

    public Order(Long id, int userId) {
        this.id = id;
        this.userId = userId;
    }
}
