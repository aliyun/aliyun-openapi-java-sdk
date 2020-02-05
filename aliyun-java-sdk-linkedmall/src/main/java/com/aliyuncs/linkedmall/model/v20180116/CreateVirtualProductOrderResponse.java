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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.CreateVirtualProductOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateVirtualProductOrderResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String subCode;

	private String subMessage;

	private String logsId;

	private Boolean success;

	private Long totalCount;

	private Model model;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMessage() {
		return this.subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private String redirectUrl;

		private List<LmOrderListItem> lmOrderList;

		private List<String> orderIds;

		private List<String> payTradeIds;

		public String getRedirectUrl() {
			return this.redirectUrl;
		}

		public void setRedirectUrl(String redirectUrl) {
			this.redirectUrl = redirectUrl;
		}

		public List<LmOrderListItem> getLmOrderList() {
			return this.lmOrderList;
		}

		public void setLmOrderList(List<LmOrderListItem> lmOrderList) {
			this.lmOrderList = lmOrderList;
		}

		public List<String> getOrderIds() {
			return this.orderIds;
		}

		public void setOrderIds(List<String> orderIds) {
			this.orderIds = orderIds;
		}

		public List<String> getPayTradeIds() {
			return this.payTradeIds;
		}

		public void setPayTradeIds(List<String> payTradeIds) {
			this.payTradeIds = payTradeIds;
		}

		public static class LmOrderListItem {

			private String lmOrderId;

			public String getLmOrderId() {
				return this.lmOrderId;
			}

			public void setLmOrderId(String lmOrderId) {
				this.lmOrderId = lmOrderId;
			}
		}
	}

	@Override
	public CreateVirtualProductOrderResponse getInstance(UnmarshallerContext context) {
		return	CreateVirtualProductOrderResponseUnmarshaller.unmarshall(this, context);
	}
}
