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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.ValidateTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ValidateTemplateResponse extends AcsResponse {

	private String description;

	private String requestId;

	private List<Output> outputs;

	private List<Resource> resources;

	private List<Map<Object,Object>> parameters;

	private ResourceTypes resourceTypes;

	private UpdateInfo updateInfo;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Output> getOutputs() {
		return this.outputs;
	}

	public void setOutputs(List<Output> outputs) {
		this.outputs = outputs;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public List<Map<Object,Object>> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Map<Object,Object>> parameters) {
		this.parameters = parameters;
	}

	public ResourceTypes getResourceTypes() {
		return this.resourceTypes;
	}

	public void setResourceTypes(ResourceTypes resourceTypes) {
		this.resourceTypes = resourceTypes;
	}

	public UpdateInfo getUpdateInfo() {
		return this.updateInfo;
	}

	public void setUpdateInfo(UpdateInfo updateInfo) {
		this.updateInfo = updateInfo;
	}

	public static class Output {

		private String outputKey;

		private String description;

		private String label;

		public String getOutputKey() {
			return this.outputKey;
		}

		public void setOutputKey(String outputKey) {
			this.outputKey = outputKey;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
	}

	public static class Resource {

		private String resourceType;

		private String resourcePath;

		private String logicalResourceIdPattern;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getResourcePath() {
			return this.resourcePath;
		}

		public void setResourcePath(String resourcePath) {
			this.resourcePath = resourcePath;
		}

		public String getLogicalResourceIdPattern() {
			return this.logicalResourceIdPattern;
		}

		public void setLogicalResourceIdPattern(String logicalResourceIdPattern) {
			this.logicalResourceIdPattern = logicalResourceIdPattern;
		}
	}

	public static class ResourceTypes {

		private List<String> resources1;

		private List<String> dataSources;

		public List<String> getResources1() {
			return this.resources1;
		}

		public void setResources1(List<String> resources1) {
			this.resources1 = resources1;
		}

		public List<String> getDataSources() {
			return this.dataSources;
		}

		public void setDataSources(List<String> dataSources) {
			this.dataSources = dataSources;
		}
	}

	public static class UpdateInfo {

		private List<String> parametersAllowedToBeModified;

		private List<String> parametersCauseInterruptionIfModified;

		private List<String> parametersConditionallyAllowedToBeModified;

		private List<String> parametersConditionallyCauseInterruptionIfModified;

		private List<String> parametersNotAllowedToBeModified;

		private List<String> parametersUncertainlyAllowedToBeModified;

		private List<String> parametersUncertainlyCauseInterruptionIfModified;

		private List<String> parametersCauseReplacementIfModified;

		private List<String> parametersConditionallyCauseReplacementIfModified;

		private List<String> parametersUncertainlyCauseReplacementIfModified;

		public List<String> getParametersAllowedToBeModified() {
			return this.parametersAllowedToBeModified;
		}

		public void setParametersAllowedToBeModified(List<String> parametersAllowedToBeModified) {
			this.parametersAllowedToBeModified = parametersAllowedToBeModified;
		}

		public List<String> getParametersCauseInterruptionIfModified() {
			return this.parametersCauseInterruptionIfModified;
		}

		public void setParametersCauseInterruptionIfModified(List<String> parametersCauseInterruptionIfModified) {
			this.parametersCauseInterruptionIfModified = parametersCauseInterruptionIfModified;
		}

		public List<String> getParametersConditionallyAllowedToBeModified() {
			return this.parametersConditionallyAllowedToBeModified;
		}

		public void setParametersConditionallyAllowedToBeModified(List<String> parametersConditionallyAllowedToBeModified) {
			this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
		}

		public List<String> getParametersConditionallyCauseInterruptionIfModified() {
			return this.parametersConditionallyCauseInterruptionIfModified;
		}

		public void setParametersConditionallyCauseInterruptionIfModified(List<String> parametersConditionallyCauseInterruptionIfModified) {
			this.parametersConditionallyCauseInterruptionIfModified = parametersConditionallyCauseInterruptionIfModified;
		}

		public List<String> getParametersNotAllowedToBeModified() {
			return this.parametersNotAllowedToBeModified;
		}

		public void setParametersNotAllowedToBeModified(List<String> parametersNotAllowedToBeModified) {
			this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
		}

		public List<String> getParametersUncertainlyAllowedToBeModified() {
			return this.parametersUncertainlyAllowedToBeModified;
		}

		public void setParametersUncertainlyAllowedToBeModified(List<String> parametersUncertainlyAllowedToBeModified) {
			this.parametersUncertainlyAllowedToBeModified = parametersUncertainlyAllowedToBeModified;
		}

		public List<String> getParametersUncertainlyCauseInterruptionIfModified() {
			return this.parametersUncertainlyCauseInterruptionIfModified;
		}

		public void setParametersUncertainlyCauseInterruptionIfModified(List<String> parametersUncertainlyCauseInterruptionIfModified) {
			this.parametersUncertainlyCauseInterruptionIfModified = parametersUncertainlyCauseInterruptionIfModified;
		}

		public List<String> getParametersCauseReplacementIfModified() {
			return this.parametersCauseReplacementIfModified;
		}

		public void setParametersCauseReplacementIfModified(List<String> parametersCauseReplacementIfModified) {
			this.parametersCauseReplacementIfModified = parametersCauseReplacementIfModified;
		}

		public List<String> getParametersConditionallyCauseReplacementIfModified() {
			return this.parametersConditionallyCauseReplacementIfModified;
		}

		public void setParametersConditionallyCauseReplacementIfModified(List<String> parametersConditionallyCauseReplacementIfModified) {
			this.parametersConditionallyCauseReplacementIfModified = parametersConditionallyCauseReplacementIfModified;
		}

		public List<String> getParametersUncertainlyCauseReplacementIfModified() {
			return this.parametersUncertainlyCauseReplacementIfModified;
		}

		public void setParametersUncertainlyCauseReplacementIfModified(List<String> parametersUncertainlyCauseReplacementIfModified) {
			this.parametersUncertainlyCauseReplacementIfModified = parametersUncertainlyCauseReplacementIfModified;
		}
	}

	@Override
	public ValidateTemplateResponse getInstance(UnmarshallerContext context) {
		return	ValidateTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
