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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetLhSpaceByNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLhSpaceByNameResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private LakehouseSpace lakehouseSpace;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public LakehouseSpace getLakehouseSpace() {
		return this.lakehouseSpace;
	}

	public void setLakehouseSpace(LakehouseSpace lakehouseSpace) {
		this.lakehouseSpace = lakehouseSpace;
	}

	public static class LakehouseSpace {

		private Long id;

		private String spaceName;

		private String creatorId;

		private String tenantId;

		private String description;

		private Integer mode;

		private String dwDbType;

		private String spaceConfig;

		private Integer devDbId;

		private Integer prodDbId;

		private Boolean isDeleted;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSpaceName() {
			return this.spaceName;
		}

		public void setSpaceName(String spaceName) {
			this.spaceName = spaceName;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getMode() {
			return this.mode;
		}

		public void setMode(Integer mode) {
			this.mode = mode;
		}

		public String getDwDbType() {
			return this.dwDbType;
		}

		public void setDwDbType(String dwDbType) {
			this.dwDbType = dwDbType;
		}

		public String getSpaceConfig() {
			return this.spaceConfig;
		}

		public void setSpaceConfig(String spaceConfig) {
			this.spaceConfig = spaceConfig;
		}

		public Integer getDevDbId() {
			return this.devDbId;
		}

		public void setDevDbId(Integer devDbId) {
			this.devDbId = devDbId;
		}

		public Integer getProdDbId() {
			return this.prodDbId;
		}

		public void setProdDbId(Integer prodDbId) {
			this.prodDbId = prodDbId;
		}

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}
	}

	@Override
	public GetLhSpaceByNameResponse getInstance(UnmarshallerContext context) {
		return	GetLhSpaceByNameResponseUnmarshaller.unmarshall(this, context);
	}
}
