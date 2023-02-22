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
import com.aliyuncs.sas.transform.v20181203.GetCheckSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCheckSummaryResponse extends AcsResponse {

	private String taskId;

	private String requestId;

	private List<SummarysItem> summarys;

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SummarysItem> getSummarys() {
		return this.summarys;
	}

	public void setSummarys(List<SummarysItem> summarys) {
		this.summarys = summarys;
	}

	public static class SummarysItem {

		private String type;

		private Long passCount;

		private Integer failCount;

		private List<StandardsItem> standards;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getPassCount() {
			return this.passCount;
		}

		public void setPassCount(Long passCount) {
			this.passCount = passCount;
		}

		public Integer getFailCount() {
			return this.failCount;
		}

		public void setFailCount(Integer failCount) {
			this.failCount = failCount;
		}

		public List<StandardsItem> getStandards() {
			return this.standards;
		}

		public void setStandards(List<StandardsItem> standards) {
			this.standards = standards;
		}

		public static class StandardsItem {

			private Long id;

			private String showName;

			private Integer passCount;

			private Integer failCount;

			private Integer riskLevelHighCount;

			private Integer riskLevelMediumCount;

			private Integer riskLevelLowCount;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getShowName() {
				return this.showName;
			}

			public void setShowName(String showName) {
				this.showName = showName;
			}

			public Integer getPassCount() {
				return this.passCount;
			}

			public void setPassCount(Integer passCount) {
				this.passCount = passCount;
			}

			public Integer getFailCount() {
				return this.failCount;
			}

			public void setFailCount(Integer failCount) {
				this.failCount = failCount;
			}

			public Integer getRiskLevelHighCount() {
				return this.riskLevelHighCount;
			}

			public void setRiskLevelHighCount(Integer riskLevelHighCount) {
				this.riskLevelHighCount = riskLevelHighCount;
			}

			public Integer getRiskLevelMediumCount() {
				return this.riskLevelMediumCount;
			}

			public void setRiskLevelMediumCount(Integer riskLevelMediumCount) {
				this.riskLevelMediumCount = riskLevelMediumCount;
			}

			public Integer getRiskLevelLowCount() {
				return this.riskLevelLowCount;
			}

			public void setRiskLevelLowCount(Integer riskLevelLowCount) {
				this.riskLevelLowCount = riskLevelLowCount;
			}
		}
	}

	@Override
	public GetCheckSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetCheckSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
