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

package com.aliyuncs.onsmqtt.model.v20200420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.onsmqtt.transform.v20200420.QueryMqttTraceMessageSubscribeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMqttTraceMessageSubscribeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private Long total;

	private Integer pageSize;

	private Integer currentPage;

	private List<MessageTraceListsItem> messageTraceLists;

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<MessageTraceListsItem> getMessageTraceLists() {
		return this.messageTraceLists;
	}

	public void setMessageTraceLists(List<MessageTraceListsItem> messageTraceLists) {
		this.messageTraceLists = messageTraceLists;
	}

	public static class MessageTraceListsItem {

		private String clientId;

		private String actionInfo;

		private String action;

		private String actionCode;

		private String msgId;

		private String time;

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getActionInfo() {
			return this.actionInfo;
		}

		public void setActionInfo(String actionInfo) {
			this.actionInfo = actionInfo;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getActionCode() {
			return this.actionCode;
		}

		public void setActionCode(String actionCode) {
			this.actionCode = actionCode;
		}

		public String getMsgId() {
			return this.msgId;
		}

		public void setMsgId(String msgId) {
			this.msgId = msgId;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	}

	@Override
	public QueryMqttTraceMessageSubscribeResponse getInstance(UnmarshallerContext context) {
		return	QueryMqttTraceMessageSubscribeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
