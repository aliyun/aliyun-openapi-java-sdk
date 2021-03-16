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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeBusinessModulePropertiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeBusinessModulePropertiesResponse extends AcsResponse {

	private String requestId;

	private List<BusinessModulePropertySet> businessModulePropertySets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BusinessModulePropertySet> getBusinessModulePropertySets() {
		return this.businessModulePropertySets;
	}

	public void setBusinessModulePropertySets(List<BusinessModulePropertySet> businessModulePropertySets) {
		this.businessModulePropertySets = businessModulePropertySets;
	}

	public static class BusinessModulePropertySet {

		private Long id;

		private Long businessId;

		private String moduleCode;

		private String propertyCode;

		private Long moduleId;

		private String propertyValue;

		private String propertyDisplayValue;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getBusinessId() {
			return this.businessId;
		}

		public void setBusinessId(Long businessId) {
			this.businessId = businessId;
		}

		public String getModuleCode() {
			return this.moduleCode;
		}

		public void setModuleCode(String moduleCode) {
			this.moduleCode = moduleCode;
		}

		public String getPropertyCode() {
			return this.propertyCode;
		}

		public void setPropertyCode(String propertyCode) {
			this.propertyCode = propertyCode;
		}

		public Long getModuleId() {
			return this.moduleId;
		}

		public void setModuleId(Long moduleId) {
			this.moduleId = moduleId;
		}

		public String getPropertyValue() {
			return this.propertyValue;
		}

		public void setPropertyValue(String propertyValue) {
			this.propertyValue = propertyValue;
		}

		public String getPropertyDisplayValue() {
			return this.propertyDisplayValue;
		}

		public void setPropertyDisplayValue(String propertyDisplayValue) {
			this.propertyDisplayValue = propertyDisplayValue;
		}
	}

	@Override
	public OpsDescribeBusinessModulePropertiesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeBusinessModulePropertiesResponseUnmarshaller.unmarshall(this, context);
	}
}
