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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryRmsAlertRuleSubscribesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsAlertRuleSubscribesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Response response;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private List<EntitiesItem> entities;

		private Meta meta;

		public List<EntitiesItem> getEntities() {
			return this.entities;
		}

		public void setEntities(List<EntitiesItem> entities) {
			this.entities = entities;
		}

		public Meta getMeta() {
			return this.meta;
		}

		public void setMeta(Meta meta) {
			this.meta = meta;
		}

		public static class EntitiesItem {

			private Entity entity;

			public Entity getEntity() {
				return this.entity;
			}

			public void setEntity(Entity entity) {
				this.entity = entity;
			}

			public static class Entity {

				private String id;

				private String monitorTargetType;

				private String projectId;

				private String subscriberId;

				private String subscriberLoginName;

				private String subscriberType;

				private String subscriptionTargetId;

				private String subscriptionTargetType;

				private String tenantId;

				private String workspaceId;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getMonitorTargetType() {
					return this.monitorTargetType;
				}

				public void setMonitorTargetType(String monitorTargetType) {
					this.monitorTargetType = monitorTargetType;
				}

				public String getProjectId() {
					return this.projectId;
				}

				public void setProjectId(String projectId) {
					this.projectId = projectId;
				}

				public String getSubscriberId() {
					return this.subscriberId;
				}

				public void setSubscriberId(String subscriberId) {
					this.subscriberId = subscriberId;
				}

				public String getSubscriberLoginName() {
					return this.subscriberLoginName;
				}

				public void setSubscriberLoginName(String subscriberLoginName) {
					this.subscriberLoginName = subscriberLoginName;
				}

				public String getSubscriberType() {
					return this.subscriberType;
				}

				public void setSubscriberType(String subscriberType) {
					this.subscriberType = subscriberType;
				}

				public String getSubscriptionTargetId() {
					return this.subscriptionTargetId;
				}

				public void setSubscriptionTargetId(String subscriptionTargetId) {
					this.subscriptionTargetId = subscriptionTargetId;
				}

				public String getSubscriptionTargetType() {
					return this.subscriptionTargetType;
				}

				public void setSubscriptionTargetType(String subscriptionTargetType) {
					this.subscriptionTargetType = subscriptionTargetType;
				}

				public String getTenantId() {
					return this.tenantId;
				}

				public void setTenantId(String tenantId) {
					this.tenantId = tenantId;
				}

				public String getWorkspaceId() {
					return this.workspaceId;
				}

				public void setWorkspaceId(String workspaceId) {
					this.workspaceId = workspaceId;
				}
			}
		}

		public static class Meta {

			private Page page;

			public Page getPage() {
				return this.page;
			}

			public void setPage(Page page) {
				this.page = page;
			}

			public static class Page {

				private Long limit;

				private Long offset;

				private Long totalSize;

				public Long getLimit() {
					return this.limit;
				}

				public void setLimit(Long limit) {
					this.limit = limit;
				}

				public Long getOffset() {
					return this.offset;
				}

				public void setOffset(Long offset) {
					this.offset = offset;
				}

				public Long getTotalSize() {
					return this.totalSize;
				}

				public void setTotalSize(Long totalSize) {
					this.totalSize = totalSize;
				}
			}
		}
	}

	@Override
	public QueryRmsAlertRuleSubscribesResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsAlertRuleSubscribesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
