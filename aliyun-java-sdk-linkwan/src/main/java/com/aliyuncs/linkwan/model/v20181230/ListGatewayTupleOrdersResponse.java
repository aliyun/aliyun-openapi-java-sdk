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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.ListGatewayTupleOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayTupleOrdersResponse extends AcsResponse {

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

		private Long totalCount;

		private List<GatewayTupleOrder> list;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<GatewayTupleOrder> getList() {
			return this.list;
		}

		public void setList(List<GatewayTupleOrder> list) {
			this.list = list;
		}

		public static class GatewayTupleOrder {

			private String orderId;

			private String orderState;

			private Long requiredCount;

			private Long createdMillis;

			private Long acceptedMillis;

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getOrderState() {
				return this.orderState;
			}

			public void setOrderState(String orderState) {
				this.orderState = orderState;
			}

			public Long getRequiredCount() {
				return this.requiredCount;
			}

			public void setRequiredCount(Long requiredCount) {
				this.requiredCount = requiredCount;
			}

			public Long getCreatedMillis() {
				return this.createdMillis;
			}

			public void setCreatedMillis(Long createdMillis) {
				this.createdMillis = createdMillis;
			}

			public Long getAcceptedMillis() {
				return this.acceptedMillis;
			}

			public void setAcceptedMillis(Long acceptedMillis) {
				this.acceptedMillis = acceptedMillis;
			}
		}
	}

	@Override
	public ListGatewayTupleOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListGatewayTupleOrdersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
