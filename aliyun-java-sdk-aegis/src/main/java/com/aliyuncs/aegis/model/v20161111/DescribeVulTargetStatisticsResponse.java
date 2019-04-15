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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeVulTargetStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulTargetStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<TargetStat> targetStats;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<TargetStat> getTargetStats() {
		return this.targetStats;
	}

	public void setTargetStats(List<TargetStat> targetStats) {
		this.targetStats = targetStats;
	}

	public static class TargetStat {

		private String vulType;

		private String uuidCount;

		private String totalCount;

		private List<Target> targets;

		public String getVulType() {
			return this.vulType;
		}

		public void setVulType(String vulType) {
			this.vulType = vulType;
		}

		public String getUuidCount() {
			return this.uuidCount;
		}

		public void setUuidCount(String uuidCount) {
			this.uuidCount = uuidCount;
		}

		public String getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public List<Target> getTargets() {
			return this.targets;
		}

		public void setTargets(List<Target> targets) {
			this.targets = targets;
		}

		public static class Target {

			private String target;

			private String targetType;

			private String flag;

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public String getFlag() {
				return this.flag;
			}

			public void setFlag(String flag) {
				this.flag = flag;
			}
		}
	}

	@Override
	public DescribeVulTargetStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulTargetStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
