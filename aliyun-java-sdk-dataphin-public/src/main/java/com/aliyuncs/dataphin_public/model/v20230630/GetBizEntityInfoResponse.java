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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetBizEntityInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBizEntityInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private BizEntityInfo bizEntityInfo;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public BizEntityInfo getBizEntityInfo() {
		return this.bizEntityInfo;
	}

	public void setBizEntityInfo(BizEntityInfo bizEntityInfo) {
		this.bizEntityInfo = bizEntityInfo;
	}

	public static class BizEntityInfo {

		private String type;

		private Long dataDomainId;

		private Long bizUnitId;

		private BizObject bizObject;

		private BizProcess bizProcess;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getDataDomainId() {
			return this.dataDomainId;
		}

		public void setDataDomainId(Long dataDomainId) {
			this.dataDomainId = dataDomainId;
		}

		public Long getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(Long bizUnitId) {
			this.bizUnitId = bizUnitId;
		}

		public BizObject getBizObject() {
			return this.bizObject;
		}

		public void setBizObject(BizObject bizObject) {
			this.bizObject = bizObject;
		}

		public BizProcess getBizProcess() {
			return this.bizProcess;
		}

		public void setBizProcess(BizProcess bizProcess) {
			this.bizProcess = bizProcess;
		}

		public static class BizObject {

			private Long id;

			private String name;

			private String displayName;

			private String description;

			private String ownerUserId;

			private String ownerName;

			private String type;

			private Long parentId;

			private String gmtCreate;

			private String gmtModified;

			private String lastModifier;

			private String lastModifierName;

			private Integer refDimTableCount;

			private Integer refSummaryTableCount;

			private String onlineStatus;

			private String status;

			private String approvalId;

			private String approvalStatus;

			private List<Long> refBizEntityIdList;

			private List<Long> childBizEntityIdList;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getOwnerUserId() {
				return this.ownerUserId;
			}

			public void setOwnerUserId(String ownerUserId) {
				this.ownerUserId = ownerUserId;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getLastModifier() {
				return this.lastModifier;
			}

			public void setLastModifier(String lastModifier) {
				this.lastModifier = lastModifier;
			}

			public String getLastModifierName() {
				return this.lastModifierName;
			}

			public void setLastModifierName(String lastModifierName) {
				this.lastModifierName = lastModifierName;
			}

			public Integer getRefDimTableCount() {
				return this.refDimTableCount;
			}

			public void setRefDimTableCount(Integer refDimTableCount) {
				this.refDimTableCount = refDimTableCount;
			}

			public Integer getRefSummaryTableCount() {
				return this.refSummaryTableCount;
			}

			public void setRefSummaryTableCount(Integer refSummaryTableCount) {
				this.refSummaryTableCount = refSummaryTableCount;
			}

			public String getOnlineStatus() {
				return this.onlineStatus;
			}

			public void setOnlineStatus(String onlineStatus) {
				this.onlineStatus = onlineStatus;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getApprovalId() {
				return this.approvalId;
			}

			public void setApprovalId(String approvalId) {
				this.approvalId = approvalId;
			}

			public String getApprovalStatus() {
				return this.approvalStatus;
			}

			public void setApprovalStatus(String approvalStatus) {
				this.approvalStatus = approvalStatus;
			}

			public List<Long> getRefBizEntityIdList() {
				return this.refBizEntityIdList;
			}

			public void setRefBizEntityIdList(List<Long> refBizEntityIdList) {
				this.refBizEntityIdList = refBizEntityIdList;
			}

			public List<Long> getChildBizEntityIdList() {
				return this.childBizEntityIdList;
			}

			public void setChildBizEntityIdList(List<Long> childBizEntityIdList) {
				this.childBizEntityIdList = childBizEntityIdList;
			}
		}

		public static class BizProcess {

			private Long id;

			private String name;

			private String displayName;

			private String description;

			private String ownerUserId;

			private String ownerName;

			private String type;

			private String gmtCreate;

			private String gmtModified;

			private String lastModifier;

			private String lastModifierName;

			private Boolean hasDependent;

			private String onlineStatus;

			private String status;

			private String approvalId;

			private String approvalStatus;

			private Integer refFactTableCount;

			private List<Long> refBizEntityIdList1;

			private List<Long> bizEventEntityIdList;

			private List<Long> preBizProcessIdList;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getOwnerUserId() {
				return this.ownerUserId;
			}

			public void setOwnerUserId(String ownerUserId) {
				this.ownerUserId = ownerUserId;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getLastModifier() {
				return this.lastModifier;
			}

			public void setLastModifier(String lastModifier) {
				this.lastModifier = lastModifier;
			}

			public String getLastModifierName() {
				return this.lastModifierName;
			}

			public void setLastModifierName(String lastModifierName) {
				this.lastModifierName = lastModifierName;
			}

			public Boolean getHasDependent() {
				return this.hasDependent;
			}

			public void setHasDependent(Boolean hasDependent) {
				this.hasDependent = hasDependent;
			}

			public String getOnlineStatus() {
				return this.onlineStatus;
			}

			public void setOnlineStatus(String onlineStatus) {
				this.onlineStatus = onlineStatus;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getApprovalId() {
				return this.approvalId;
			}

			public void setApprovalId(String approvalId) {
				this.approvalId = approvalId;
			}

			public String getApprovalStatus() {
				return this.approvalStatus;
			}

			public void setApprovalStatus(String approvalStatus) {
				this.approvalStatus = approvalStatus;
			}

			public Integer getRefFactTableCount() {
				return this.refFactTableCount;
			}

			public void setRefFactTableCount(Integer refFactTableCount) {
				this.refFactTableCount = refFactTableCount;
			}

			public List<Long> getRefBizEntityIdList1() {
				return this.refBizEntityIdList1;
			}

			public void setRefBizEntityIdList1(List<Long> refBizEntityIdList1) {
				this.refBizEntityIdList1 = refBizEntityIdList1;
			}

			public List<Long> getBizEventEntityIdList() {
				return this.bizEventEntityIdList;
			}

			public void setBizEventEntityIdList(List<Long> bizEventEntityIdList) {
				this.bizEventEntityIdList = bizEventEntityIdList;
			}

			public List<Long> getPreBizProcessIdList() {
				return this.preBizProcessIdList;
			}

			public void setPreBizProcessIdList(List<Long> preBizProcessIdList) {
				this.preBizProcessIdList = preBizProcessIdList;
			}
		}
	}

	@Override
	public GetBizEntityInfoResponse getInstance(UnmarshallerContext context) {
		return	GetBizEntityInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
