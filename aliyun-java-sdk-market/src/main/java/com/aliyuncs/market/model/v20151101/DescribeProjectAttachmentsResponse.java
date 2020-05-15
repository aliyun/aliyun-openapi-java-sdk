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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeProjectAttachmentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProjectAttachmentsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<ProjectAttachment> result;

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

	public List<ProjectAttachment> getResult() {
		return this.result;
	}

	public void setResult(List<ProjectAttachment> result) {
		this.result = result;
	}

	public static class ProjectAttachment {

		private Integer stepNo;

		private Long nodeId;

		private String nodeName;

		private String attachmentType;

		private String fileName;

		private String fileSuffix;

		private Long fileSize;

		private String operatorRole;

		private Long operator;

		private String operatorName;

		private String fileLink;

		private Long fileLinkGmtExpired;

		private String content;

		private Long gmtCreate;

		private String attachmentToken;

		public Integer getStepNo() {
			return this.stepNo;
		}

		public void setStepNo(Integer stepNo) {
			this.stepNo = stepNo;
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

		public String getAttachmentType() {
			return this.attachmentType;
		}

		public void setAttachmentType(String attachmentType) {
			this.attachmentType = attachmentType;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getFileSuffix() {
			return this.fileSuffix;
		}

		public void setFileSuffix(String fileSuffix) {
			this.fileSuffix = fileSuffix;
		}

		public Long getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Long fileSize) {
			this.fileSize = fileSize;
		}

		public String getOperatorRole() {
			return this.operatorRole;
		}

		public void setOperatorRole(String operatorRole) {
			this.operatorRole = operatorRole;
		}

		public Long getOperator() {
			return this.operator;
		}

		public void setOperator(Long operator) {
			this.operator = operator;
		}

		public String getOperatorName() {
			return this.operatorName;
		}

		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}

		public String getFileLink() {
			return this.fileLink;
		}

		public void setFileLink(String fileLink) {
			this.fileLink = fileLink;
		}

		public Long getFileLinkGmtExpired() {
			return this.fileLinkGmtExpired;
		}

		public void setFileLinkGmtExpired(Long fileLinkGmtExpired) {
			this.fileLinkGmtExpired = fileLinkGmtExpired;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getAttachmentToken() {
			return this.attachmentToken;
		}

		public void setAttachmentToken(String attachmentToken) {
			this.attachmentToken = attachmentToken;
		}
	}

	@Override
	public DescribeProjectAttachmentsResponse getInstance(UnmarshallerContext context) {
		return	DescribeProjectAttachmentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
