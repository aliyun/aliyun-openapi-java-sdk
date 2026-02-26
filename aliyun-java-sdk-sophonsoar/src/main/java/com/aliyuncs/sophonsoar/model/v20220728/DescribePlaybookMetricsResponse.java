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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribePlaybookMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlaybookMetricsResponse extends AcsResponse {

	private String requestId;

	private Metrics metrics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Metrics getMetrics() {
		return this.metrics;
	}

	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}

	public static class Metrics {

		private String displayName;

		private String playbookUuid;

		private String ownType;

		private Integer active;

		private Long lastRuntime;

		private Integer permission;

		private Long gmtCreate;

		private Integer historyMd5;

		private Integer succNum;

		private Integer failNum;

		private Double failRate;

		private Integer playbookStatus;

		private String description;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getPlaybookUuid() {
			return this.playbookUuid;
		}

		public void setPlaybookUuid(String playbookUuid) {
			this.playbookUuid = playbookUuid;
		}

		public String getOwnType() {
			return this.ownType;
		}

		public void setOwnType(String ownType) {
			this.ownType = ownType;
		}

		public Integer getActive() {
			return this.active;
		}

		public void setActive(Integer active) {
			this.active = active;
		}

		public Long getLastRuntime() {
			return this.lastRuntime;
		}

		public void setLastRuntime(Long lastRuntime) {
			this.lastRuntime = lastRuntime;
		}

		public Integer getPermission() {
			return this.permission;
		}

		public void setPermission(Integer permission) {
			this.permission = permission;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getHistoryMd5() {
			return this.historyMd5;
		}

		public void setHistoryMd5(Integer historyMd5) {
			this.historyMd5 = historyMd5;
		}

		public Integer getSuccNum() {
			return this.succNum;
		}

		public void setSuccNum(Integer succNum) {
			this.succNum = succNum;
		}

		public Integer getFailNum() {
			return this.failNum;
		}

		public void setFailNum(Integer failNum) {
			this.failNum = failNum;
		}

		public Double getFailRate() {
			return this.failRate;
		}

		public void setFailRate(Double failRate) {
			this.failRate = failRate;
		}

		public Integer getPlaybookStatus() {
			return this.playbookStatus;
		}

		public void setPlaybookStatus(Integer playbookStatus) {
			this.playbookStatus = playbookStatus;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribePlaybookMetricsResponse getInstance(UnmarshallerContext context) {
		return	DescribePlaybookMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
