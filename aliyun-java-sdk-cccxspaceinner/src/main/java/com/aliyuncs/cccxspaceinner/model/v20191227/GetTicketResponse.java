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

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long formId;

		private Long responsible;

		private Long gmtModified;

		private Long dataId;

		private String questionInfo;

		private Long buId;

		private String srType;

		private String feedback;

		private String createMode;

		private Long touchId;

		private String formCode;

		private String memberName;

		private String bizId;

		private Long refCaseId;

		private String ownerName;

		private String fromInfo;

		private Integer memberType;

		private Long contactId;

		private Long departmentId;

		private Long gmtCreate;

		private Long sopCateId;

		private Long templateId;

		private String extAttrs;

		private Integer caseStatus;

		private String id;

		public Long getFormId() {
			return this.formId;
		}

		public void setFormId(Long formId) {
			this.formId = formId;
		}

		public Long getResponsible() {
			return this.responsible;
		}

		public void setResponsible(Long responsible) {
			this.responsible = responsible;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getDataId() {
			return this.dataId;
		}

		public void setDataId(Long dataId) {
			this.dataId = dataId;
		}

		public String getQuestionInfo() {
			return this.questionInfo;
		}

		public void setQuestionInfo(String questionInfo) {
			this.questionInfo = questionInfo;
		}

		public Long getBuId() {
			return this.buId;
		}

		public void setBuId(Long buId) {
			this.buId = buId;
		}

		public String getSrType() {
			return this.srType;
		}

		public void setSrType(String srType) {
			this.srType = srType;
		}

		public String getFeedback() {
			return this.feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

		public String getCreateMode() {
			return this.createMode;
		}

		public void setCreateMode(String createMode) {
			this.createMode = createMode;
		}

		public Long getTouchId() {
			return this.touchId;
		}

		public void setTouchId(Long touchId) {
			this.touchId = touchId;
		}

		public String getFormCode() {
			return this.formCode;
		}

		public void setFormCode(String formCode) {
			this.formCode = formCode;
		}

		public String getMemberName() {
			return this.memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public Long getRefCaseId() {
			return this.refCaseId;
		}

		public void setRefCaseId(Long refCaseId) {
			this.refCaseId = refCaseId;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public String getFromInfo() {
			return this.fromInfo;
		}

		public void setFromInfo(String fromInfo) {
			this.fromInfo = fromInfo;
		}

		public Integer getMemberType() {
			return this.memberType;
		}

		public void setMemberType(Integer memberType) {
			this.memberType = memberType;
		}

		public Long getContactId() {
			return this.contactId;
		}

		public void setContactId(Long contactId) {
			this.contactId = contactId;
		}

		public Long getDepartmentId() {
			return this.departmentId;
		}

		public void setDepartmentId(Long departmentId) {
			this.departmentId = departmentId;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getSopCateId() {
			return this.sopCateId;
		}

		public void setSopCateId(Long sopCateId) {
			this.sopCateId = sopCateId;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public String getExtAttrs() {
			return this.extAttrs;
		}

		public void setExtAttrs(String extAttrs) {
			this.extAttrs = extAttrs;
		}

		public Integer getCaseStatus() {
			return this.caseStatus;
		}

		public void setCaseStatus(Integer caseStatus) {
			this.caseStatus = caseStatus;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
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
