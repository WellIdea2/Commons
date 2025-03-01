package org.commons.rabbitmq;

import java.util.List;

final public class RabbitMqUserQueues {

  public static final String USER_DETAILS_CREATION_NOTIFY_RECORD = "user_details_creation_notify_record_queue";
  public static final String USER_DELETION_NOTIFY_RECORD = "user_deletion_notify_record_queue";
  public static final String USER_DELETION_NOTIFY_CUSTOM_FOOD = "user_deletion_notify_custom_food_queue";
  public static final String USER_DELETION_NOTIFY_USER_DETAILS = "user_deletion_notify_user_details_queue";

  private RabbitMqUserQueues() {
  }

  public static List<String> getAllQueuesUserCreate() {
    return List.of(USER_DETAILS_CREATION_NOTIFY_RECORD);
  }

  public static List<String> getAllQueuesUserDeletion() {
    return List.of(USER_DELETION_NOTIFY_RECORD, USER_DELETION_NOTIFY_CUSTOM_FOOD, USER_DELETION_NOTIFY_USER_DETAILS);
  }
}
