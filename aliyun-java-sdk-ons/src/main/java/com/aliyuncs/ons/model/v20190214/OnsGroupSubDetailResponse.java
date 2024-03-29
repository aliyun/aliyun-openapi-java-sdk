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

package com.aliyuncs.ons.model.v20190214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20190214.OnsGroupSubDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsGroupSubDetailResponse extends AcsResponse {

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

			private String subString;

			private String topic;

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
	public OnsGroupSubDetailResponse getInstance(UnmarshallerContext context) {
		return	OnsGroupSubDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
