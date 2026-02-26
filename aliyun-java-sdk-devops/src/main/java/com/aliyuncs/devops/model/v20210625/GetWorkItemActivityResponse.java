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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.GetWorkItemActivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkItemActivityResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private List<Activity> activities;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Activity> getActivities() {
		return this.activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public static class Activity {

		private String eventType;

		private String actionType;

		private Long eventTime;

		private String resourceIdentifier;

		private String operator;

		private Long eventId;

		private Long parentEventId;

		private List<OldValueItem> oldValue;

		private List<NewValueItem> newValue;

		private Property property;

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public Long getEventTime() {
			return this.eventTime;
		}

		public void setEventTime(Long eventTime) {
			this.eventTime = eventTime;
		}

		public String getResourceIdentifier() {
			return this.resourceIdentifier;
		}

		public void setResourceIdentifier(String resourceIdentifier) {
			this.resourceIdentifier = resourceIdentifier;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public Long getEventId() {
			return this.eventId;
		}

		public void setEventId(Long eventId) {
			this.eventId = eventId;
		}

		public Long getParentEventId() {
			return this.parentEventId;
		}

		public void setParentEventId(Long parentEventId) {
			this.parentEventId = parentEventId;
		}

		public List<OldValueItem> getOldValue() {
			return this.oldValue;
		}

		public void setOldValue(List<OldValueItem> oldValue) {
			this.oldValue = oldValue;
		}

		public List<NewValueItem> getNewValue() {
			return this.newValue;
		}

		public void setNewValue(List<NewValueItem> newValue) {
			this.newValue = newValue;
		}

		public Property getProperty() {
			return this.property;
		}

		public void setProperty(Property property) {
			this.property = property;
		}

		public static class OldValueItem {

			private String resourceType;

			private String plainValue;

			private String displayValue;

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getPlainValue() {
				return this.plainValue;
			}

			public void setPlainValue(String plainValue) {
				this.plainValue = plainValue;
			}

			public String getDisplayValue() {
				return this.displayValue;
			}

			public void setDisplayValue(String displayValue) {
				this.displayValue = displayValue;
			}
		}

		public static class NewValueItem {

			private String resourceType;

			private String plainValue;

			private String displayValue;

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getPlainValue() {
				return this.plainValue;
			}

			public void setPlainValue(String plainValue) {
				this.plainValue = plainValue;
			}

			public String getDisplayValue() {
				return this.displayValue;
			}

			public void setDisplayValue(String displayValue) {
				this.displayValue = displayValue;
			}
		}

		public static class Property {

			private String propertyName;

			private String propertyType;

			private String propertyIdentifier;

			private String displayName;

			public String getPropertyName() {
				return this.propertyName;
			}

			public void setPropertyName(String propertyName) {
				this.propertyName = propertyName;
			}

			public String getPropertyType() {
				return this.propertyType;
			}

			public void setPropertyType(String propertyType) {
				this.propertyType = propertyType;
			}

			public String getPropertyIdentifier() {
				return this.propertyIdentifier;
			}

			public void setPropertyIdentifier(String propertyIdentifier) {
				this.propertyIdentifier = propertyIdentifier;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
		}
	}

	@Override
	public GetWorkItemActivityResponse getInstance(UnmarshallerContext context) {
		return	GetWorkItemActivityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
