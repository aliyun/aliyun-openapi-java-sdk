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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeBusinessModulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeBusinessModulesResponse extends AcsResponse {

	private String requestId;

	private List<BusinessModuleSet> businessModuleSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BusinessModuleSet> getBusinessModuleSets() {
		return this.businessModuleSets;
	}

	public void setBusinessModuleSets(List<BusinessModuleSet> businessModuleSets) {
		this.businessModuleSets = businessModuleSets;
	}

	public static class BusinessModuleSet {

		private Long id;

		private Long businessId;

		private String moduleCode;

		private String moduleTag;

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

		public String getModuleTag() {
			return this.moduleTag;
		}

		public void setModuleTag(String moduleTag) {
			this.moduleTag = moduleTag;
		}
	}

	@Override
	public OpsDescribeBusinessModulesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeBusinessModulesResponseUnmarshaller.unmarshall(this, context);
	}
}
