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

package com.aliyuncs.cc5g.model.v20220314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cc5g.transform.v20220314.ListOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOrdersResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private String maxResults;

	private String totalCount;

	private List<Order> orders;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public static class Order {

		private String orderId;

		private String status;

		private String action;

		private String description;

		private String logisticsId;

		private String logisticsStatus;

		private String logisticsType;

		private String logisticsUpdateTime;

		private String cardCount;

		private String contactName;

		private String contactPhone;

		private String postAddress;

		private String createTime;

		private String payTime;

		private String regionId;

		private String cardType;

		private String cardNetType;

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLogisticsId() {
			return this.logisticsId;
		}

		public void setLogisticsId(String logisticsId) {
			this.logisticsId = logisticsId;
		}

		public String getLogisticsStatus() {
			return this.logisticsStatus;
		}

		public void setLogisticsStatus(String logisticsStatus) {
			this.logisticsStatus = logisticsStatus;
		}

		public String getLogisticsType() {
			return this.logisticsType;
		}

		public void setLogisticsType(String logisticsType) {
			this.logisticsType = logisticsType;
		}

		public String getLogisticsUpdateTime() {
			return this.logisticsUpdateTime;
		}

		public void setLogisticsUpdateTime(String logisticsUpdateTime) {
			this.logisticsUpdateTime = logisticsUpdateTime;
		}

		public String getCardCount() {
			return this.cardCount;
		}

		public void setCardCount(String cardCount) {
			this.cardCount = cardCount;
		}

		public String getContactName() {
			return this.contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public String getContactPhone() {
			return this.contactPhone;
		}

		public void setContactPhone(String contactPhone) {
			this.contactPhone = contactPhone;
		}

		public String getPostAddress() {
			return this.postAddress;
		}

		public void setPostAddress(String postAddress) {
			this.postAddress = postAddress;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getPayTime() {
			return this.payTime;
		}

		public void setPayTime(String payTime) {
			this.payTime = payTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCardType() {
			return this.cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}

		public String getCardNetType() {
			return this.cardNetType;
		}

		public void setCardNetType(String cardNetType) {
			this.cardNetType = cardNetType;
		}
	}

	@Override
	public ListOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListOrdersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
