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
import com.aliyuncs.config.transform.v20200907.GetComplianceSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetComplianceSummaryResponse extends AcsResponse {

	private String requestId;

	private ComplianceSummary complianceSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ComplianceSummary getComplianceSummary() {
		return this.complianceSummary;
	}

	public void setComplianceSummary(ComplianceSummary complianceSummary) {
		this.complianceSummary = complianceSummary;
	}

	public static class ComplianceSummary {

		private ComplianceSummaryByResource complianceSummaryByResource;

		private ComplianceSummaryByConfigRule complianceSummaryByConfigRule;

		public ComplianceSummaryByResource getComplianceSummaryByResource() {
			return this.complianceSummaryByResource;
		}

		public void setComplianceSummaryByResource(ComplianceSummaryByResource complianceSummaryByResource) {
			this.complianceSummaryByResource = complianceSummaryByResource;
		}

		public ComplianceSummaryByConfigRule getComplianceSummaryByConfigRule() {
			return this.complianceSummaryByConfigRule;
		}

		public void setComplianceSummaryByConfigRule(ComplianceSummaryByConfigRule complianceSummaryByConfigRule) {
			this.complianceSummaryByConfigRule = complianceSummaryByConfigRule;
		}

		public static class ComplianceSummaryByResource {

			private Integer compliantCount;

			private Integer nonCompliantCount;

			private Long complianceSummaryTimestamp;

			private Long totalCount;

			public Integer getCompliantCount() {
				return this.compliantCount;
			}

			public void setCompliantCount(Integer compliantCount) {
				this.compliantCount = compliantCount;
			}

			public Integer getNonCompliantCount() {
				return this.nonCompliantCount;
			}

			public void setNonCompliantCount(Integer nonCompliantCount) {
				this.nonCompliantCount = nonCompliantCount;
			}

			public Long getComplianceSummaryTimestamp() {
				return this.complianceSummaryTimestamp;
			}

			public void setComplianceSummaryTimestamp(Long complianceSummaryTimestamp) {
				this.complianceSummaryTimestamp = complianceSummaryTimestamp;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}

		public static class ComplianceSummaryByConfigRule {

			private Integer compliantCount;

			private Integer nonCompliantCount;

			private Long complianceSummaryTimestamp;

			private Long totalCount;

			public Integer getCompliantCount() {
				return this.compliantCount;
			}

			public void setCompliantCount(Integer compliantCount) {
				this.compliantCount = compliantCount;
			}

			public Integer getNonCompliantCount() {
				return this.nonCompliantCount;
			}

			public void setNonCompliantCount(Integer nonCompliantCount) {
				this.nonCompliantCount = nonCompliantCount;
			}

			public Long getComplianceSummaryTimestamp() {
				return this.complianceSummaryTimestamp;
			}

			public void setComplianceSummaryTimestamp(Long complianceSummaryTimestamp) {
				this.complianceSummaryTimestamp = complianceSummaryTimestamp;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public GetComplianceSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetComplianceSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
