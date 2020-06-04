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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstancesResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private List<Instance> instances;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String callCenterInstanceId;

		private Long creationTime;

		private String instanceDescription;

		private String instanceId;

		private String instanceName;

		private Boolean isTemplateContainer;

		private Integer maxConcurrentConversation;

		private String owner;

		private String nluServiceType;

		private NluProfile nluProfile;

		public String getCallCenterInstanceId() {
			return this.callCenterInstanceId;
		}

		public void setCallCenterInstanceId(String callCenterInstanceId) {
			this.callCenterInstanceId = callCenterInstanceId;
		}

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getInstanceDescription() {
			return this.instanceDescription;
		}

		public void setInstanceDescription(String instanceDescription) {
			this.instanceDescription = instanceDescription;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Boolean getIsTemplateContainer() {
			return this.isTemplateContainer;
		}

		public void setIsTemplateContainer(Boolean isTemplateContainer) {
			this.isTemplateContainer = isTemplateContainer;
		}

		public Integer getMaxConcurrentConversation() {
			return this.maxConcurrentConversation;
		}

		public void setMaxConcurrentConversation(Integer maxConcurrentConversation) {
			this.maxConcurrentConversation = maxConcurrentConversation;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getNluServiceType() {
			return this.nluServiceType;
		}

		public void setNluServiceType(String nluServiceType) {
			this.nluServiceType = nluServiceType;
		}

		public NluProfile getNluProfile() {
			return this.nluProfile;
		}

		public void setNluProfile(NluProfile nluProfile) {
			this.nluProfile = nluProfile;
		}

		public static class NluProfile {

			private String endpoint;

			private String accessKey;

			private String secretKey;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getAccessKey() {
				return this.accessKey;
			}

			public void setAccessKey(String accessKey) {
				this.accessKey = accessKey;
			}

			public String getSecretKey() {
				return this.secretKey;
			}

			public void setSecretKey(String secretKey) {
				this.secretKey = secretKey;
			}
		}
	}

	@Override
	public ListInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
