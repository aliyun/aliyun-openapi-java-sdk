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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListEffectiveOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEffectiveOrdersResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private List<OrderSummaryItem> orderSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<OrderSummaryItem> getOrderSummary() {
		return this.orderSummary;
	}

	public void setOrderSummary(List<OrderSummaryItem> orderSummary) {
		this.orderSummary = orderSummary;
	}

	public static class OrderSummaryItem {

		private String commodityCode;

		private String commodityType;

		private String versionType;

		private Integer totalQuota;

		private List<OrderListItem> orderList;

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getCommodityType() {
			return this.commodityType;
		}

		public void setCommodityType(String commodityType) {
			this.commodityType = commodityType;
		}

		public String getVersionType() {
			return this.versionType;
		}

		public void setVersionType(String versionType) {
			this.versionType = versionType;
		}

		public Integer getTotalQuota() {
			return this.totalQuota;
		}

		public void setTotalQuota(Integer totalQuota) {
			this.totalQuota = totalQuota;
		}

		public List<OrderListItem> getOrderList() {
			return this.orderList;
		}

		public void setOrderList(List<OrderListItem> orderList) {
			this.orderList = orderList;
		}

		public static class OrderListItem {

			private String orderId;

			private String buyerId;

			private String instanceId;

			private String startTime;

			private String endTime;

			private String insNum;

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getBuyerId() {
				return this.buyerId;
			}

			public void setBuyerId(String buyerId) {
				this.buyerId = buyerId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getInsNum() {
				return this.insNum;
			}

			public void setInsNum(String insNum) {
				this.insNum = insNum;
			}
		}
	}

	@Override
	public ListEffectiveOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListEffectiveOrdersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
