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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeRouteDistributionStrategiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRouteDistributionStrategiesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Strategy> strategies;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Strategy> getStrategies() {
		return this.strategies;
	}

	public void setStrategies(List<Strategy> strategies) {
		this.strategies = strategies;
	}

	public static class Strategy {

		private String status;

		private String instanceId;

		private String hcInstanceId;

		private String routeSource;

		private String sourceType;

		private Long createTime;

		private String routeDistribution;

		private Boolean isConflict;

		private String smartAGId;

		private String strategyPublishStatus;

		private String conflictInfo;

		private String destCidrBlock;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getHcInstanceId() {
			return this.hcInstanceId;
		}

		public void setHcInstanceId(String hcInstanceId) {
			this.hcInstanceId = hcInstanceId;
		}

		public String getRouteSource() {
			return this.routeSource;
		}

		public void setRouteSource(String routeSource) {
			this.routeSource = routeSource;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getRouteDistribution() {
			return this.routeDistribution;
		}

		public void setRouteDistribution(String routeDistribution) {
			this.routeDistribution = routeDistribution;
		}

		public Boolean getIsConflict() {
			return this.isConflict;
		}

		public void setIsConflict(Boolean isConflict) {
			this.isConflict = isConflict;
		}

		public String getSmartAGId() {
			return this.smartAGId;
		}

		public void setSmartAGId(String smartAGId) {
			this.smartAGId = smartAGId;
		}

		public String getStrategyPublishStatus() {
			return this.strategyPublishStatus;
		}

		public void setStrategyPublishStatus(String strategyPublishStatus) {
			this.strategyPublishStatus = strategyPublishStatus;
		}

		public String getConflictInfo() {
			return this.conflictInfo;
		}

		public void setConflictInfo(String conflictInfo) {
			this.conflictInfo = conflictInfo;
		}

		public String getDestCidrBlock() {
			return this.destCidrBlock;
		}

		public void setDestCidrBlock(String destCidrBlock) {
			this.destCidrBlock = destCidrBlock;
		}
	}

	@Override
	public DescribeRouteDistributionStrategiesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRouteDistributionStrategiesResponseUnmarshaller.unmarshall(this, context);
	}
}
