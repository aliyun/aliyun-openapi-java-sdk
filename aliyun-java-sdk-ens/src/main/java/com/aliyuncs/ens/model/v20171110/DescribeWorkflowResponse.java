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
import com.aliyuncs.ens.transform.v20171110.DescribeWorkflowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWorkflowResponse extends AcsResponse {

	private String requestId;

	private List<WorkFlowInfos> workFlowInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<WorkFlowInfos> getWorkFlowInfo() {
		return this.workFlowInfo;
	}

	public void setWorkFlowInfo(List<WorkFlowInfos> workFlowInfo) {
		this.workFlowInfo = workFlowInfo;
	}

	public static class WorkFlowInfos {

		private String gmtCreate;

		private String gmtExpire;

		private String workflowId;

		private String bizType;

		private String initAttributes;

		private String workerNode;

		private String duration;

		private String gmtStart;

		private String aliUid;

		private String ensRegionId;

		private String instanceId;

		private String name;

		private String gmtModify;

		private String id;

		private String gmtEnd;

		private String bussinessId;

		private String status;

		private String priority;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtExpire() {
			return this.gmtExpire;
		}

		public void setGmtExpire(String gmtExpire) {
			this.gmtExpire = gmtExpire;
		}

		public String getWorkflowId() {
			return this.workflowId;
		}

		public void setWorkflowId(String workflowId) {
			this.workflowId = workflowId;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getInitAttributes() {
			return this.initAttributes;
		}

		public void setInitAttributes(String initAttributes) {
			this.initAttributes = initAttributes;
		}

		public String getWorkerNode() {
			return this.workerNode;
		}

		public void setWorkerNode(String workerNode) {
			this.workerNode = workerNode;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getGmtStart() {
			return this.gmtStart;
		}

		public void setGmtStart(String gmtStart) {
			this.gmtStart = gmtStart;
		}

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(String gmtModify) {
			this.gmtModify = gmtModify;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getGmtEnd() {
			return this.gmtEnd;
		}

		public void setGmtEnd(String gmtEnd) {
			this.gmtEnd = gmtEnd;
		}

		public String getBussinessId() {
			return this.bussinessId;
		}

		public void setBussinessId(String bussinessId) {
			this.bussinessId = bussinessId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}
	}

	@Override
	public DescribeWorkflowResponse getInstance(UnmarshallerContext context) {
		return	DescribeWorkflowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
