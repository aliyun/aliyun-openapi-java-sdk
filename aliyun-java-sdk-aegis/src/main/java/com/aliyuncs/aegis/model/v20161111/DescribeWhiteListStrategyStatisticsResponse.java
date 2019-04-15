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
import com.aliyuncs.aegis.transform.v20161111.DescribeWhiteListStrategyStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWhiteListStrategyStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Integer pageSize;

	private Integer totalCount;

	private Integer currentPage;

	private List<Strategy> strategies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<Strategy> getStrategies() {
		return this.strategies;
	}

	public void setStrategies(List<Strategy> strategies) {
		this.strategies = strategies;
	}

	public static class Strategy {

		private Long strategyId;

		private String strategyName;

		private Integer studyTime;

		private Integer assetCount;

		private Integer status;

		private Integer trustProcCount;

		private Integer suspiciousProcCount;

		private Integer virusProcCount;

		private Integer progress;

		public Long getStrategyId() {
			return this.strategyId;
		}

		public void setStrategyId(Long strategyId) {
			this.strategyId = strategyId;
		}

		public String getStrategyName() {
			return this.strategyName;
		}

		public void setStrategyName(String strategyName) {
			this.strategyName = strategyName;
		}

		public Integer getStudyTime() {
			return this.studyTime;
		}

		public void setStudyTime(Integer studyTime) {
			this.studyTime = studyTime;
		}

		public Integer getAssetCount() {
			return this.assetCount;
		}

		public void setAssetCount(Integer assetCount) {
			this.assetCount = assetCount;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getTrustProcCount() {
			return this.trustProcCount;
		}

		public void setTrustProcCount(Integer trustProcCount) {
			this.trustProcCount = trustProcCount;
		}

		public Integer getSuspiciousProcCount() {
			return this.suspiciousProcCount;
		}

		public void setSuspiciousProcCount(Integer suspiciousProcCount) {
			this.suspiciousProcCount = suspiciousProcCount;
		}

		public Integer getVirusProcCount() {
			return this.virusProcCount;
		}

		public void setVirusProcCount(Integer virusProcCount) {
			this.virusProcCount = virusProcCount;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}
	}

	@Override
	public DescribeWhiteListStrategyStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeWhiteListStrategyStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
