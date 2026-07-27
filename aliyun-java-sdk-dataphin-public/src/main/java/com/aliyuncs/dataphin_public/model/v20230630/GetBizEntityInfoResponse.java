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

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private BizEntityInfo bizEntityInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public BizEntityInfo getBizEntityInfo() {
		return this.bizEntityInfo;
	}

	public void setBizEntityInfo(BizEntityInfo bizEntityInfo) {
		this.bizEntityInfo = bizEntityInfo;
	}

	public static class BizEntityInfo {

		private Long dataDomainId;

		private Long bizUnitId;

		private String type;

		private BizProcess bizProcess;

		private BizObject bizObject;

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

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public BizProcess getBizProcess() {
			return this.bizProcess;
		}

		public void setBizProcess(BizProcess bizProcess) {
			this.bizProcess = bizProcess;
		}

		public BizObject getBizObject() {
			return this.bizObject;
		}

		public void setBizObject(BizObject bizObject) {
			this.bizObject = bizObject;
		}

		public static class BizProcess {

			private String status;

			private String ownerName;

			private String lastModifier;

			private String description;

			private String gmtModified;

			private String onlineStatus;

			private String approvalId;

			private String lastModifierName;

			private String approvalStatus;

			private String name;

			private String ownerUserId;

			private String type;

			private String gmtCreate;

			private Boolean hasDependent;

			private String displayName;

			private Integer refFactTableCount;

			private Long id;

			private List<Long> bizEventEntityIdList;

			private List<Long> refBizEntityIdList;

			private List<Long> preBizProcessIdList;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getLastModifier() {
				return this.lastModifier;
			}

			public void setLastModifier(String lastModifier) {
				this.lastModifier = lastModifier;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getOnlineStatus() {
				return this.onlineStatus;
			}

			public void setOnlineStatus(String onlineStatus) {
				this.onlineStatus = onlineStatus;
			}

			public String getApprovalId() {
				return this.approvalId;
			}

			public void setApprovalId(String approvalId) {
				this.approvalId = approvalId;
			}

			public String getLastModifierName() {
				return this.lastModifierName;
			}

			public void setLastModifierName(String lastModifierName) {
				this.lastModifierName = lastModifierName;
			}

			public String getApprovalStatus() {
				return this.approvalStatus;
			}

			public void setApprovalStatus(String approvalStatus) {
				this.approvalStatus = approvalStatus;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOwnerUserId() {
				return this.ownerUserId;
			}

			public void setOwnerUserId(String ownerUserId) {
				this.ownerUserId = ownerUserId;
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

			public Boolean getHasDependent() {
				return this.hasDependent;
			}

			public void setHasDependent(Boolean hasDependent) {
				this.hasDependent = hasDependent;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public Integer getRefFactTableCount() {
				return this.refFactTableCount;
			}

			public void setRefFactTableCount(Integer refFactTableCount) {
				this.refFactTableCount = refFactTableCount;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public List<Long> getBizEventEntityIdList() {
				return this.bizEventEntityIdList;
			}

			public void setBizEventEntityIdList(List<Long> bizEventEntityIdList) {
				this.bizEventEntityIdList = bizEventEntityIdList;
			}

			public List<Long> getRefBizEntityIdList() {
				return this.refBizEntityIdList;
			}

			public void setRefBizEntityIdList(List<Long> refBizEntityIdList) {
				this.refBizEntityIdList = refBizEntityIdList;
			}

			public List<Long> getPreBizProcessIdList() {
				return this.preBizProcessIdList;
			}

			public void setPreBizProcessIdList(List<Long> preBizProcessIdList) {
				this.preBizProcessIdList = preBizProcessIdList;
			}
		}

		public static class BizObject {

			private Long parentId;

			private String status;

			private String ownerName;

			private String lastModifier;

			private String description;

			private String gmtModified;

			private String onlineStatus;

			private String approvalId;

			private String lastModifierName;

			private Integer refSummaryTableCount;

			private String approvalStatus;

			private String name;

			private String ownerUserId;

			private String type;

			private String gmtCreate;

			private String displayName;

			private Integer refDimTableCount;

			private Long id;

			private List<Long> childBizEntityIdList;

			private List<Long> refBizEntityIdList1;

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getLastModifier() {
				return this.lastModifier;
			}

			public void setLastModifier(String lastModifier) {
				this.lastModifier = lastModifier;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getOnlineStatus() {
				return this.onlineStatus;
			}

			public void setOnlineStatus(String onlineStatus) {
				this.onlineStatus = onlineStatus;
			}

			public String getApprovalId() {
				return this.approvalId;
			}

			public void setApprovalId(String approvalId) {
				this.approvalId = approvalId;
			}

			public String getLastModifierName() {
				return this.lastModifierName;
			}

			public void setLastModifierName(String lastModifierName) {
				this.lastModifierName = lastModifierName;
			}

			public Integer getRefSummaryTableCount() {
				return this.refSummaryTableCount;
			}

			public void setRefSummaryTableCount(Integer refSummaryTableCount) {
				this.refSummaryTableCount = refSummaryTableCount;
			}

			public String getApprovalStatus() {
				return this.approvalStatus;
			}

			public void setApprovalStatus(String approvalStatus) {
				this.approvalStatus = approvalStatus;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOwnerUserId() {
				return this.ownerUserId;
			}

			public void setOwnerUserId(String ownerUserId) {
				this.ownerUserId = ownerUserId;
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

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public Integer getRefDimTableCount() {
				return this.refDimTableCount;
			}

			public void setRefDimTableCount(Integer refDimTableCount) {
				this.refDimTableCount = refDimTableCount;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public List<Long> getChildBizEntityIdList() {
				return this.childBizEntityIdList;
			}

			public void setChildBizEntityIdList(List<Long> childBizEntityIdList) {
				this.childBizEntityIdList = childBizEntityIdList;
			}

			public List<Long> getRefBizEntityIdList1() {
				return this.refBizEntityIdList1;
			}

			public void setRefBizEntityIdList1(List<Long> refBizEntityIdList1) {
				this.refBizEntityIdList1 = refBizEntityIdList1;
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
