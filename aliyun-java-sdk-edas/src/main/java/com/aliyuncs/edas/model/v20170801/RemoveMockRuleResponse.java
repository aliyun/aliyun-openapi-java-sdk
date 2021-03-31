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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.RemoveMockRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RemoveMockRuleResponse extends AcsResponse {

	private String code;

	private String httpCode;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String accountId;

		private String name;

		private String consumerAppId;

		private String consumerAppName;

		private Boolean enable;

		private String extraJson;

		private Long id;

		private String namespaceId;

		private String providerAppId;

		private String providerAppName;

		private String region;

		private String scMockItemJson;

		private String source;

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getConsumerAppId() {
			return this.consumerAppId;
		}

		public void setConsumerAppId(String consumerAppId) {
			this.consumerAppId = consumerAppId;
		}

		public String getConsumerAppName() {
			return this.consumerAppName;
		}

		public void setConsumerAppName(String consumerAppName) {
			this.consumerAppName = consumerAppName;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getExtraJson() {
			return this.extraJson;
		}

		public void setExtraJson(String extraJson) {
			this.extraJson = extraJson;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getProviderAppId() {
			return this.providerAppId;
		}

		public void setProviderAppId(String providerAppId) {
			this.providerAppId = providerAppId;
		}

		public String getProviderAppName() {
			return this.providerAppName;
		}

		public void setProviderAppName(String providerAppName) {
			this.providerAppName = providerAppName;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getScMockItemJson() {
			return this.scMockItemJson;
		}

		public void setScMockItemJson(String scMockItemJson) {
			this.scMockItemJson = scMockItemJson;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}
	}

	@Override
	public RemoveMockRuleResponse getInstance(UnmarshallerContext context) {
		return	RemoveMockRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
