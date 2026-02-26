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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDefenseCountStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDefenseCountStatisticsResponse extends AcsResponse {

	private String requestId;

	private DefenseCountStatistics defenseCountStatistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DefenseCountStatistics getDefenseCountStatistics() {
		return this.defenseCountStatistics;
	}

	public void setDefenseCountStatistics(DefenseCountStatistics defenseCountStatistics) {
		this.defenseCountStatistics = defenseCountStatistics;
	}

	public static class DefenseCountStatistics {

		private Integer flowPackCountRemain;

		private Integer maxUsableDefenseCountCurrentMonth;

		private Integer defenseCountTotalUsageOfCurrentMonth;

		private Integer secHighSpeedCountRemain;

		private List<HkResourcePackageDetail> hkPackageDetail;

		private List<UnlimitedResourcePackageDetail> unlimitedPackageDetail;

		public Integer getFlowPackCountRemain() {
			return this.flowPackCountRemain;
		}

		public void setFlowPackCountRemain(Integer flowPackCountRemain) {
			this.flowPackCountRemain = flowPackCountRemain;
		}

		public Integer getMaxUsableDefenseCountCurrentMonth() {
			return this.maxUsableDefenseCountCurrentMonth;
		}

		public void setMaxUsableDefenseCountCurrentMonth(Integer maxUsableDefenseCountCurrentMonth) {
			this.maxUsableDefenseCountCurrentMonth = maxUsableDefenseCountCurrentMonth;
		}

		public Integer getDefenseCountTotalUsageOfCurrentMonth() {
			return this.defenseCountTotalUsageOfCurrentMonth;
		}

		public void setDefenseCountTotalUsageOfCurrentMonth(Integer defenseCountTotalUsageOfCurrentMonth) {
			this.defenseCountTotalUsageOfCurrentMonth = defenseCountTotalUsageOfCurrentMonth;
		}

		public Integer getSecHighSpeedCountRemain() {
			return this.secHighSpeedCountRemain;
		}

		public void setSecHighSpeedCountRemain(Integer secHighSpeedCountRemain) {
			this.secHighSpeedCountRemain = secHighSpeedCountRemain;
		}

		public List<HkResourcePackageDetail> getHkPackageDetail() {
			return this.hkPackageDetail;
		}

		public void setHkPackageDetail(List<HkResourcePackageDetail> hkPackageDetail) {
			this.hkPackageDetail = hkPackageDetail;
		}

		public List<UnlimitedResourcePackageDetail> getUnlimitedPackageDetail() {
			return this.unlimitedPackageDetail;
		}

		public void setUnlimitedPackageDetail(List<UnlimitedResourcePackageDetail> unlimitedPackageDetail) {
			this.unlimitedPackageDetail = unlimitedPackageDetail;
		}

		public static class HkResourcePackageDetail {

			private Long endTime;

			private Long startTime;

			private Long buyNum;

			private Long usedNum;

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Long getBuyNum() {
				return this.buyNum;
			}

			public void setBuyNum(Long buyNum) {
				this.buyNum = buyNum;
			}

			public Long getUsedNum() {
				return this.usedNum;
			}

			public void setUsedNum(Long usedNum) {
				this.usedNum = usedNum;
			}
		}

		public static class UnlimitedResourcePackageDetail {

			private Long endTime;

			private Long startTime;

			private Long buyNum;

			private Long usedNum;

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Long getBuyNum() {
				return this.buyNum;
			}

			public void setBuyNum(Long buyNum) {
				this.buyNum = buyNum;
			}

			public Long getUsedNum() {
				return this.usedNum;
			}

			public void setUsedNum(Long usedNum) {
				this.usedNum = usedNum;
			}
		}
	}

	@Override
	public DescribeDefenseCountStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDefenseCountStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
