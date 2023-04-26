/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.CreateOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOrderResponse extends AcsResponse {

	private String requestId;

	private String taskId;

	private String orderId;

	private Float tradePrice;

	private List<RelatedOrderItemSet> relatedOrderItemSets;

	private List<String> orderParams;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Float getTradePrice() {
		return this.tradePrice;
	}

	public void setTradePrice(Float tradePrice) {
		this.tradePrice = tradePrice;
	}

	public List<RelatedOrderItemSet> getRelatedOrderItemSets() {
		return this.relatedOrderItemSets;
	}

	public void setRelatedOrderItemSets(List<RelatedOrderItemSet> relatedOrderItemSets) {
		this.relatedOrderItemSets = relatedOrderItemSets;
	}

	public List<String> getOrderParams() {
		return this.orderParams;
	}

	public void setOrderParams(List<String> orderParams) {
		this.orderParams = orderParams;
	}

	public static class RelatedOrderItemSet {

		private List<String> relatedOrderIds;

		private List<String> instanceIdSet;

		private List<String> diskIdSet;

		public List<String> getRelatedOrderIds() {
			return this.relatedOrderIds;
		}

		public void setRelatedOrderIds(List<String> relatedOrderIds) {
			this.relatedOrderIds = relatedOrderIds;
		}

		public List<String> getInstanceIdSet() {
			return this.instanceIdSet;
		}

		public void setInstanceIdSet(List<String> instanceIdSet) {
			this.instanceIdSet = instanceIdSet;
		}

		public List<String> getDiskIdSet() {
			return this.diskIdSet;
		}

		public void setDiskIdSet(List<String> diskIdSet) {
			this.diskIdSet = diskIdSet;
		}
	}

	@Override
	public CreateOrderResponse getInstance(UnmarshallerContext context) {
		return	CreateOrderResponseUnmarshaller.unmarshall(this, context);
	}
}
