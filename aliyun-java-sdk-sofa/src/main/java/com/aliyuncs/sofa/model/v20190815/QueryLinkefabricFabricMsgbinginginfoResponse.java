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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLinkefabricFabricMsgbinginginfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkefabricFabricMsgbinginginfoResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String action;

		private String appName;

		private String clusterName;

		private String eventcode;

		private String exchangeType;

		private String expression;

		private String filterType;

		private String filterValue;

		private String group;

		private Boolean persistence;

		private String roomInfo;

		private String topic;

		private String zoneInfo;

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getEventcode() {
			return this.eventcode;
		}

		public void setEventcode(String eventcode) {
			this.eventcode = eventcode;
		}

		public String getExchangeType() {
			return this.exchangeType;
		}

		public void setExchangeType(String exchangeType) {
			this.exchangeType = exchangeType;
		}

		public String getExpression() {
			return this.expression;
		}

		public void setExpression(String expression) {
			this.expression = expression;
		}

		public String getFilterType() {
			return this.filterType;
		}

		public void setFilterType(String filterType) {
			this.filterType = filterType;
		}

		public String getFilterValue() {
			return this.filterValue;
		}

		public void setFilterValue(String filterValue) {
			this.filterValue = filterValue;
		}

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public Boolean getPersistence() {
			return this.persistence;
		}

		public void setPersistence(Boolean persistence) {
			this.persistence = persistence;
		}

		public String getRoomInfo() {
			return this.roomInfo;
		}

		public void setRoomInfo(String roomInfo) {
			this.roomInfo = roomInfo;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getZoneInfo() {
			return this.zoneInfo;
		}

		public void setZoneInfo(String zoneInfo) {
			this.zoneInfo = zoneInfo;
		}
	}

	@Override
	public QueryLinkefabricFabricMsgbinginginfoResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkefabricFabricMsgbinginginfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
