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
import com.aliyuncs.sofa.transform.v20190815.QueryRmsSubscriptionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsSubscriptionsResponse extends AcsResponse {

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

		private String errCode;

		private String errMsg;

		private String errResolution;

		private List<EntitiesItem> entities;

		private List<MetaItem> meta;

		public String getErrCode() {
			return this.errCode;
		}

		public void setErrCode(String errCode) {
			this.errCode = errCode;
		}

		public String getErrMsg() {
			return this.errMsg;
		}

		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}

		public String getErrResolution() {
			return this.errResolution;
		}

		public void setErrResolution(String errResolution) {
			this.errResolution = errResolution;
		}

		public List<EntitiesItem> getEntities() {
			return this.entities;
		}

		public void setEntities(List<EntitiesItem> entities) {
			this.entities = entities;
		}

		public List<MetaItem> getMeta() {
			return this.meta;
		}

		public void setMeta(List<MetaItem> meta) {
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

		public static class MetaItem {

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
	}

	@Override
	public QueryRmsSubscriptionsResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsSubscriptionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
