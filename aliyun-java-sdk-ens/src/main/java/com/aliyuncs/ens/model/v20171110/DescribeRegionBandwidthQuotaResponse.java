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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeRegionBandwidthQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRegionBandwidthQuotaResponse extends AcsResponse {

	private String requestId;

	private List<带宽配额> bandwidthQuota;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<带宽配额> getBandwidthQuota() {
		return this.bandwidthQuota;
	}

	public void setBandwidthQuota(List<带宽配额> bandwidthQuota) {
		this.bandwidthQuota = bandwidthQuota;
	}

	public static class 带宽配额 {

		private String regionId;

		private String date;

		private List<实例信息> instanceInfo;

		private List<带宽信息> bandwidthInfo;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public List<实例信息> getInstanceInfo() {
			return this.instanceInfo;
		}

		public void setInstanceInfo(List<实例信息> instanceInfo) {
			this.instanceInfo = instanceInfo;
		}

		public List<带宽信息> getBandwidthInfo() {
			return this.bandwidthInfo;
		}

		public void setBandwidthInfo(List<带宽信息> bandwidthInfo) {
			this.bandwidthInfo = bandwidthInfo;
		}

		public static class 实例信息 {

			private String instanceSpec;

			private Long instanceNumber;

			public String getInstanceSpec() {
				return this.instanceSpec;
			}

			public void setInstanceSpec(String instanceSpec) {
				this.instanceSpec = instanceSpec;
			}

			public Long getInstanceNumber() {
				return this.instanceNumber;
			}

			public void setInstanceNumber(Long instanceNumber) {
				this.instanceNumber = instanceNumber;
			}
		}

		public static class 带宽信息 {

			private Long monthMax;

			private Long weekMax;

			private Long monthAverageQuota;

			private Long weekAverageQuota;

			private String isp;

			public Long getMonthMax() {
				return this.monthMax;
			}

			public void setMonthMax(Long monthMax) {
				this.monthMax = monthMax;
			}

			public Long getWeekMax() {
				return this.weekMax;
			}

			public void setWeekMax(Long weekMax) {
				this.weekMax = weekMax;
			}

			public Long getMonthAverageQuota() {
				return this.monthAverageQuota;
			}

			public void setMonthAverageQuota(Long monthAverageQuota) {
				this.monthAverageQuota = monthAverageQuota;
			}

			public Long getWeekAverageQuota() {
				return this.weekAverageQuota;
			}

			public void setWeekAverageQuota(Long weekAverageQuota) {
				this.weekAverageQuota = weekAverageQuota;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}
		}
	}

	@Override
	public DescribeRegionBandwidthQuotaResponse getInstance(UnmarshallerContext context) {
		return	DescribeRegionBandwidthQuotaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
