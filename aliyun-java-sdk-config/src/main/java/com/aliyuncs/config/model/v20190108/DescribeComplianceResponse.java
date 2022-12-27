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

package com.aliyuncs.config.model.v20190108;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20190108.DescribeComplianceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeComplianceResponse extends AcsResponse {

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

		private Long totalCount;

		private List<CompliancesItem> compliances;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<CompliancesItem> getCompliances() {
			return this.compliances;
		}

		public void setCompliances(List<CompliancesItem> compliances) {
			this.compliances = compliances;
		}

		public static class CompliancesItem {

			private String complianceType;

			private Integer count;

			public String getComplianceType() {
				return this.complianceType;
			}

			public void setComplianceType(String complianceType) {
				this.complianceType = complianceType;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeComplianceResponse getInstance(UnmarshallerContext context) {
		return	DescribeComplianceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
