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
package com.aliyuncs.iot.model.v20160530;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20160530.QueryTopicResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTopicResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private List<TopicInfo> topicList;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<TopicInfo> getTopicList() {
		return this.topicList;
	}

	public void setTopicList(List<TopicInfo> topicList) {
		this.topicList = topicList;
	}

	public static class TopicInfo {

		private String topicName;

		private String productKey;

		private Integer topicMessageCount;

		private String ownerUserId;

		public String getTopicName() {
			return this.topicName;
		}

		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public Integer getTopicMessageCount() {
			return this.topicMessageCount;
		}

		public void setTopicMessageCount(Integer topicMessageCount) {
			this.topicMessageCount = topicMessageCount;
		}

		public String getOwnerUserId() {
			return this.ownerUserId;
		}

		public void setOwnerUserId(String ownerUserId) {
			this.ownerUserId = ownerUserId;
		}
	}

	@Override
	public QueryTopicResponse getInstance(UnmarshallerContext context) {
		return	QueryTopicResponseUnmarshaller.unmarshall(this, context);
	}
}
