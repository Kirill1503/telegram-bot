package pro.sky.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.telegrambot.entity.NotificationTaskEntity;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface NotificationTaskRepository extends JpaRepository<NotificationTaskEntity, Long> {

    List<NotificationTaskEntity> findNotificationTaskEntityByDateTime(LocalDateTime dateTime);
}
