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
import com.aliyuncs.dataphin_public.transform.v20230630.GetMyTenantsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMyTenantsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<TenantInfo> tenantList;

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

	public List<TenantInfo> getTenantList() {
		return this.tenantList;
	}

	public void setTenantList(List<TenantInfo> tenantList) {
		this.tenantList = tenantList;
	}

	public static class TenantInfo {

		private Long id;

		private String name;

		private String ownerId;

		private String description;

		private Boolean deleted;

		private Long deleteTime;

		private String titleType;

		private Boolean opsTenant;

		private Boolean resourceLimited;

		private Boolean visible;

		private List<String> tenantTypeList;

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

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public Long getDeleteTime() {
			return this.deleteTime;
		}

		public void setDeleteTime(Long deleteTime) {
			this.deleteTime = deleteTime;
		}

		public String getTitleType() {
			return this.titleType;
		}

		public void setTitleType(String titleType) {
			this.titleType = titleType;
		}

		public Boolean getOpsTenant() {
			return this.opsTenant;
		}

		public void setOpsTenant(Boolean opsTenant) {
			this.opsTenant = opsTenant;
		}

		public Boolean getResourceLimited() {
			return this.resourceLimited;
		}

		public void setResourceLimited(Boolean resourceLimited) {
			this.resourceLimited = resourceLimited;
		}

		public Boolean getVisible() {
			return this.visible;
		}

		public void setVisible(Boolean visible) {
			this.visible = visible;
		}

		public List<String> getTenantTypeList() {
			return this.tenantTypeList;
		}

		public void setTenantTypeList(List<String> tenantTypeList) {
			this.tenantTypeList = tenantTypeList;
		}
	}

	@Override
	public GetMyTenantsResponse getInstance(UnmarshallerContext context) {
		return	GetMyTenantsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
