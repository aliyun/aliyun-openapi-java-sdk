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

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Instance> instances;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private Long creationTime;

		private String callCenterInstanceId;

		private String owner;

		private String nluServiceType;

		private Boolean isTemplateContainer;

		private String instanceId;

		private String ownerName;

		private Long creatorId;

		private String instanceDescription;

		private String instanceName;

		private String resourceGroupId;

		private String creatorName;

		private Integer maxConcurrentConversation;

		private Boolean isPreset;

		private List<ResourceTag> resourceTags;

		private NluProfile nluProfile;

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getCallCenterInstanceId() {
			return this.callCenterInstanceId;
		}

		public void setCallCenterInstanceId(String callCenterInstanceId) {
			this.callCenterInstanceId = callCenterInstanceId;
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

		public Boolean getIsTemplateContainer() {
			return this.isTemplateContainer;
		}

		public void setIsTemplateContainer(Boolean isTemplateContainer) {
			this.isTemplateContainer = isTemplateContainer;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public String getInstanceDescription() {
			return this.instanceDescription;
		}

		public void setInstanceDescription(String instanceDescription) {
			this.instanceDescription = instanceDescription;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCreatorName() {
			return this.creatorName;
		}

		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}

		public Integer getMaxConcurrentConversation() {
			return this.maxConcurrentConversation;
		}

		public void setMaxConcurrentConversation(Integer maxConcurrentConversation) {
			this.maxConcurrentConversation = maxConcurrentConversation;
		}

		public Boolean getIsPreset() {
			return this.isPreset;
		}

		public void setIsPreset(Boolean isPreset) {
			this.isPreset = isPreset;
		}

		public List<ResourceTag> getResourceTags() {
			return this.resourceTags;
		}

		public void setResourceTags(List<ResourceTag> resourceTags) {
			this.resourceTags = resourceTags;
		}

		public NluProfile getNluProfile() {
			return this.nluProfile;
		}

		public void setNluProfile(NluProfile nluProfile) {
			this.nluProfile = nluProfile;
		}

		public static class ResourceTag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class NluProfile {

			private String accessKey;

			private String secretKey;

			private String endpoint;

			private String agentId;

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

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getAgentId() {
				return this.agentId;
			}

			public void setAgentId(String agentId) {
				this.agentId = agentId;
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
