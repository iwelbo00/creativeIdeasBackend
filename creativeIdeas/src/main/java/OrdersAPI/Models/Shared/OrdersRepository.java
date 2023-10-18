package OrdersAPI.Models.Shared;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Long> {
    @Query("SELECT o FROM Order o WHERE o.userId = :userId")
    Optional<List<Order>> getOrders(@Param("userId") int userId);
}
