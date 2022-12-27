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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.ListPreManagedRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPreManagedRulesResponse extends AcsResponse {

	private String requestId;

	private Long pageNumber;

	private Long pageSize;

	private List<ManagedRule> managedRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<ManagedRule> getManagedRules() {
		return this.managedRules;
	}

	public void setManagedRules(List<ManagedRule> managedRules) {
		this.managedRules = managedRules;
	}

	public static class ManagedRule {

		private String resourceType;

		private String description;

		private Map<Object,Object> inputParameters;

		private Map<Object,Object> optionalInputParameterDetails;

		private String identifier;

		private String configRuleName;

		private String helpUrls;

		private Boolean defaultEnable;

		private String nonCompliantSample;

		private String compliantSample;

		private Map<Object,Object> compulsoryInputParameterDetails;

		private List<Map<Object,Object>> sourceConditions;

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Map<Object,Object> getInputParameters() {
			return this.inputParameters;
		}

		public void setInputParameters(Map<Object,Object> inputParameters) {
			this.inputParameters = inputParameters;
		}

		public Map<Object,Object> getOptionalInputParameterDetails() {
			return this.optionalInputParameterDetails;
		}

		public void setOptionalInputParameterDetails(Map<Object,Object> optionalInputParameterDetails) {
			this.optionalInputParameterDetails = optionalInputParameterDetails;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getConfigRuleName() {
			return this.configRuleName;
		}

		public void setConfigRuleName(String configRuleName) {
			this.configRuleName = configRuleName;
		}

		public String getHelpUrls() {
			return this.helpUrls;
		}

		public void setHelpUrls(String helpUrls) {
			this.helpUrls = helpUrls;
		}

		public Boolean getDefaultEnable() {
			return this.defaultEnable;
		}

		public void setDefaultEnable(Boolean defaultEnable) {
			this.defaultEnable = defaultEnable;
		}

		public String getNonCompliantSample() {
			return this.nonCompliantSample;
		}

		public void setNonCompliantSample(String nonCompliantSample) {
			this.nonCompliantSample = nonCompliantSample;
		}

		public String getCompliantSample() {
			return this.compliantSample;
		}

		public void setCompliantSample(String compliantSample) {
			this.compliantSample = compliantSample;
		}

		public Map<Object,Object> getCompulsoryInputParameterDetails() {
			return this.compulsoryInputParameterDetails;
		}

		public void setCompulsoryInputParameterDetails(Map<Object,Object> compulsoryInputParameterDetails) {
			this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
		}

		public List<Map<Object,Object>> getSourceConditions() {
			return this.sourceConditions;
		}

		public void setSourceConditions(List<Map<Object,Object>> sourceConditions) {
			this.sourceConditions = sourceConditions;
		}
	}

	@Override
	public ListPreManagedRulesResponse getInstance(UnmarshallerContext context) {
		return	ListPreManagedRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
