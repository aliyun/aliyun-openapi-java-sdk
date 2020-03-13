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
import com.aliyuncs.sofa.transform.v20190815.QueryMqSofamqTopicSubDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMqSofamqTopicSubDetailResponse extends AcsResponse {

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

		private Long latestSendTime;

		private String topic;

		private List<SubscriptionDataListItem> subscriptionDataList;

		public Long getLatestSendTime() {
			return this.latestSendTime;
		}

		public void setLatestSendTime(Long latestSendTime) {
			this.latestSendTime = latestSendTime;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public List<SubscriptionDataListItem> getSubscriptionDataList() {
			return this.subscriptionDataList;
		}

		public void setSubscriptionDataList(List<SubscriptionDataListItem> subscriptionDataList) {
			this.subscriptionDataList = subscriptionDataList;
		}

		public static class SubscriptionDataListItem {

			private String groupId;

			private String messageModel;

			private String subString;

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

			public String getSubString() {
				return this.subString;
			}

			public void setSubString(String subString) {
				this.subString = subString;
			}
		}
	}

	@Override
	public QueryMqSofamqTopicSubDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryMqSofamqTopicSubDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
