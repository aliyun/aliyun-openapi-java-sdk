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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetDataDomainInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataDomainInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private DataDomainInfo dataDomainInfo;

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

	public DataDomainInfo getDataDomainInfo() {
		return this.dataDomainInfo;
	}

	public void setDataDomainInfo(DataDomainInfo dataDomainInfo) {
		this.dataDomainInfo = dataDomainInfo;
	}

	public static class DataDomainInfo {

		private Long id;

		private Long bizUnitId;

		private String name;

		private String displayName;

		private String abbreviation;

		private String description;

		private String ownerUserId;

		private String ownerName;

		private String gmtCreate;

		private String gmtModified;

		private String lastModifier;

		private String lastModifierName;

		private Long parentId;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getBizUnitId() {
			return this.bizUnitId;
		}

		public void setBizUnitId(Long bizUnitId) {
			this.bizUnitId = bizUnitId;
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

		public String getAbbreviation() {
			return this.abbreviation;
		}

		public void setAbbreviation(String abbreviation) {
			this.abbreviation = abbreviation;
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

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}
	}

	@Override
	public GetDataDomainInfoResponse getInstance(UnmarshallerContext context) {
		return	GetDataDomainInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
