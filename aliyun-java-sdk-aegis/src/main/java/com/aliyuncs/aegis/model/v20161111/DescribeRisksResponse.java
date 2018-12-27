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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeRisksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRisksResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<Risk> risks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Risk> getRisks() {
		return this.risks;
	}

	public void setRisks(List<Risk> risks) {
		this.risks = risks;
	}

	public static class Risk {

		private Long riskId;

		private String riskName;

		private String riskDetail;

		private String riskType;

		private String typeAlias;

		private String subRiskType;

		private String subTypeAlias;

		public Long getRiskId() {
			return this.riskId;
		}

		public void setRiskId(Long riskId) {
			this.riskId = riskId;
		}

		public String getRiskName() {
			return this.riskName;
		}

		public void setRiskName(String riskName) {
			this.riskName = riskName;
		}

		public String getRiskDetail() {
			return this.riskDetail;
		}

		public void setRiskDetail(String riskDetail) {
			this.riskDetail = riskDetail;
		}

		public String getRiskType() {
			return this.riskType;
		}

		public void setRiskType(String riskType) {
			this.riskType = riskType;
		}

		public String getTypeAlias() {
			return this.typeAlias;
		}

		public void setTypeAlias(String typeAlias) {
			this.typeAlias = typeAlias;
		}

		public String getSubRiskType() {
			return this.subRiskType;
		}

		public void setSubRiskType(String subRiskType) {
			this.subRiskType = subRiskType;
		}

		public String getSubTypeAlias() {
			return this.subTypeAlias;
		}

		public void setSubTypeAlias(String subTypeAlias) {
			this.subTypeAlias = subTypeAlias;
		}
	}

	@Override
	public DescribeRisksResponse getInstance(UnmarshallerContext context) {
		return	DescribeRisksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
