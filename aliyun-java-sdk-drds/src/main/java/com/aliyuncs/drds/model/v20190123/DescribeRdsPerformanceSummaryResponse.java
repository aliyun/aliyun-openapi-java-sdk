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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeRdsPerformanceSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRdsPerformanceSummaryResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<RdsPerformanceInfo> rdsPerformanceInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<RdsPerformanceInfo> getRdsPerformanceInfos() {
		return this.rdsPerformanceInfos;
	}

	public void setRdsPerformanceInfos(List<RdsPerformanceInfo> rdsPerformanceInfos) {
		this.rdsPerformanceInfos = rdsPerformanceInfos;
	}

	public static class RdsPerformanceInfo {

		private String rdsId;

		private Float cpu;

		private Float iops;

		private Integer activeSessions;

		private Integer totalSessions;

		private Long spaceUsage;

		public String getRdsId() {
			return this.rdsId;
		}

		public void setRdsId(String rdsId) {
			this.rdsId = rdsId;
		}

		public Float getCpu() {
			return this.cpu;
		}

		public void setCpu(Float cpu) {
			this.cpu = cpu;
		}

		public Float getIops() {
			return this.iops;
		}

		public void setIops(Float iops) {
			this.iops = iops;
		}

		public Integer getActiveSessions() {
			return this.activeSessions;
		}

		public void setActiveSessions(Integer activeSessions) {
			this.activeSessions = activeSessions;
		}

		public Integer getTotalSessions() {
			return this.totalSessions;
		}

		public void setTotalSessions(Integer totalSessions) {
			this.totalSessions = totalSessions;
		}

		public Long getSpaceUsage() {
			return this.spaceUsage;
		}

		public void setSpaceUsage(Long spaceUsage) {
			this.spaceUsage = spaceUsage;
		}
	}

	@Override
	public DescribeRdsPerformanceSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeRdsPerformanceSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
