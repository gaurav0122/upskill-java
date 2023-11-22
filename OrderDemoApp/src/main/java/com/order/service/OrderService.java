package com.order.service;

import com.order.entity.Order;
import com.order.model.PostOrder;

public interface OrderService {

	Order postOrder(PostOrder order, int id);

}
