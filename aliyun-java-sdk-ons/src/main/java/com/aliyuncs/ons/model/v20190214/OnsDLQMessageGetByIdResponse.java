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
import com.aliyuncs.ons.transform.v20190214.OnsDLQMessageGetByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsDLQMessageGetByIdResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String offsetId;

		private Integer storeSize;

		private Integer reconsumeTimes;

		private Long storeTimestamp;

		private String body;

		private String instanceId;

		private String msgId;

		private Integer flag;

		private String storeHost;

		private String topic;

		private Long bornTimestamp;

		private Integer bodyCRC;

		private String bornHost;

		private List<MessageProperty> propertyList;

		public String getOffsetId() {
			return this.offsetId;
		}

		public void setOffsetId(String offsetId) {
			this.offsetId = offsetId;
		}

		public Integer getStoreSize() {
			return this.storeSize;
		}

		public void setStoreSize(Integer storeSize) {
			this.storeSize = storeSize;
		}

		public Integer getReconsumeTimes() {
			return this.reconsumeTimes;
		}

		public void setReconsumeTimes(Integer reconsumeTimes) {
			this.reconsumeTimes = reconsumeTimes;
		}

		public Long getStoreTimestamp() {
			return this.storeTimestamp;
		}

		public void setStoreTimestamp(Long storeTimestamp) {
			this.storeTimestamp = storeTimestamp;
		}

		public String getBody() {
			return this.body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getMsgId() {
			return this.msgId;
		}

		public void setMsgId(String msgId) {
			this.msgId = msgId;
		}

		public Integer getFlag() {
			return this.flag;
		}

		public void setFlag(Integer flag) {
			this.flag = flag;
		}

		public String getStoreHost() {
			return this.storeHost;
		}

		public void setStoreHost(String storeHost) {
			this.storeHost = storeHost;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Long getBornTimestamp() {
			return this.bornTimestamp;
		}

		public void setBornTimestamp(Long bornTimestamp) {
			this.bornTimestamp = bornTimestamp;
		}

		public Integer getBodyCRC() {
			return this.bodyCRC;
		}

		public void setBodyCRC(Integer bodyCRC) {
			this.bodyCRC = bodyCRC;
		}

		public String getBornHost() {
			return this.bornHost;
		}

		public void setBornHost(String bornHost) {
			this.bornHost = bornHost;
		}

		public List<MessageProperty> getPropertyList() {
			return this.propertyList;
		}

		public void setPropertyList(List<MessageProperty> propertyList) {
			this.propertyList = propertyList;
		}

		public static class MessageProperty {

			private String value;

			private String name;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public OnsDLQMessageGetByIdResponse getInstance(UnmarshallerContext context) {
		return	OnsDLQMessageGetByIdResponseUnmarshaller.unmarshall(this, context);
	}
}
