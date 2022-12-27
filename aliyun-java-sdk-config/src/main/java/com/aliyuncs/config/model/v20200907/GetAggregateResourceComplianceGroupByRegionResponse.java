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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetAggregateResourceComplianceGroupByRegionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAggregateResourceComplianceGroupByRegionResponse extends AcsResponse {

	private String requestId;

	private ComplianceResult complianceResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ComplianceResult getComplianceResult() {
		return this.complianceResult;
	}

	public void setComplianceResult(ComplianceResult complianceResult) {
		this.complianceResult = complianceResult;
	}

	public static class ComplianceResult {

		private List<ComplianceResultListItem> complianceResultList;

		public List<ComplianceResultListItem> getComplianceResultList() {
			return this.complianceResultList;
		}

		public void setComplianceResultList(List<ComplianceResultListItem> complianceResultList) {
			this.complianceResultList = complianceResultList;
		}

		public static class ComplianceResultListItem {

			private String regionId;

			private List<CompliancesItem> compliances;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public List<CompliancesItem> getCompliances() {
				return this.compliances;
			}

			public void setCompliances(List<CompliancesItem> compliances) {
				this.compliances = compliances;
			}

			public static class CompliancesItem {

				private String complianceType;

				private Long count;

				public String getComplianceType() {
					return this.complianceType;
				}

				public void setComplianceType(String complianceType) {
					this.complianceType = complianceType;
				}

				public Long getCount() {
					return this.count;
				}

				public void setCount(Long count) {
					this.count = count;
				}
			}
		}
	}

	@Override
	public GetAggregateResourceComplianceGroupByRegionResponse getInstance(UnmarshallerContext context) {
		return	GetAggregateResourceComplianceGroupByRegionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
