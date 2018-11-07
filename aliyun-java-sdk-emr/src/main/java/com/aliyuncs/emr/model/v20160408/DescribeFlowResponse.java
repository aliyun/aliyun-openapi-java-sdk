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
import com.aliyuncs.emr.transform.v20160408.DescribeFlowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFlowResponse extends AcsResponse {

	private String requestId;

	private String id;

	private Long gmtCreate;

	private Long gmtModified;

	private String name;

	private String description;

	private String type;

	private String status;

	private Boolean periodic;

	private Long startSchedule;

	private Long endSchedule;

	private String cronExpr;

	private Boolean createCluster;

	private String clusterId;

	private String hostName;

	private String graph;

	private String categoryId;

	private String alertUserGroupBizId;

	private String alertDingDingGroupBizId;

	private List<ParentFlow> parentFlowList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getPeriodic() {
		return this.periodic;
	}

	public void setPeriodic(Boolean periodic) {
		this.periodic = periodic;
	}

	public Long getStartSchedule() {
		return this.startSchedule;
	}

	public void setStartSchedule(Long startSchedule) {
		this.startSchedule = startSchedule;
	}

	public Long getEndSchedule() {
		return this.endSchedule;
	}

	public void setEndSchedule(Long endSchedule) {
		this.endSchedule = endSchedule;
	}

	public String getCronExpr() {
		return this.cronExpr;
	}

	public void setCronExpr(String cronExpr) {
		this.cronExpr = cronExpr;
	}

	public Boolean getCreateCluster() {
		return this.createCluster;
	}

	public void setCreateCluster(Boolean createCluster) {
		this.createCluster = createCluster;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getGraph() {
		return this.graph;
	}

	public void setGraph(String graph) {
		this.graph = graph;
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getAlertUserGroupBizId() {
		return this.alertUserGroupBizId;
	}

	public void setAlertUserGroupBizId(String alertUserGroupBizId) {
		this.alertUserGroupBizId = alertUserGroupBizId;
	}

	public String getAlertDingDingGroupBizId() {
		return this.alertDingDingGroupBizId;
	}

	public void setAlertDingDingGroupBizId(String alertDingDingGroupBizId) {
		this.alertDingDingGroupBizId = alertDingDingGroupBizId;
	}

	public List<ParentFlow> getParentFlowList() {
		return this.parentFlowList;
	}

	public void setParentFlowList(List<ParentFlow> parentFlowList) {
		this.parentFlowList = parentFlowList;
	}

	public static class ParentFlow {

		private String parentFlowId;

		private String parentFlowName;

		private String projectId;

		private String projectName;

		public String getParentFlowId() {
			return this.parentFlowId;
		}

		public void setParentFlowId(String parentFlowId) {
			this.parentFlowId = parentFlowId;
		}

		public String getParentFlowName() {
			return this.parentFlowName;
		}

		public void setParentFlowName(String parentFlowName) {
			this.parentFlowName = parentFlowName;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
	}

	@Override
	public DescribeFlowResponse getInstance(UnmarshallerContext context) {
		return	DescribeFlowResponseUnmarshaller.unmarshall(this, context);
	}
}
