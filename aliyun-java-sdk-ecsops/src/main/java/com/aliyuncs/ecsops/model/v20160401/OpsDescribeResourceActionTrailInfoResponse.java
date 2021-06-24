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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeResourceActionTrailInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeResourceActionTrailInfoResponse extends AcsResponse {

	private String requestId;

	private List<Resource> resources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private String relatedResourceId;

		private String endTime;

		private String startTime;

		private String nextToken;

		private String resourceId;

		private String relatedResourceType;

		private List<ResourceAction> resourceActions;

		public String getRelatedResourceId() {
			return this.relatedResourceId;
		}

		public void setRelatedResourceId(String relatedResourceId) {
			this.relatedResourceId = relatedResourceId;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getRelatedResourceType() {
			return this.relatedResourceType;
		}

		public void setRelatedResourceType(String relatedResourceType) {
			this.relatedResourceType = relatedResourceType;
		}

		public List<ResourceAction> getResourceActions() {
			return this.resourceActions;
		}

		public void setResourceActions(List<ResourceAction> resourceActions) {
			this.resourceActions = resourceActions;
		}

		public static class ResourceAction {

			private String actionErrorCode;

			private String actionEventSource;

			private Boolean actionSuccess;

			private String actionEventType;

			private String actionSourceIpAddress;

			private String actionRequestId;

			private String userInfoAk;

			private String actionEventName;

			private String actionApiVersion;

			private String actionEventTime;

			private String actionEventId;

			private String actionErrorMessage;

			private List<ActionRelatedResource> actionRelatedResources;

			public String getActionErrorCode() {
				return this.actionErrorCode;
			}

			public void setActionErrorCode(String actionErrorCode) {
				this.actionErrorCode = actionErrorCode;
			}

			public String getActionEventSource() {
				return this.actionEventSource;
			}

			public void setActionEventSource(String actionEventSource) {
				this.actionEventSource = actionEventSource;
			}

			public Boolean getActionSuccess() {
				return this.actionSuccess;
			}

			public void setActionSuccess(Boolean actionSuccess) {
				this.actionSuccess = actionSuccess;
			}

			public String getActionEventType() {
				return this.actionEventType;
			}

			public void setActionEventType(String actionEventType) {
				this.actionEventType = actionEventType;
			}

			public String getActionSourceIpAddress() {
				return this.actionSourceIpAddress;
			}

			public void setActionSourceIpAddress(String actionSourceIpAddress) {
				this.actionSourceIpAddress = actionSourceIpAddress;
			}

			public String getActionRequestId() {
				return this.actionRequestId;
			}

			public void setActionRequestId(String actionRequestId) {
				this.actionRequestId = actionRequestId;
			}

			public String getUserInfoAk() {
				return this.userInfoAk;
			}

			public void setUserInfoAk(String userInfoAk) {
				this.userInfoAk = userInfoAk;
			}

			public String getActionEventName() {
				return this.actionEventName;
			}

			public void setActionEventName(String actionEventName) {
				this.actionEventName = actionEventName;
			}

			public String getActionApiVersion() {
				return this.actionApiVersion;
			}

			public void setActionApiVersion(String actionApiVersion) {
				this.actionApiVersion = actionApiVersion;
			}

			public String getActionEventTime() {
				return this.actionEventTime;
			}

			public void setActionEventTime(String actionEventTime) {
				this.actionEventTime = actionEventTime;
			}

			public String getActionEventId() {
				return this.actionEventId;
			}

			public void setActionEventId(String actionEventId) {
				this.actionEventId = actionEventId;
			}

			public String getActionErrorMessage() {
				return this.actionErrorMessage;
			}

			public void setActionErrorMessage(String actionErrorMessage) {
				this.actionErrorMessage = actionErrorMessage;
			}

			public List<ActionRelatedResource> getActionRelatedResources() {
				return this.actionRelatedResources;
			}

			public void setActionRelatedResources(List<ActionRelatedResource> actionRelatedResources) {
				this.actionRelatedResources = actionRelatedResources;
			}

			public static class ActionRelatedResource {

				private String actionResourceType;

				private List<String> actionResourceIds;

				public String getActionResourceType() {
					return this.actionResourceType;
				}

				public void setActionResourceType(String actionResourceType) {
					this.actionResourceType = actionResourceType;
				}

				public List<String> getActionResourceIds() {
					return this.actionResourceIds;
				}

				public void setActionResourceIds(List<String> actionResourceIds) {
					this.actionResourceIds = actionResourceIds;
				}
			}
		}
	}

	@Override
	public OpsDescribeResourceActionTrailInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeResourceActionTrailInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
