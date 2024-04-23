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

package com.aliyuncs.computenest.model.v20210601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenest.transform.v20210601.GetServiceTemplateParameterConstraintsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceTemplateParameterConstraintsResponse extends AcsResponse {

	private String requestId;

	private List<ParameterConstraintsItem> parameterConstraints;

	private List<String> familyConstraints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ParameterConstraintsItem> getParameterConstraints() {
		return this.parameterConstraints;
	}

	public void setParameterConstraints(List<ParameterConstraintsItem> parameterConstraints) {
		this.parameterConstraints = parameterConstraints;
	}

	public List<String> getFamilyConstraints() {
		return this.familyConstraints;
	}

	public void setFamilyConstraints(List<String> familyConstraints) {
		this.familyConstraints = familyConstraints;
	}

	public static class ParameterConstraintsItem {

		private String type;

		private String parameterKey;

		private String behavior;

		private String behaviorReason;

		private List<OriginalConstraintsItem> originalConstraints;

		private List<QueryErrorsItem> queryErrors;

		private List<String> allowedValues;

		private List<String> associationParameterNames;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getParameterKey() {
			return this.parameterKey;
		}

		public void setParameterKey(String parameterKey) {
			this.parameterKey = parameterKey;
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

		public List<OriginalConstraintsItem> getOriginalConstraints() {
			return this.originalConstraints;
		}

		public void setOriginalConstraints(List<OriginalConstraintsItem> originalConstraints) {
			this.originalConstraints = originalConstraints;
		}

		public List<QueryErrorsItem> getQueryErrors() {
			return this.queryErrors;
		}

		public void setQueryErrors(List<QueryErrorsItem> queryErrors) {
			this.queryErrors = queryErrors;
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

		public static class OriginalConstraintsItem {

			private String propertyName;

			private String resourceName;

			private String resourceType;

			private List<String> allowedValues1;

			public String getPropertyName() {
				return this.propertyName;
			}

			public void setPropertyName(String propertyName) {
				this.propertyName = propertyName;
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

			public List<String> getAllowedValues1() {
				return this.allowedValues1;
			}

			public void setAllowedValues1(List<String> allowedValues1) {
				this.allowedValues1 = allowedValues1;
			}
		}

		public static class QueryErrorsItem {

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
	}

	@Override
	public GetServiceTemplateParameterConstraintsResponse getInstance(UnmarshallerContext context) {
		return	GetServiceTemplateParameterConstraintsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
