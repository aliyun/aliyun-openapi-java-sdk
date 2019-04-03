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
import com.aliyuncs.sas.transform.v20181203.DescribeRiskCheckSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRiskCheckSummaryResponse extends AcsResponse {

	private String requestId;

	private RiskCheckSummary riskCheckSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RiskCheckSummary getRiskCheckSummary() {
		return this.riskCheckSummary;
	}

	public void setRiskCheckSummary(RiskCheckSummary riskCheckSummary) {
		this.riskCheckSummary = riskCheckSummary;
	}

	public static class RiskCheckSummary {

		private Integer riskCount;

		private Integer previousCount;

		private Integer itemCount;

		private Float riskRate;

		private Integer affectedAssetCount;

		private Long previousTime;

		private List<LevelCount> riskLevelCount;

		private List<Group> groups;

		public Integer getRiskCount() {
			return this.riskCount;
		}

		public void setRiskCount(Integer riskCount) {
			this.riskCount = riskCount;
		}

		public Integer getPreviousCount() {
			return this.previousCount;
		}

		public void setPreviousCount(Integer previousCount) {
			this.previousCount = previousCount;
		}

		public Integer getItemCount() {
			return this.itemCount;
		}

		public void setItemCount(Integer itemCount) {
			this.itemCount = itemCount;
		}

		public Float getRiskRate() {
			return this.riskRate;
		}

		public void setRiskRate(Float riskRate) {
			this.riskRate = riskRate;
		}

		public Integer getAffectedAssetCount() {
			return this.affectedAssetCount;
		}

		public void setAffectedAssetCount(Integer affectedAssetCount) {
			this.affectedAssetCount = affectedAssetCount;
		}

		public Long getPreviousTime() {
			return this.previousTime;
		}

		public void setPreviousTime(Long previousTime) {
			this.previousTime = previousTime;
		}

		public List<LevelCount> getRiskLevelCount() {
			return this.riskLevelCount;
		}

		public void setRiskLevelCount(List<LevelCount> riskLevelCount) {
			this.riskLevelCount = riskLevelCount;
		}

		public List<Group> getGroups() {
			return this.groups;
		}

		public void setGroups(List<Group> groups) {
			this.groups = groups;
		}

		public static class LevelCount {

			private String key;

			private Integer count;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}

		public static class Group {

			private Long id;

			private String title;

			private String status;

			private Integer remainingTime;

			private Integer sort;

			private List<StatusCount> countByStatus;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getRemainingTime() {
				return this.remainingTime;
			}

			public void setRemainingTime(Integer remainingTime) {
				this.remainingTime = remainingTime;
			}

			public Integer getSort() {
				return this.sort;
			}

			public void setSort(Integer sort) {
				this.sort = sort;
			}

			public List<StatusCount> getCountByStatus() {
				return this.countByStatus;
			}

			public void setCountByStatus(List<StatusCount> countByStatus) {
				this.countByStatus = countByStatus;
			}

			public static class StatusCount {

				private String status;

				private Integer count;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}
		}
	}

	@Override
	public DescribeRiskCheckSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeRiskCheckSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
