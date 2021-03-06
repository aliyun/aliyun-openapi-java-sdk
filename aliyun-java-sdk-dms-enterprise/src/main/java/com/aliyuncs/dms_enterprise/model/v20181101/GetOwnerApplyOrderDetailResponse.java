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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetOwnerApplyOrderDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOwnerApplyOrderDetailResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private OwnerApplyOrderDetail ownerApplyOrderDetail;

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

	public OwnerApplyOrderDetail getOwnerApplyOrderDetail() {
		return this.ownerApplyOrderDetail;
	}

	public void setOwnerApplyOrderDetail(OwnerApplyOrderDetail ownerApplyOrderDetail) {
		this.ownerApplyOrderDetail = ownerApplyOrderDetail;
	}

	public static class OwnerApplyOrderDetail {

		private String applyType;

		private List<Resource> resources;

		public String getApplyType() {
			return this.applyType;
		}

		public void setApplyType(String applyType) {
			this.applyType = applyType;
		}

		public List<Resource> getResources() {
			return this.resources;
		}

		public void setResources(List<Resource> resources) {
			this.resources = resources;
		}

		public static class Resource {

			private Boolean logic;

			private String targetId;

			private ResourceDetail resourceDetail;

			public Boolean getLogic() {
				return this.logic;
			}

			public void setLogic(Boolean logic) {
				this.logic = logic;
			}

			public String getTargetId() {
				return this.targetId;
			}

			public void setTargetId(String targetId) {
				this.targetId = targetId;
			}

			public ResourceDetail getResourceDetail() {
				return this.resourceDetail;
			}

			public void setResourceDetail(ResourceDetail resourceDetail) {
				this.resourceDetail = resourceDetail;
			}

			public static class ResourceDetail {

				private String tableName;

				private String searchName;

				private String envType;

				private String dbType;

				private List<String> ownerNickNames;

				private List<Long> ownerIds;

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public String getSearchName() {
					return this.searchName;
				}

				public void setSearchName(String searchName) {
					this.searchName = searchName;
				}

				public String getEnvType() {
					return this.envType;
				}

				public void setEnvType(String envType) {
					this.envType = envType;
				}

				public String getDbType() {
					return this.dbType;
				}

				public void setDbType(String dbType) {
					this.dbType = dbType;
				}

				public List<String> getOwnerNickNames() {
					return this.ownerNickNames;
				}

				public void setOwnerNickNames(List<String> ownerNickNames) {
					this.ownerNickNames = ownerNickNames;
				}

				public List<Long> getOwnerIds() {
					return this.ownerIds;
				}

				public void setOwnerIds(List<Long> ownerIds) {
					this.ownerIds = ownerIds;
				}
			}
		}
	}

	@Override
	public GetOwnerApplyOrderDetailResponse getInstance(UnmarshallerContext context) {
		return	GetOwnerApplyOrderDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
