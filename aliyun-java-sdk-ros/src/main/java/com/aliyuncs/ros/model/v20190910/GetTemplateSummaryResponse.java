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
import com.aliyuncs.ros.transform.v20190910.GetTemplateSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateSummaryResponse extends AcsResponse {

	private String requestId;

	private String description;

	private Map<Object,Object> metadata;

	private String version;

	private List<ResourceIdentifierSummary> resourceIdentifierSummaries;

	private List<Map<Object,Object>> parameters;

	private List<String> resourceTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<Object,Object> getMetadata() {
		return this.metadata;
	}

	public void setMetadata(Map<Object,Object> metadata) {
		this.metadata = metadata;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<ResourceIdentifierSummary> getResourceIdentifierSummaries() {
		return this.resourceIdentifierSummaries;
	}

	public void setResourceIdentifierSummaries(List<ResourceIdentifierSummary> resourceIdentifierSummaries) {
		this.resourceIdentifierSummaries = resourceIdentifierSummaries;
	}

	public List<Map<Object,Object>> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Map<Object,Object>> parameters) {
		this.parameters = parameters;
	}

	public List<String> getResourceTypes() {
		return this.resourceTypes;
	}

	public void setResourceTypes(List<String> resourceTypes) {
		this.resourceTypes = resourceTypes;
	}

	public static class ResourceIdentifierSummary {

		private String resourceType;

		private List<String> logicalResourceIds;

		private List<String> resourceIdentifiers;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public List<String> getLogicalResourceIds() {
			return this.logicalResourceIds;
		}

		public void setLogicalResourceIds(List<String> logicalResourceIds) {
			this.logicalResourceIds = logicalResourceIds;
		}

		public List<String> getResourceIdentifiers() {
			return this.resourceIdentifiers;
		}

		public void setResourceIdentifiers(List<String> resourceIdentifiers) {
			this.resourceIdentifiers = resourceIdentifiers;
		}
	}

	@Override
	public GetTemplateSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetTemplateSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
