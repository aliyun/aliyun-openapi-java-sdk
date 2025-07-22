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

package com.aliyuncs.mseap.model.v20210118;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mseap.transform.v20210118.GetOrderSummaryForPartnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOrderSummaryForPartnerResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String orderId;

		private String encryptedBuyerId;

		private String encryptedPayerId;

		private String encryptedUserId;

		private List<OrderLine> orderLines;

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getEncryptedBuyerId() {
			return this.encryptedBuyerId;
		}

		public void setEncryptedBuyerId(String encryptedBuyerId) {
			this.encryptedBuyerId = encryptedBuyerId;
		}

		public String getEncryptedPayerId() {
			return this.encryptedPayerId;
		}

		public void setEncryptedPayerId(String encryptedPayerId) {
			this.encryptedPayerId = encryptedPayerId;
		}

		public String getEncryptedUserId() {
			return this.encryptedUserId;
		}

		public void setEncryptedUserId(String encryptedUserId) {
			this.encryptedUserId = encryptedUserId;
		}

		public List<OrderLine> getOrderLines() {
			return this.orderLines;
		}

		public void setOrderLines(List<OrderLine> orderLines) {
			this.orderLines = orderLines;
		}

		public static class OrderLine {

			private String orderType;

			private String instanceId;

			private String orderLineId;

			public String getOrderType() {
				return this.orderType;
			}

			public void setOrderType(String orderType) {
				this.orderType = orderType;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getOrderLineId() {
				return this.orderLineId;
			}

			public void setOrderLineId(String orderLineId) {
				this.orderLineId = orderLineId;
			}
		}
	}

	@Override
	public GetOrderSummaryForPartnerResponse getInstance(UnmarshallerContext context) {
		return	GetOrderSummaryForPartnerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
