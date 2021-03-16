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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsHouyiQueryWorkflowInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsHouyiQueryWorkflowInstanceResponse extends AcsResponse {

	private List<WorkflowInstance> workflowInstances;

	public List<WorkflowInstance> getWorkflowInstances() {
		return this.workflowInstances;
	}

	public void setWorkflowInstances(List<WorkflowInstance> workflowInstances) {
		this.workflowInstances = workflowInstances;
	}

	public static class WorkflowInstance {

		private String workflowId;

		private String parentId;

		private String workflowName;

		private Long version;

		private String bizType;

		private String bizId;

		private Integer priority;

		private String initAttributes;

		private String state;

		private String executionNode;

		private Long startDateTime;

		private Long expireTime;

		private Long endDateTime;

		private Long duration;

		private Long createTime;

		private Long updateTime;

		private String tag;

		private String extColumn1;

		private String extColumn2;

		private String extColumn3;

		public String getWorkflowId() {
			return this.workflowId;
		}

		public void setWorkflowId(String workflowId) {
			this.workflowId = workflowId;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getWorkflowName() {
			return this.workflowName;
		}

		public void setWorkflowName(String workflowName) {
			this.workflowName = workflowName;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getInitAttributes() {
			return this.initAttributes;
		}

		public void setInitAttributes(String initAttributes) {
			this.initAttributes = initAttributes;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getExecutionNode() {
			return this.executionNode;
		}

		public void setExecutionNode(String executionNode) {
			this.executionNode = executionNode;
		}

		public Long getStartDateTime() {
			return this.startDateTime;
		}

		public void setStartDateTime(Long startDateTime) {
			this.startDateTime = startDateTime;
		}

		public Long getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}

		public Long getEndDateTime() {
			return this.endDateTime;
		}

		public void setEndDateTime(Long endDateTime) {
			this.endDateTime = endDateTime;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getExtColumn1() {
			return this.extColumn1;
		}

		public void setExtColumn1(String extColumn1) {
			this.extColumn1 = extColumn1;
		}

		public String getExtColumn2() {
			return this.extColumn2;
		}

		public void setExtColumn2(String extColumn2) {
			this.extColumn2 = extColumn2;
		}

		public String getExtColumn3() {
			return this.extColumn3;
		}

		public void setExtColumn3(String extColumn3) {
			this.extColumn3 = extColumn3;
		}
	}

	@Override
	public OpsHouyiQueryWorkflowInstanceResponse getInstance(UnmarshallerContext context) {
		return	OpsHouyiQueryWorkflowInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
