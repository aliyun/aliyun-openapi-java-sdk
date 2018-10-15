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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.CreateInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Instance instance;

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

	public Instance getInstance() {
		return this.instance;
	}

	public void setInstance(Instance instance) {
		this.instance = instance;
	}

	public static class Instance {

		private String instanceId;

		private String instanceName;

		private String instanceDescription;

		private String domainName;

		private String consoleUrl;

		private String storageBucket;

		private Integer storageMaxDays;

		private Integer storageMaxSize;

		private Integer maxOnlineAgents;

		private String tenantId;

		private String status;

		private String directoryId;

		private Long createdTime;

		private String owner;

		private List<User> admin;

		private List<PhoneNumber> phoneNumbers;

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

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getConsoleUrl() {
			return this.consoleUrl;
		}

		public void setConsoleUrl(String consoleUrl) {
			this.consoleUrl = consoleUrl;
		}

		public String getStorageBucket() {
			return this.storageBucket;
		}

		public void setStorageBucket(String storageBucket) {
			this.storageBucket = storageBucket;
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

		public Integer getMaxOnlineAgents() {
			return this.maxOnlineAgents;
		}

		public void setMaxOnlineAgents(Integer maxOnlineAgents) {
			this.maxOnlineAgents = maxOnlineAgents;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public List<User> getAdmin() {
			return this.admin;
		}

		public void setAdmin(List<User> admin) {
			this.admin = admin;
		}

		public List<PhoneNumber> getPhoneNumbers() {
			return this.phoneNumbers;
		}

		public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
			this.phoneNumbers = phoneNumbers;
		}

		public static class User {

			private String userId;

			private String ramId;

			private String instanceId;

			private Detail detail;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getRamId() {
				return this.ramId;
			}

			public void setRamId(String ramId) {
				this.ramId = ramId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Detail getDetail() {
				return this.detail;
			}

			public void setDetail(Detail detail) {
				this.detail = detail;
			}

			public static class Detail {

				private String loginName;

				private String displayName;

				private String phone;

				private String email;

				private String department;

				public String getLoginName() {
					return this.loginName;
				}

				public void setLoginName(String loginName) {
					this.loginName = loginName;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getPhone() {
					return this.phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getDepartment() {
					return this.department;
				}

				public void setDepartment(String department) {
					this.department = department;
				}
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
	public CreateInstanceResponse getInstance(UnmarshallerContext context) {
		return	CreateInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
