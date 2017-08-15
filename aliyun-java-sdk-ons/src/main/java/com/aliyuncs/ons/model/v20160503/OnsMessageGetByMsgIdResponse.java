/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ons.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20160503.OnsMessageGetByMsgIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsMessageGetByMsgIdResponse extends AcsResponse {

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

		private String topic;

		private Integer flag;

		private String body;

		private Integer storeSize;

		private Long bornTimestamp;

		private String bornHost;

		private Long storeTimestamp;

		private String storeHost;

		private String msgId;

		private String offsetId;

		private Integer bodyCRC;

		private Integer reconsumeTimes;

		private List<MessageProperty> propertyList;

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Integer getFlag() {
			return this.flag;
		}

		public void setFlag(Integer flag) {
			this.flag = flag;
		}

		public String getBody() {
			return this.body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public Integer getStoreSize() {
			return this.storeSize;
		}

		public void setStoreSize(Integer storeSize) {
			this.storeSize = storeSize;
		}

		public Long getBornTimestamp() {
			return this.bornTimestamp;
		}

		public void setBornTimestamp(Long bornTimestamp) {
			this.bornTimestamp = bornTimestamp;
		}

		public String getBornHost() {
			return this.bornHost;
		}

		public void setBornHost(String bornHost) {
			this.bornHost = bornHost;
		}

		public Long getStoreTimestamp() {
			return this.storeTimestamp;
		}

		public void setStoreTimestamp(Long storeTimestamp) {
			this.storeTimestamp = storeTimestamp;
		}

		public String getStoreHost() {
			return this.storeHost;
		}

		public void setStoreHost(String storeHost) {
			this.storeHost = storeHost;
		}

		public String getMsgId() {
			return this.msgId;
		}

		public void setMsgId(String msgId) {
			this.msgId = msgId;
		}

		public String getOffsetId() {
			return this.offsetId;
		}

		public void setOffsetId(String offsetId) {
			this.offsetId = offsetId;
		}

		public Integer getBodyCRC() {
			return this.bodyCRC;
		}

		public void setBodyCRC(Integer bodyCRC) {
			this.bodyCRC = bodyCRC;
		}

		public Integer getReconsumeTimes() {
			return this.reconsumeTimes;
		}

		public void setReconsumeTimes(Integer reconsumeTimes) {
			this.reconsumeTimes = reconsumeTimes;
		}

		public List<MessageProperty> getPropertyList() {
			return this.propertyList;
		}

		public void setPropertyList(List<MessageProperty> propertyList) {
			this.propertyList = propertyList;
		}

		public static class MessageProperty {

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
	public OnsMessageGetByMsgIdResponse getInstance(UnmarshallerContext context) {
		return	OnsMessageGetByMsgIdResponseUnmarshaller.unmarshall(this, context);
	}
}
