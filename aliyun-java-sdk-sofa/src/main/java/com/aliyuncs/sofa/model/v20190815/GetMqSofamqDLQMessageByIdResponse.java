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
import com.aliyuncs.sofa.transform.v20190815.GetMqSofamqDLQMessageByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMqSofamqDLQMessageByIdResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private Data data;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

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

		private Long storeSize;

		private Long reconsumeTimes;

		private Long storeTimestamp;

		private String topic;

		private String storeHost;

		private Long bornTimestamp;

		private String instanceId;

		private String body;

		private String msgId;

		private Long bodyCrc;

		private String bornHost;

		private List<PropertyListItem> propertyList;

		public Long getStoreSize() {
			return this.storeSize;
		}

		public void setStoreSize(Long storeSize) {
			this.storeSize = storeSize;
		}

		public Long getReconsumeTimes() {
			return this.reconsumeTimes;
		}

		public void setReconsumeTimes(Long reconsumeTimes) {
			this.reconsumeTimes = reconsumeTimes;
		}

		public Long getStoreTimestamp() {
			return this.storeTimestamp;
		}

		public void setStoreTimestamp(Long storeTimestamp) {
			this.storeTimestamp = storeTimestamp;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getStoreHost() {
			return this.storeHost;
		}

		public void setStoreHost(String storeHost) {
			this.storeHost = storeHost;
		}

		public Long getBornTimestamp() {
			return this.bornTimestamp;
		}

		public void setBornTimestamp(Long bornTimestamp) {
			this.bornTimestamp = bornTimestamp;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBody() {
			return this.body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public String getMsgId() {
			return this.msgId;
		}

		public void setMsgId(String msgId) {
			this.msgId = msgId;
		}

		public Long getBodyCrc() {
			return this.bodyCrc;
		}

		public void setBodyCrc(Long bodyCrc) {
			this.bodyCrc = bodyCrc;
		}

		public String getBornHost() {
			return this.bornHost;
		}

		public void setBornHost(String bornHost) {
			this.bornHost = bornHost;
		}

		public List<PropertyListItem> getPropertyList() {
			return this.propertyList;
		}

		public void setPropertyList(List<PropertyListItem> propertyList) {
			this.propertyList = propertyList;
		}

		public static class PropertyListItem {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public GetMqSofamqDLQMessageByIdResponse getInstance(UnmarshallerContext context) {
		return	GetMqSofamqDLQMessageByIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
