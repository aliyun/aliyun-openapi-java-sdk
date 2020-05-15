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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeCurrentNodeInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCurrentNodeInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer stepNo;

		private Integer finalStepNo;

		private Long parentNodeId;

		private Long nodeId;

		private String nodeName;

		private Long previousNodeId;

		private Long nextNodeId;

		private String operatorRole;

		private Boolean autoFinishNode;

		private Boolean needAttachment;

		private Boolean allowRollbackNode;

		private String templateForm;

		private String nodeStatus;

		private Long gmtStart;

		private Long gmtExpired;

		private Long gmtFinished;

		public Integer getStepNo() {
			return this.stepNo;
		}

		public void setStepNo(Integer stepNo) {
			this.stepNo = stepNo;
		}

		public Integer getFinalStepNo() {
			return this.finalStepNo;
		}

		public void setFinalStepNo(Integer finalStepNo) {
			this.finalStepNo = finalStepNo;
		}

		public Long getParentNodeId() {
			return this.parentNodeId;
		}

		public void setParentNodeId(Long parentNodeId) {
			this.parentNodeId = parentNodeId;
		}

		public Long getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(Long nodeId) {
			this.nodeId = nodeId;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public Long getPreviousNodeId() {
			return this.previousNodeId;
		}

		public void setPreviousNodeId(Long previousNodeId) {
			this.previousNodeId = previousNodeId;
		}

		public Long getNextNodeId() {
			return this.nextNodeId;
		}

		public void setNextNodeId(Long nextNodeId) {
			this.nextNodeId = nextNodeId;
		}

		public String getOperatorRole() {
			return this.operatorRole;
		}

		public void setOperatorRole(String operatorRole) {
			this.operatorRole = operatorRole;
		}

		public Boolean getAutoFinishNode() {
			return this.autoFinishNode;
		}

		public void setAutoFinishNode(Boolean autoFinishNode) {
			this.autoFinishNode = autoFinishNode;
		}

		public Boolean getNeedAttachment() {
			return this.needAttachment;
		}

		public void setNeedAttachment(Boolean needAttachment) {
			this.needAttachment = needAttachment;
		}

		public Boolean getAllowRollbackNode() {
			return this.allowRollbackNode;
		}

		public void setAllowRollbackNode(Boolean allowRollbackNode) {
			this.allowRollbackNode = allowRollbackNode;
		}

		public String getTemplateForm() {
			return this.templateForm;
		}

		public void setTemplateForm(String templateForm) {
			this.templateForm = templateForm;
		}

		public String getNodeStatus() {
			return this.nodeStatus;
		}

		public void setNodeStatus(String nodeStatus) {
			this.nodeStatus = nodeStatus;
		}

		public Long getGmtStart() {
			return this.gmtStart;
		}

		public void setGmtStart(Long gmtStart) {
			this.gmtStart = gmtStart;
		}

		public Long getGmtExpired() {
			return this.gmtExpired;
		}

		public void setGmtExpired(Long gmtExpired) {
			this.gmtExpired = gmtExpired;
		}

		public Long getGmtFinished() {
			return this.gmtFinished;
		}

		public void setGmtFinished(Long gmtFinished) {
			this.gmtFinished = gmtFinished;
		}
	}

	@Override
	public DescribeCurrentNodeInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeCurrentNodeInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
