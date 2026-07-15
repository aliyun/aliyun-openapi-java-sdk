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

package com.aliyuncs.schedulerx2.model.v20190430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx2.transform.v20190430.ReadSchedulerxNotificationPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ReadSchedulerxNotificationPolicyResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Integer code;

	private Boolean success;

	private AccessDeniedDetail accessDeniedDetail;

	private Data data;

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public AccessDeniedDetail getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class AccessDeniedDetail {

		private String policyType;

		private String authPrincipalOwnerId;

		private String encodedDiagnosticMessage;

		private String authPrincipalType;

		private String authPrincipalDisplayName;

		private String noPermissionType;

		private String authAction;

		public String getPolicyType() {
			return this.policyType;
		}

		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}

		public String getAuthPrincipalOwnerId() {
			return this.authPrincipalOwnerId;
		}

		public void setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
			this.authPrincipalOwnerId = authPrincipalOwnerId;
		}

		public String getEncodedDiagnosticMessage() {
			return this.encodedDiagnosticMessage;
		}

		public void setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
			this.encodedDiagnosticMessage = encodedDiagnosticMessage;
		}

		public String getAuthPrincipalType() {
			return this.authPrincipalType;
		}

		public void setAuthPrincipalType(String authPrincipalType) {
			this.authPrincipalType = authPrincipalType;
		}

		public String getAuthPrincipalDisplayName() {
			return this.authPrincipalDisplayName;
		}

		public void setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
			this.authPrincipalDisplayName = authPrincipalDisplayName;
		}

		public String getNoPermissionType() {
			return this.noPermissionType;
		}

		public void setNoPermissionType(String noPermissionType) {
			this.noPermissionType = noPermissionType;
		}

		public String getAuthAction() {
			return this.authAction;
		}

		public void setAuthAction(String authAction) {
			this.authAction = authAction;
		}
	}

	public static class Data {

		private String nextToken;

		private Long total;

		private Integer maxResults;

		private List<Record> records;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String description;

			private String updater;

			private String policyName;

			private String createTime;

			private String updateTime;

			private String creator;

			private String channelTimeRange;

			private List<ReferencedApp> referenceApps;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getUpdater() {
				return this.updater;
			}

			public void setUpdater(String updater) {
				this.updater = updater;
			}

			public String getPolicyName() {
				return this.policyName;
			}

			public void setPolicyName(String policyName) {
				this.policyName = policyName;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getChannelTimeRange() {
				return this.channelTimeRange;
			}

			public void setChannelTimeRange(String channelTimeRange) {
				this.channelTimeRange = channelTimeRange;
			}

			public List<ReferencedApp> getReferenceApps() {
				return this.referenceApps;
			}

			public void setReferenceApps(List<ReferencedApp> referenceApps) {
				this.referenceApps = referenceApps;
			}

			public static class ReferencedApp {

				private String namespaceName;

				private String namespaceUid;

				private Long appGroupId;

				private String groupId;

				public String getNamespaceName() {
					return this.namespaceName;
				}

				public void setNamespaceName(String namespaceName) {
					this.namespaceName = namespaceName;
				}

				public String getNamespaceUid() {
					return this.namespaceUid;
				}

				public void setNamespaceUid(String namespaceUid) {
					this.namespaceUid = namespaceUid;
				}

				public Long getAppGroupId() {
					return this.appGroupId;
				}

				public void setAppGroupId(Long appGroupId) {
					this.appGroupId = appGroupId;
				}

				public String getGroupId() {
					return this.groupId;
				}

				public void setGroupId(String groupId) {
					this.groupId = groupId;
				}
			}
		}
	}

	@Override
	public ReadSchedulerxNotificationPolicyResponse getInstance(UnmarshallerContext context) {
		return	ReadSchedulerxNotificationPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
