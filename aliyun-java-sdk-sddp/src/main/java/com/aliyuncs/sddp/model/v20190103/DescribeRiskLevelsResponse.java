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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeRiskLevelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRiskLevelsResponse extends AcsResponse {

	private String requestId;

	private List<RiskLevel> riskLevelList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RiskLevel> getRiskLevelList() {
		return this.riskLevelList;
	}

	public void setRiskLevelList(List<RiskLevel> riskLevelList) {
		this.riskLevelList = riskLevelList;
	}

	public static class RiskLevel {

		private Long id;

		private String description;

		private String name;

		private String alias;

		private Integer referenceNum;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public Integer getReferenceNum() {
			return this.referenceNum;
		}

		public void setReferenceNum(Integer referenceNum) {
			this.referenceNum = referenceNum;
		}
	}

	@Override
	public DescribeRiskLevelsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRiskLevelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
