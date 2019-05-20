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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetSystemSpecificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSystemSpecificationResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private SystemSpecification systemSpecification;

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

	public SystemSpecification getSystemSpecification() {
		return this.systemSpecification;
	}

	public void setSystemSpecification(SystemSpecification systemSpecification) {
		this.systemSpecification = systemSpecification;
	}

	public static class SystemSpecification {

		private String specificationId;

		private String account;

		private Integer maxInstances;

		private Integer maxAgents;

		private Integer maxOnlineAgents;

		private Integer storageMaxDays;

		private Integer storageMaxSize;

		private Integer maxPhoneNumbers;

		private Integer maxSkillGroups;

		private Integer maxContactFlows;

		private Integer maxRoles;

		private Integer freeNumberCount;

		public String getSpecificationId() {
			return this.specificationId;
		}

		public void setSpecificationId(String specificationId) {
			this.specificationId = specificationId;
		}

		public String getAccount() {
			return this.account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public Integer getMaxInstances() {
			return this.maxInstances;
		}

		public void setMaxInstances(Integer maxInstances) {
			this.maxInstances = maxInstances;
		}

		public Integer getMaxAgents() {
			return this.maxAgents;
		}

		public void setMaxAgents(Integer maxAgents) {
			this.maxAgents = maxAgents;
		}

		public Integer getMaxOnlineAgents() {
			return this.maxOnlineAgents;
		}

		public void setMaxOnlineAgents(Integer maxOnlineAgents) {
			this.maxOnlineAgents = maxOnlineAgents;
		}

		public Integer getStorageMaxDays() {
			return this.storageMaxDays;
		}

		public void setStorageMaxDays(Integer storageMaxDays) {
			this.storageMaxDays = storageMaxDays;
		}

		public Integer getStorageMaxSize() {
			return this.storageMaxSize;
		}

		public void setStorageMaxSize(Integer storageMaxSize) {
			this.storageMaxSize = storageMaxSize;
		}

		public Integer getMaxPhoneNumbers() {
			return this.maxPhoneNumbers;
		}

		public void setMaxPhoneNumbers(Integer maxPhoneNumbers) {
			this.maxPhoneNumbers = maxPhoneNumbers;
		}

		public Integer getMaxSkillGroups() {
			return this.maxSkillGroups;
		}

		public void setMaxSkillGroups(Integer maxSkillGroups) {
			this.maxSkillGroups = maxSkillGroups;
		}

		public Integer getMaxContactFlows() {
			return this.maxContactFlows;
		}

		public void setMaxContactFlows(Integer maxContactFlows) {
			this.maxContactFlows = maxContactFlows;
		}

		public Integer getMaxRoles() {
			return this.maxRoles;
		}

		public void setMaxRoles(Integer maxRoles) {
			this.maxRoles = maxRoles;
		}

		public Integer getFreeNumberCount() {
			return this.freeNumberCount;
		}

		public void setFreeNumberCount(Integer freeNumberCount) {
			this.freeNumberCount = freeNumberCount;
		}
	}

	@Override
	public GetSystemSpecificationResponse getInstance(UnmarshallerContext context) {
		return	GetSystemSpecificationResponseUnmarshaller.unmarshall(this, context);
	}
}
