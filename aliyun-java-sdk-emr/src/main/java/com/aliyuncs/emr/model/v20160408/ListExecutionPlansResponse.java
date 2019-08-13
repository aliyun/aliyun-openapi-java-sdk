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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListExecutionPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExecutionPlansResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ExecutionPlanInfo> executionPlans;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<ExecutionPlanInfo> getExecutionPlans() {
		return this.executionPlans;
	}

	public void setExecutionPlans(List<ExecutionPlanInfo> executionPlans) {
		this.executionPlans = executionPlans;
	}

	public static class ExecutionPlanInfo {

		private String id;

		private String name;

		private Boolean createClusterOnDemand;

		private String stragety;

		private String status;

		private Integer timeInterval;

		private Long startTime;

		private String timeUnit;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getCreateClusterOnDemand() {
			return this.createClusterOnDemand;
		}

		public void setCreateClusterOnDemand(Boolean createClusterOnDemand) {
			this.createClusterOnDemand = createClusterOnDemand;
		}

		public String getStragety() {
			return this.stragety;
		}

		public void setStragety(String stragety) {
			this.stragety = stragety;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getTimeInterval() {
			return this.timeInterval;
		}

		public void setTimeInterval(Integer timeInterval) {
			this.timeInterval = timeInterval;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getTimeUnit() {
			return this.timeUnit;
		}

		public void setTimeUnit(String timeUnit) {
			this.timeUnit = timeUnit;
		}
	}

	@Override
	public ListExecutionPlansResponse getInstance(UnmarshallerContext context) {
		return	ListExecutionPlansResponseUnmarshaller.unmarshall(this, context);
	}
}
