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
import com.aliyuncs.sofa.transform.v20190815.QueryRmsAlarmBlacklistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsAlarmBlacklistResponse extends AcsResponse {

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

		private List<MetaItem> meta;

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

			private String layer;

			private Entity entity;

			public String getLayer() {
				return this.layer;
			}

			public void setLayer(String layer) {
				this.layer = layer;
			}

			public Entity getEntity() {
				return this.entity;
			}

			public void setEntity(Entity entity) {
				this.entity = entity;
			}

			public static class Entity {

				private String applyTargetId;

				private String id;

				private String resId;

				private String resName;

				private String resType;

				private String ruleType;

				private String tenantId;

				private String userId;

				private String userName;

				private String utcCreated;

				private String utcModified;

				private String validEndTime;

				private String validStartTime;

				private String workspaceId;

				public String getApplyTargetId() {
					return this.applyTargetId;
				}

				public void setApplyTargetId(String applyTargetId) {
					this.applyTargetId = applyTargetId;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getResId() {
					return this.resId;
				}

				public void setResId(String resId) {
					this.resId = resId;
				}

				public String getResName() {
					return this.resName;
				}

				public void setResName(String resName) {
					this.resName = resName;
				}

				public String getResType() {
					return this.resType;
				}

				public void setResType(String resType) {
					this.resType = resType;
				}

				public String getRuleType() {
					return this.ruleType;
				}

				public void setRuleType(String ruleType) {
					this.ruleType = ruleType;
				}

				public String getTenantId() {
					return this.tenantId;
				}

				public void setTenantId(String tenantId) {
					this.tenantId = tenantId;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getUserName() {
					return this.userName;
				}

				public void setUserName(String userName) {
					this.userName = userName;
				}

				public String getUtcCreated() {
					return this.utcCreated;
				}

				public void setUtcCreated(String utcCreated) {
					this.utcCreated = utcCreated;
				}

				public String getUtcModified() {
					return this.utcModified;
				}

				public void setUtcModified(String utcModified) {
					this.utcModified = utcModified;
				}

				public String getValidEndTime() {
					return this.validEndTime;
				}

				public void setValidEndTime(String validEndTime) {
					this.validEndTime = validEndTime;
				}

				public String getValidStartTime() {
					return this.validStartTime;
				}

				public void setValidStartTime(String validStartTime) {
					this.validStartTime = validStartTime;
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
	public QueryRmsAlarmBlacklistResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsAlarmBlacklistResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
