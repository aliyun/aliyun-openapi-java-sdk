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

package com.aliyuncs.agency.model.v20180703;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20180703.GetOrderDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOrderDetailResponse extends AcsResponse {

	private String code;

	private String message;

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

		private String resourceFee;

		private Long orderStatus;

		private String cycle;

		private String orderTypeName;

		private Long chargeType;

		private String payTime;

		private String payAmount;

		private String gmtCreate;

		private String totalPayFee;

		private Long orderId;

		public String getResourceFee() {
			return this.resourceFee;
		}

		public void setResourceFee(String resourceFee) {
			this.resourceFee = resourceFee;
		}

		public Long getOrderStatus() {
			return this.orderStatus;
		}

		public void setOrderStatus(Long orderStatus) {
			this.orderStatus = orderStatus;
		}

		public String getCycle() {
			return this.cycle;
		}

		public void setCycle(String cycle) {
			this.cycle = cycle;
		}

		public String getOrderTypeName() {
			return this.orderTypeName;
		}

		public void setOrderTypeName(String orderTypeName) {
			this.orderTypeName = orderTypeName;
		}

		public Long getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(Long chargeType) {
			this.chargeType = chargeType;
		}

		public String getPayTime() {
			return this.payTime;
		}

		public void setPayTime(String payTime) {
			this.payTime = payTime;
		}

		public String getPayAmount() {
			return this.payAmount;
		}

		public void setPayAmount(String payAmount) {
			this.payAmount = payAmount;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getTotalPayFee() {
			return this.totalPayFee;
		}

		public void setTotalPayFee(String totalPayFee) {
			this.totalPayFee = totalPayFee;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
	}

	@Override
	public GetOrderDetailResponse getInstance(UnmarshallerContext context) {
		return	GetOrderDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
