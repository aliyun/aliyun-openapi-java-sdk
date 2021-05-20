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

package com.aliyuncs.scsp.model.v20200702;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scsp.transform.v20200702.GetEntityRouteListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEntityRouteListResponse extends AcsResponse {

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

		private Integer pageNo;

		private Integer pageSize;

		private Long total;

		private List<EntityRouteListItem> entityRouteList;

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<EntityRouteListItem> getEntityRouteList() {
			return this.entityRouteList;
		}

		public void setEntityRouteList(List<EntityRouteListItem> entityRouteList) {
			this.entityRouteList = entityRouteList;
		}

		public static class EntityRouteListItem {

			private String entityBizCodeType;

			private String groupId;

			private String entityId;

			private String serviceId;

			private String departmentId;

			private String entityBizCode;

			private Long uniqueId;

			private String entityName;

			private String extInfo;

			private String entityRelationNumber;

			public String getEntityBizCodeType() {
				return this.entityBizCodeType;
			}

			public void setEntityBizCodeType(String entityBizCodeType) {
				this.entityBizCodeType = entityBizCodeType;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getEntityId() {
				return this.entityId;
			}

			public void setEntityId(String entityId) {
				this.entityId = entityId;
			}

			public String getServiceId() {
				return this.serviceId;
			}

			public void setServiceId(String serviceId) {
				this.serviceId = serviceId;
			}

			public String getDepartmentId() {
				return this.departmentId;
			}

			public void setDepartmentId(String departmentId) {
				this.departmentId = departmentId;
			}

			public String getEntityBizCode() {
				return this.entityBizCode;
			}

			public void setEntityBizCode(String entityBizCode) {
				this.entityBizCode = entityBizCode;
			}

			public Long getUniqueId() {
				return this.uniqueId;
			}

			public void setUniqueId(Long uniqueId) {
				this.uniqueId = uniqueId;
			}

			public String getEntityName() {
				return this.entityName;
			}

			public void setEntityName(String entityName) {
				this.entityName = entityName;
			}

			public String getExtInfo() {
				return this.extInfo;
			}

			public void setExtInfo(String extInfo) {
				this.extInfo = extInfo;
			}

			public String getEntityRelationNumber() {
				return this.entityRelationNumber;
			}

			public void setEntityRelationNumber(String entityRelationNumber) {
				this.entityRelationNumber = entityRelationNumber;
			}
		}
	}

	@Override
	public GetEntityRouteListResponse getInstance(UnmarshallerContext context) {
		return	GetEntityRouteListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
