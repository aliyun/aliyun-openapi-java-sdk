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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetResourceComplianceByPackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResourceComplianceByPackResponse extends AcsResponse {

	private String requestId;

	private ResourceComplianceResult resourceComplianceResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourceComplianceResult getResourceComplianceResult() {
		return this.resourceComplianceResult;
	}

	public void setResourceComplianceResult(ResourceComplianceResult resourceComplianceResult) {
		this.resourceComplianceResult = resourceComplianceResult;
	}

	public static class ResourceComplianceResult {

		private String compliancePackId;

		private Integer nonCompliantCount;

		private Integer totalCount;

		public String getCompliancePackId() {
			return this.compliancePackId;
		}

		public void setCompliancePackId(String compliancePackId) {
			this.compliancePackId = compliancePackId;
		}

		public Integer getNonCompliantCount() {
			return this.nonCompliantCount;
		}

		public void setNonCompliantCount(Integer nonCompliantCount) {
			this.nonCompliantCount = nonCompliantCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}
	}

	@Override
	public GetResourceComplianceByPackResponse getInstance(UnmarshallerContext context) {
		return	GetResourceComplianceByPackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
