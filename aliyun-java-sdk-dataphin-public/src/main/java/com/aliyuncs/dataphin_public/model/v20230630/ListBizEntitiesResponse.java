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
import com.aliyuncs.dataphin_public.transform.v20230630.ListBizEntitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBizEntitiesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private PageResult pageResult;

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

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Integer totalCount;

		private List<BizEntityInfo> bizEntityList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<BizEntityInfo> getBizEntityList() {
			return this.bizEntityList;
		}

		public void setBizEntityList(List<BizEntityInfo> bizEntityList) {
			this.bizEntityList = bizEntityList;
		}

		public static class BizEntityInfo {

			private Long id;

			private String name;

			private String displayName;

			private String description;

			private String ownerUserId;

			private String ownerName;

			private String type;

			private String subType;

			private Long dataDomainId;

			private Long bizUnitId;

			private String gmtCreate;

			private String gmtModified;

			private String lastModifier;

			private String lastModifierName;

			private String onlineStatus;

			private String status;

			private Integer refTableCount;

			private Boolean hasChildBizEntity;

			private Boolean levelSubBizObject;

			private List<Long> refBizEntityIdList;

			private List<Long> belongToBizEntityIdList;

			private List<Long> childBizEntityIdList;

			private List<Long> suffixBizEntityIdList;

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

			public String getSubType() {
				return this.subType;
			}

			public void setSubType(String subType) {
				this.subType = subType;
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

			public Integer getRefTableCount() {
				return this.refTableCount;
			}

			public void setRefTableCount(Integer refTableCount) {
				this.refTableCount = refTableCount;
			}

			public Boolean getHasChildBizEntity() {
				return this.hasChildBizEntity;
			}

			public void setHasChildBizEntity(Boolean hasChildBizEntity) {
				this.hasChildBizEntity = hasChildBizEntity;
			}

			public Boolean getLevelSubBizObject() {
				return this.levelSubBizObject;
			}

			public void setLevelSubBizObject(Boolean levelSubBizObject) {
				this.levelSubBizObject = levelSubBizObject;
			}

			public List<Long> getRefBizEntityIdList() {
				return this.refBizEntityIdList;
			}

			public void setRefBizEntityIdList(List<Long> refBizEntityIdList) {
				this.refBizEntityIdList = refBizEntityIdList;
			}

			public List<Long> getBelongToBizEntityIdList() {
				return this.belongToBizEntityIdList;
			}

			public void setBelongToBizEntityIdList(List<Long> belongToBizEntityIdList) {
				this.belongToBizEntityIdList = belongToBizEntityIdList;
			}

			public List<Long> getChildBizEntityIdList() {
				return this.childBizEntityIdList;
			}

			public void setChildBizEntityIdList(List<Long> childBizEntityIdList) {
				this.childBizEntityIdList = childBizEntityIdList;
			}

			public List<Long> getSuffixBizEntityIdList() {
				return this.suffixBizEntityIdList;
			}

			public void setSuffixBizEntityIdList(List<Long> suffixBizEntityIdList) {
				this.suffixBizEntityIdList = suffixBizEntityIdList;
			}
		}
	}

	@Override
	public ListBizEntitiesResponse getInstance(UnmarshallerContext context) {
		return	ListBizEntitiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
