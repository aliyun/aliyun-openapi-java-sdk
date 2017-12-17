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
package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ListContactFlowsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListContactFlowsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<ContactFlow> contactFlows;

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

	public List<ContactFlow> getContactFlows() {
		return this.contactFlows;
	}

	public void setContactFlows(List<ContactFlow> contactFlows) {
		this.contactFlows = contactFlows;
	}

	public static class ContactFlow {

		private String contactFlowId;

		private String instanceId;

		private String contactFlowName;

		private String contactFlowDescription;

		private String type;

		private String appliedVersion;

		private List<ContactFlowVersion> versions;

		private List<PhoneNumber> phoneNumbers;

		public String getContactFlowId() {
			return this.contactFlowId;
		}

		public void setContactFlowId(String contactFlowId) {
			this.contactFlowId = contactFlowId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getContactFlowName() {
			return this.contactFlowName;
		}

		public void setContactFlowName(String contactFlowName) {
			this.contactFlowName = contactFlowName;
		}

		public String getContactFlowDescription() {
			return this.contactFlowDescription;
		}

		public void setContactFlowDescription(String contactFlowDescription) {
			this.contactFlowDescription = contactFlowDescription;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAppliedVersion() {
			return this.appliedVersion;
		}

		public void setAppliedVersion(String appliedVersion) {
			this.appliedVersion = appliedVersion;
		}

		public List<ContactFlowVersion> getVersions() {
			return this.versions;
		}

		public void setVersions(List<ContactFlowVersion> versions) {
			this.versions = versions;
		}

		public List<PhoneNumber> getPhoneNumbers() {
			return this.phoneNumbers;
		}

		public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}

		public static class ContactFlowVersion {

			private String contactFlowVersionId;

			private String version;

			private String contactFlowVersionDescription;

			private String lastModified;

			private String lastModifiedBy;

			private String lockedBy;

			private String status;

			public String getContactFlowVersionId() {
				return this.contactFlowVersionId;
			}

			public void setContactFlowVersionId(String contactFlowVersionId) {
				this.contactFlowVersionId = contactFlowVersionId;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getContactFlowVersionDescription() {
				return this.contactFlowVersionDescription;
			}

			public void setContactFlowVersionDescription(String contactFlowVersionDescription) {
				this.contactFlowVersionDescription = contactFlowVersionDescription;
			}

			public String getLastModified() {
				return this.lastModified;
			}

			public void setLastModified(String lastModified) {
				this.lastModified = lastModified;
			}

			public String getLastModifiedBy() {
				return this.lastModifiedBy;
			}

			public void setLastModifiedBy(String lastModifiedBy) {
				this.lastModifiedBy = lastModifiedBy;
			}

			public String getLockedBy() {
				return this.lockedBy;
			}

			public void setLockedBy(String lockedBy) {
				this.lockedBy = lockedBy;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class PhoneNumber {

			private String phoneNumberId;

			private String instanceId;

			private String number;

			private String phoneNumberDescription;

			private Boolean testOnly;

			private Integer remainingTime;

			private Boolean allowOutbound;

			private String usage;

			private Integer trunks;

			public String getPhoneNumberId() {
				return this.phoneNumberId;
			}

			public void setPhoneNumberId(String phoneNumberId) {
				this.phoneNumberId = phoneNumberId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getNumber() {
				return this.number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public String getPhoneNumberDescription() {
				return this.phoneNumberDescription;
			}

			public void setPhoneNumberDescription(String phoneNumberDescription) {
				this.phoneNumberDescription = phoneNumberDescription;
			}

			public Boolean getTestOnly() {
				return this.testOnly;
			}

			public void setTestOnly(Boolean testOnly) {
				this.testOnly = testOnly;
			}

			public Integer getRemainingTime() {
				return this.remainingTime;
			}

			public void setRemainingTime(Integer remainingTime) {
				this.remainingTime = remainingTime;
			}

			public Boolean getAllowOutbound() {
				return this.allowOutbound;
			}

			public void setAllowOutbound(Boolean allowOutbound) {
				this.allowOutbound = allowOutbound;
			}

			public String getUsage() {
				return this.usage;
			}

			public void setUsage(String usage) {
				this.usage = usage;
			}

			public Integer getTrunks() {
				return this.trunks;
			}

			public void setTrunks(Integer trunks) {
				this.trunks = trunks;
			}
		}
	}

	@Override
	public ListContactFlowsResponse getInstance(UnmarshallerContext context) {
		return	ListContactFlowsResponseUnmarshaller.unmarshall(this, context);
	}
}
