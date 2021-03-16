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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cccxspaceinner.transform.v20191227.GetTicketResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTicketResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String id;

		private String questionInfo;

		private Integer caseStatus;

		private String srType;

		private String extAttrs;

		private Long gmtCreate;

		private Long gmtModified;

		private String ownerName;

		private Long responsible;

		private String memberName;

		private Long sopCateId;

		private Long dataId;

		private Integer memberType;

		private Long refCaseId;

		private Long departmentId;

		private Long buId;

		private Long touchId;

		private Long templateId;

		private Long formId;

		private String bizId;

		private String formCode;

		private String fromInfo;

		private String createMode;

		private Long contactId;

		private String feedback;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getQuestionInfo() {
			return this.questionInfo;
		}

		public void setQuestionInfo(String questionInfo) {
			this.questionInfo = questionInfo;
		}

		public Integer getCaseStatus() {
			return this.caseStatus;
		}

		public void setCaseStatus(Integer caseStatus) {
			this.caseStatus = caseStatus;
		}

		public String getSrType() {
			return this.srType;
		}

		public void setSrType(String srType) {
			this.srType = srType;
		}

		public String getExtAttrs() {
			return this.extAttrs;
		}

		public void setExtAttrs(String extAttrs) {
			this.extAttrs = extAttrs;
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

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public Long getResponsible() {
			return this.responsible;
		}

		public void setResponsible(Long responsible) {
			this.responsible = responsible;
		}

		public String getMemberName() {
			return this.memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public Long getSopCateId() {
			return this.sopCateId;
		}

		public void setSopCateId(Long sopCateId) {
			this.sopCateId = sopCateId;
		}

		public Long getDataId() {
			return this.dataId;
		}

		public void setDataId(Long dataId) {
			this.dataId = dataId;
		}

		public Integer getMemberType() {
			return this.memberType;
		}

		public void setMemberType(Integer memberType) {
			this.memberType = memberType;
		}

		public Long getRefCaseId() {
			return this.refCaseId;
		}

		public void setRefCaseId(Long refCaseId) {
			this.refCaseId = refCaseId;
		}

		public Long getDepartmentId() {
			return this.departmentId;
		}

		public void setDepartmentId(Long departmentId) {
			this.departmentId = departmentId;
		}

		public Long getBuId() {
			return this.buId;
		}

		public void setBuId(Long buId) {
			this.buId = buId;
		}

		public Long getTouchId() {
			return this.touchId;
		}

		public void setTouchId(Long touchId) {
			this.touchId = touchId;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public Long getFormId() {
			return this.formId;
		}

		public void setFormId(Long formId) {
			this.formId = formId;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getFormCode() {
			return this.formCode;
		}

		public void setFormCode(String formCode) {
			this.formCode = formCode;
		}

		public String getFromInfo() {
			return this.fromInfo;
		}

		public void setFromInfo(String fromInfo) {
			this.fromInfo = fromInfo;
		}

		public String getCreateMode() {
			return this.createMode;
		}

		public void setCreateMode(String createMode) {
			this.createMode = createMode;
		}

		public Long getContactId() {
			return this.contactId;
		}

		public void setContactId(Long contactId) {
			this.contactId = contactId;
		}

		public String getFeedback() {
			return this.feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}
	}

	@Override
	public GetTicketResponse getInstance(UnmarshallerContext context) {
		return	GetTicketResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
