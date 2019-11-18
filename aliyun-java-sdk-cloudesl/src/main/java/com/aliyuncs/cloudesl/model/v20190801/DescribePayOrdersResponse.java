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

package com.aliyuncs.cloudesl.model.v20190801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20190801.DescribePayOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePayOrdersResponse extends AcsResponse {

	private String errorMessage;

	private Integer totalCount;

	private String errorCode;

	private String message;

	private Integer pageSize;

	private String dynamicCode;

	private String code;

	private String dynamicMessage;

	private String requestId;

	private Boolean success;

	private Integer pageNumber;

	private List<PayOrderInfo> payOrders;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<PayOrderInfo> getPayOrders() {
		return this.payOrders;
	}

	public void setPayOrders(List<PayOrderInfo> payOrders) {
		this.payOrders = payOrders;
	}

	public static class PayOrderInfo {

		private String gmtPay;

		private Float payAmount;

		private Integer quantity;

		private String orderType;

		private Boolean isAccepted;

		private String orderId;

		private Float originalAmount;

		private String detailName;

		private String orderStatus;

		private String commodityCode;

		private String commodityName;

		private String gmtCreate;

		public String getGmtPay() {
			return this.gmtPay;
		}

		public void setGmtPay(String gmtPay) {
			this.gmtPay = gmtPay;
		}

		public Float getPayAmount() {
			return this.payAmount;
		}

		public void setPayAmount(Float payAmount) {
			this.payAmount = payAmount;
		}

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public Boolean getIsAccepted() {
			return this.isAccepted;
		}

		public void setIsAccepted(Boolean isAccepted) {
			this.isAccepted = isAccepted;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public Float getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(Float originalAmount) {
			this.originalAmount = originalAmount;
		}

		public String getDetailName() {
			return this.detailName;
		}

		public void setDetailName(String detailName) {
			this.detailName = detailName;
		}

		public String getOrderStatus() {
			return this.orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getCommodityName() {
			return this.commodityName;
		}

		public void setCommodityName(String commodityName) {
			this.commodityName = commodityName;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
	}

	@Override
	public DescribePayOrdersResponse getInstance(UnmarshallerContext context) {
		return	DescribePayOrdersResponseUnmarshaller.unmarshall(this, context);
	}
}
