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
import com.aliyuncs.sofa.transform.v20190815.QueryMqSofamqGroupSubDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMqSofamqGroupSubDetailResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String groupId;

		private String messageModel;

		private Boolean online;

		private List<SubscriptionDataListItem> subscriptionDataList;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getMessageModel() {
			return this.messageModel;
		}

		public void setMessageModel(String messageModel) {
			this.messageModel = messageModel;
		}

		public Boolean getOnline() {
			return this.online;
		}

		public void setOnline(Boolean online) {
			this.online = online;
		}

		public List<SubscriptionDataListItem> getSubscriptionDataList() {
			return this.subscriptionDataList;
		}

		public void setSubscriptionDataList(List<SubscriptionDataListItem> subscriptionDataList) {
			this.subscriptionDataList = subscriptionDataList;
		}

		public static class SubscriptionDataListItem {

			private Boolean online;

			private String subString;

			private String topic;

			public Boolean getOnline() {
				return this.online;
			}

			public void setOnline(Boolean online) {
				this.online = online;
			}

			public String getSubString() {
				return this.subString;
			}

			public void setSubString(String subString) {
				this.subString = subString;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}
		}
	}

	@Override
	public QueryMqSofamqGroupSubDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryMqSofamqGroupSubDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
