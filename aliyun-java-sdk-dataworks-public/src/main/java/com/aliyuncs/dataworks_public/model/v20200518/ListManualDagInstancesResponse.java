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
import com.aliyuncs.dataworks_public.transform.v20200518.ListManualDagInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListManualDagInstancesResponse extends AcsResponse {

	private String requestId;

	private List<InstancesItem> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstancesItem> getInstances() {
		return this.instances;
	}

	public void setInstances(List<InstancesItem> instances) {
		this.instances = instances;
	}

	public static class InstancesItem {

		private Long nodeId;

		private Long instanceId;

		private Long dagId;

		private String dagType;

		private String status;

		private Long bizDate;

		private Long cycTime;

		private Long createTime;

		private Long modifyTime;

		private String nodeName;

		private Long beginWaitTimeTime;

		private Long beginWaitResTime;

		private Long beginRunningTime;

		private String paramValues;

		private Long finishTime;

		private String taskType;

		public Long getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(Long nodeId) {
			this.nodeId = nodeId;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public Long getDagId() {
			return this.dagId;
		}

		public void setDagId(Long dagId) {
			this.dagId = dagId;
		}

		public String getDagType() {
			return this.dagType;
		}

		public void setDagType(String dagType) {
			this.dagType = dagType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(Long bizDate) {
			this.bizDate = bizDate;
		}

		public Long getCycTime() {
			return this.cycTime;
		}

		public void setCycTime(Long cycTime) {
			this.cycTime = cycTime;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(Long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public Long getBeginWaitTimeTime() {
			return this.beginWaitTimeTime;
		}

		public void setBeginWaitTimeTime(Long beginWaitTimeTime) {
			this.beginWaitTimeTime = beginWaitTimeTime;
		}

		public Long getBeginWaitResTime() {
			return this.beginWaitResTime;
		}

		public void setBeginWaitResTime(Long beginWaitResTime) {
			this.beginWaitResTime = beginWaitResTime;
		}

		public Long getBeginRunningTime() {
			return this.beginRunningTime;
		}

		public void setBeginRunningTime(Long beginRunningTime) {
			this.beginRunningTime = beginRunningTime;
		}

		public String getParamValues() {
			return this.paramValues;
		}

		public void setParamValues(String paramValues) {
			this.paramValues = paramValues;
		}

		public Long getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(Long finishTime) {
			this.finishTime = finishTime;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}
	}

	@Override
	public ListManualDagInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListManualDagInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
