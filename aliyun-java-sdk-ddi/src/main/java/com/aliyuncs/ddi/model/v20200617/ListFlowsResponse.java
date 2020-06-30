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

package com.aliyuncs.ddi.model.v20200617;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddi.transform.v20200617.ListFlowsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowsResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Integer total;

	private List<FlowItem> flow;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<FlowItem> getFlow() {
		return this.flow;
	}

	public void setFlow(List<FlowItem> flow) {
		this.flow = flow;
	}

	public static class FlowItem {

		private String alertConf;

		private String alertDingDingGroupBizId;

		private String alertUserGroupBizId;

		private String categoryId;

		private String clusterId;

		private Boolean createCluster;

		private String cronExpr;

		private String description;

		private Long endSchedule;

		private Long gmtCreate;

		private Long gmtModified;

		private String graph;

		private String hostName;

		private String id;

		private String name;

		private Boolean periodic;

		private String projectId;

		private Long startSchedule;

		private String status;

		private String type;

		public String getAlertConf() {
			return this.alertConf;
		}

		public void setAlertConf(String alertConf) {
			this.alertConf = alertConf;
		}

		public String getAlertDingDingGroupBizId() {
			return this.alertDingDingGroupBizId;
		}

		public void setAlertDingDingGroupBizId(String alertDingDingGroupBizId) {
			this.alertDingDingGroupBizId = alertDingDingGroupBizId;
		}

		public String getAlertUserGroupBizId() {
			return this.alertUserGroupBizId;
		}

		public void setAlertUserGroupBizId(String alertUserGroupBizId) {
			this.alertUserGroupBizId = alertUserGroupBizId;
		}

		public String getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Boolean getCreateCluster() {
			return this.createCluster;
		}

		public void setCreateCluster(Boolean createCluster) {
			this.createCluster = createCluster;
		}

		public String getCronExpr() {
			return this.cronExpr;
		}

		public void setCronExpr(String cronExpr) {
			this.cronExpr = cronExpr;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getEndSchedule() {
			return this.endSchedule;
		}

		public void setEndSchedule(Long endSchedule) {
			this.endSchedule = endSchedule;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getGraph() {
			return this.graph;
		}

		public void setGraph(String graph) {
			this.graph = graph;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

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

		public Boolean getPeriodic() {
			return this.periodic;
		}

		public void setPeriodic(Boolean periodic) {
			this.periodic = periodic;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public Long getStartSchedule() {
			return this.startSchedule;
		}

		public void setStartSchedule(Long startSchedule) {
			this.startSchedule = startSchedule;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public ListFlowsResponse getInstance(UnmarshallerContext context) {
		return	ListFlowsResponseUnmarshaller.unmarshall(this, context);
	}
}
