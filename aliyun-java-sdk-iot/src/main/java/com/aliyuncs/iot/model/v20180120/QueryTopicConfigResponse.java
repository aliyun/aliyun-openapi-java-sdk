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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryTopicConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTopicConfigResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<TopicConfigInfo> data;

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

	public List<TopicConfigInfo> getData() {
		return this.data;
	}

	public void setData(List<TopicConfigInfo> data) {
		this.data = data;
	}

	public static class TopicConfigInfo {

		private String productKey;

		private String topicFullName;

		private String operation;

		private String description;

		private Boolean enableBroadcast;

		private Boolean enableProxySubscribe;

		private String codec;

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getTopicFullName() {
			return this.topicFullName;
		}

		public void setTopicFullName(String topicFullName) {
			this.topicFullName = topicFullName;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getEnableBroadcast() {
			return this.enableBroadcast;
		}

		public void setEnableBroadcast(Boolean enableBroadcast) {
			this.enableBroadcast = enableBroadcast;
		}

		public Boolean getEnableProxySubscribe() {
			return this.enableProxySubscribe;
		}

		public void setEnableProxySubscribe(Boolean enableProxySubscribe) {
			this.enableProxySubscribe = enableProxySubscribe;
		}

		public String getCodec() {
			return this.codec;
		}

		public void setCodec(String codec) {
			this.codec = codec;
		}
	}

	@Override
	public QueryTopicConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryTopicConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
