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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetTemplateParameterConstraintsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateParameterConstraintsResponse extends AcsResponse {

	private String requestId;

	private List<ParameterConstraint> parameterConstraints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ParameterConstraint> getParameterConstraints() {
		return this.parameterConstraints;
	}

	public void setParameterConstraints(List<ParameterConstraint> parameterConstraints) {
		this.parameterConstraints = parameterConstraints;
	}

	public static class ParameterConstraint {

		private String parameterKey;

		private String type;

		private String behavior;

		private String behaviorReason;

		private List<NotSupportResource> notSupportResources;

		private List<QueryError> queryErrors;

		private List<OriginalConstraint> originalConstraints;

		private List<QueryTimeoutDetail> queryTimeoutDetails;

		private List<String> allowedValues;

		private List<String> associationParameterNames;

		private List<String> illegalValueByParameterConstraints;

		private List<String> illegalValueByRules;

		public String getParameterKey() {
			return this.parameterKey;
		}

		public void setParameterKey(String parameterKey) {
			this.parameterKey = parameterKey;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getBehavior() {
			return this.behavior;
		}

		public void setBehavior(String behavior) {
			this.behavior = behavior;
		}

		public String getBehaviorReason() {
			return this.behaviorReason;
		}

		public void setBehaviorReason(String behaviorReason) {
			this.behaviorReason = behaviorReason;
		}

		public List<NotSupportResource> getNotSupportResources() {
			return this.notSupportResources;
		}

		public void setNotSupportResources(List<NotSupportResource> notSupportResources) {
			this.notSupportResources = notSupportResources;
		}

		public List<QueryError> getQueryErrors() {
			return this.queryErrors;
		}

		public void setQueryErrors(List<QueryError> queryErrors) {
			this.queryErrors = queryErrors;
		}

		public List<OriginalConstraint> getOriginalConstraints() {
			return this.originalConstraints;
		}

		public void setOriginalConstraints(List<OriginalConstraint> originalConstraints) {
			this.originalConstraints = originalConstraints;
		}

		public List<QueryTimeoutDetail> getQueryTimeoutDetails() {
			return this.queryTimeoutDetails;
		}

		public void setQueryTimeoutDetails(List<QueryTimeoutDetail> queryTimeoutDetails) {
			this.queryTimeoutDetails = queryTimeoutDetails;
		}

		public List<String> getAllowedValues() {
			return this.allowedValues;
		}

		public void setAllowedValues(List<String> allowedValues) {
			this.allowedValues = allowedValues;
		}

		public List<String> getAssociationParameterNames() {
			return this.associationParameterNames;
		}

		public void setAssociationParameterNames(List<String> associationParameterNames) {
			this.associationParameterNames = associationParameterNames;
		}

		public List<String> getIllegalValueByParameterConstraints() {
			return this.illegalValueByParameterConstraints;
		}

		public void setIllegalValueByParameterConstraints(List<String> illegalValueByParameterConstraints) {
			this.illegalValueByParameterConstraints = illegalValueByParameterConstraints;
		}

		public List<String> getIllegalValueByRules() {
			return this.illegalValueByRules;
		}

		public void setIllegalValueByRules(List<String> illegalValueByRules) {
			this.illegalValueByRules = illegalValueByRules;
		}

		public static class NotSupportResource {

			private String resourceType;

			private String propertyName;

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getPropertyName() {
				return this.propertyName;
			}

			public void setPropertyName(String propertyName) {
				this.propertyName = propertyName;
			}
		}

		public static class QueryError {

			private String errorMessage;

			private String resourceName;

			private String resourceType;

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}
		}

		public static class OriginalConstraint {

			private String resourceName;

			private String resourceType;

			private String propertyName;

			private List<String> allowedValues1;

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getPropertyName() {
				return this.propertyName;
			}

			public void setPropertyName(String propertyName) {
				this.propertyName = propertyName;
			}

			public List<String> getAllowedValues1() {
				return this.allowedValues1;
			}

			public void setAllowedValues1(List<String> allowedValues1) {
				this.allowedValues1 = allowedValues1;
			}
		}

		public static class QueryTimeoutDetail {

			private String resourceType;

			private String resourceName;

			private String errorMessage;

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}
		}
	}

	@Override
	public GetTemplateParameterConstraintsResponse getInstance(UnmarshallerContext context) {
		return	GetTemplateParameterConstraintsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
