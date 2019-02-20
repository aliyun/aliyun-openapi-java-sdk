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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.GetJoinPermissionAuthOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJoinPermissionAuthOrderResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

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

		private String orderId;

		private String joinPermissionId;

		private String ownerAliyunId;

		private String renterAliyunId;

		private String orderState;

		private Long applyingMillis;

		private Long acceptedMillis;

		private Long rejectedMillis;

		private Long canceledMillis;

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getJoinPermissionId() {
			return this.joinPermissionId;
		}

		public void setJoinPermissionId(String joinPermissionId) {
			this.joinPermissionId = joinPermissionId;
		}

		public String getOwnerAliyunId() {
			return this.ownerAliyunId;
		}

		public void setOwnerAliyunId(String ownerAliyunId) {
			this.ownerAliyunId = ownerAliyunId;
		}

		public String getRenterAliyunId() {
			return this.renterAliyunId;
		}

		public void setRenterAliyunId(String renterAliyunId) {
			this.renterAliyunId = renterAliyunId;
		}

		public String getOrderState() {
			return this.orderState;
		}

		public void setOrderState(String orderState) {
			this.orderState = orderState;
		}

		public Long getApplyingMillis() {
			return this.applyingMillis;
		}

		public void setApplyingMillis(Long applyingMillis) {
			this.applyingMillis = applyingMillis;
		}

		public Long getAcceptedMillis() {
			return this.acceptedMillis;
		}

		public void setAcceptedMillis(Long acceptedMillis) {
			this.acceptedMillis = acceptedMillis;
		}

		public Long getRejectedMillis() {
			return this.rejectedMillis;
		}

		public void setRejectedMillis(Long rejectedMillis) {
			this.rejectedMillis = rejectedMillis;
		}

		public Long getCanceledMillis() {
			return this.canceledMillis;
		}

		public void setCanceledMillis(Long canceledMillis) {
			this.canceledMillis = canceledMillis;
		}
	}

	@Override
	public GetJoinPermissionAuthOrderResponse getInstance(UnmarshallerContext context) {
		return	GetJoinPermissionAuthOrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
