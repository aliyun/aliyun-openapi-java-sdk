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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListInnerNodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInnerNodesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Paging paging;

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

	public Paging getPaging() {
		return this.paging;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}

	public static class Paging {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<NodesItem> nodes;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<NodesItem> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<NodesItem> nodes) {
			this.nodes = nodes;
		}

		public static class NodesItem {

			private String schedulerType;

			private Long repeatInterval;

			private Boolean repeatability;

			private Long projectId;

			private String programType;

			private Integer priority;

			private String ownerId;

			private String connection;

			private String paramValues;

			private String dqcType;

			private Long baselineId;

			private String description;

			private String nodeName;

			private String resGroupName;

			private Long businessId;

			private String dqcDescription;

			private String cronExpress;

			private Long nodeId;

			public String getSchedulerType() {
				return this.schedulerType;
			}

			public void setSchedulerType(String schedulerType) {
				this.schedulerType = schedulerType;
			}

			public Long getRepeatInterval() {
				return this.repeatInterval;
			}

			public void setRepeatInterval(Long repeatInterval) {
				this.repeatInterval = repeatInterval;
			}

			public Boolean getRepeatability() {
				return this.repeatability;
			}

			public void setRepeatability(Boolean repeatability) {
				this.repeatability = repeatability;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getProgramType() {
				return this.programType;
			}

			public void setProgramType(String programType) {
				this.programType = programType;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getConnection() {
				return this.connection;
			}

			public void setConnection(String connection) {
				this.connection = connection;
			}

			public String getParamValues() {
				return this.paramValues;
			}

			public void setParamValues(String paramValues) {
				this.paramValues = paramValues;
			}

			public String getDqcType() {
				return this.dqcType;
			}

			public void setDqcType(String dqcType) {
				this.dqcType = dqcType;
			}

			public Long getBaselineId() {
				return this.baselineId;
			}

			public void setBaselineId(Long baselineId) {
				this.baselineId = baselineId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getResGroupName() {
				return this.resGroupName;
			}

			public void setResGroupName(String resGroupName) {
				this.resGroupName = resGroupName;
			}

			public Long getBusinessId() {
				return this.businessId;
			}

			public void setBusinessId(Long businessId) {
				this.businessId = businessId;
			}

			public String getDqcDescription() {
				return this.dqcDescription;
			}

			public void setDqcDescription(String dqcDescription) {
				this.dqcDescription = dqcDescription;
			}

			public String getCronExpress() {
				return this.cronExpress;
			}

			public void setCronExpress(String cronExpress) {
				this.cronExpress = cronExpress;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}
		}
	}

	@Override
	public ListInnerNodesResponse getInstance(UnmarshallerContext context) {
		return	ListInnerNodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
