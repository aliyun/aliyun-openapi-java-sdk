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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListCabInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCabInstancesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<AgentBotInstance> instances;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<AgentBotInstance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<AgentBotInstance> instances) {
		this.instances = instances;
	}

	public static class AgentBotInstance {

		private String instanceId;

		private String instanceName;

		private String instanceDescription;

		private Integer maxConcurrentConversation;

		private String owner;

		private Long creationTime;

		private String callCenterInstanceId;

		private Boolean isTemplateContainer;

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

		public String getInstanceDescription() {
			return this.instanceDescription;
		}

		public void setInstanceDescription(String instanceDescription) {
			this.instanceDescription = instanceDescription;
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

		public Boolean getIsTemplateContainer() {
			return this.isTemplateContainer;
		}

		public void setIsTemplateContainer(Boolean isTemplateContainer) {
			this.isTemplateContainer = isTemplateContainer;
		}
	}

	@Override
	public ListCabInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListCabInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
