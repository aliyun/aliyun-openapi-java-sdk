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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeExposedCheckWarningResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExposedCheckWarningResponse extends AcsResponse {

	private Integer count;

	private String requestId;

	private List<CheckWarning> warningList;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CheckWarning> getWarningList() {
		return this.warningList;
	}

	public void setWarningList(List<CheckWarning> warningList) {
		this.warningList = warningList;
	}

	public static class CheckWarning {

		private String subTypeAlias;

		private String uuid;

		private String typeAlias;

		private String riskName;

		private Long riskId;

		public String getSubTypeAlias() {
			return this.subTypeAlias;
		}

		public void setSubTypeAlias(String subTypeAlias) {
			this.subTypeAlias = subTypeAlias;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getTypeAlias() {
			return this.typeAlias;
		}

		public void setTypeAlias(String typeAlias) {
			this.typeAlias = typeAlias;
		}

		public String getRiskName() {
			return this.riskName;
		}

		public void setRiskName(String riskName) {
			this.riskName = riskName;
		}

		public Long getRiskId() {
			return this.riskId;
		}

		public void setRiskId(Long riskId) {
			this.riskId = riskId;
		}
	}

	@Override
	public DescribeExposedCheckWarningResponse getInstance(UnmarshallerContext context) {
		return	DescribeExposedCheckWarningResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
