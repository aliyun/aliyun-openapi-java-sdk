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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrdersResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String hostName;

		private Integer pageNum;

		private Integer pageSize;

		private Integer totalCount;

		private List<Order> orderList;

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Order> getOrderList() {
			return this.orderList;
		}

		public void setOrderList(List<Order> orderList) {
			this.orderList = orderList;
		}

		public static class Order {

			private String pretaxAmount;

			private String commodityCode;

			private String relatedOrderId;

			private String createTime;

			private String currency;

			private String subscriptionType;

			private String paymentCurrency;

			private String productType;

			private String afterTaxAmount;

			private String paymentTime;

			private String pretaxGrossAmount;

			private String orderType;

			private String paymentStatus;

			private String orderId;

			private String tax;

			private String pretaxAmountLocal;

			private String productCode;

			public String getPretaxAmount() {
				return this.pretaxAmount;
			}

			public void setPretaxAmount(String pretaxAmount) {
				this.pretaxAmount = pretaxAmount;
			}

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public String getRelatedOrderId() {
				return this.relatedOrderId;
			}

			public void setRelatedOrderId(String relatedOrderId) {
				this.relatedOrderId = relatedOrderId;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public String getSubscriptionType() {
				return this.subscriptionType;
			}

			public void setSubscriptionType(String subscriptionType) {
				this.subscriptionType = subscriptionType;
			}

			public String getPaymentCurrency() {
				return this.paymentCurrency;
			}

			public void setPaymentCurrency(String paymentCurrency) {
				this.paymentCurrency = paymentCurrency;
			}

			public String getProductType() {
				return this.productType;
			}

			public void setProductType(String productType) {
				this.productType = productType;
			}

			public String getAfterTaxAmount() {
				return this.afterTaxAmount;
			}

			public void setAfterTaxAmount(String afterTaxAmount) {
				this.afterTaxAmount = afterTaxAmount;
			}

			public String getPaymentTime() {
				return this.paymentTime;
			}

			public void setPaymentTime(String paymentTime) {
				this.paymentTime = paymentTime;
			}

			public String getPretaxGrossAmount() {
				return this.pretaxGrossAmount;
			}

			public void setPretaxGrossAmount(String pretaxGrossAmount) {
				this.pretaxGrossAmount = pretaxGrossAmount;
			}

			public String getOrderType() {
				return this.orderType;
			}

			public void setOrderType(String orderType) {
				this.orderType = orderType;
			}

			public String getPaymentStatus() {
				return this.paymentStatus;
			}

			public void setPaymentStatus(String paymentStatus) {
				this.paymentStatus = paymentStatus;
			}

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getTax() {
				return this.tax;
			}

			public void setTax(String tax) {
				this.tax = tax;
			}

			public String getPretaxAmountLocal() {
				return this.pretaxAmountLocal;
			}

			public void setPretaxAmountLocal(String pretaxAmountLocal) {
				this.pretaxAmountLocal = pretaxAmountLocal;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}
		}
	}

	@Override
	public QueryOrdersResponse getInstance(UnmarshallerContext context) {
		return	QueryOrdersResponseUnmarshaller.unmarshall(this, context);
	}
}
