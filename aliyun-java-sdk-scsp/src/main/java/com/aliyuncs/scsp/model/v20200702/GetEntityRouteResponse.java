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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.scsp.transform.v20200702.GetEntityRouteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEntityRouteResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Boolean success;

	private Data data;

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

		private String entityId;

		private Long uniqueId;

		private String entityName;

		private String extInfo;

		private String entityBizCodeType;

		private String departmentId;

		private String entityBizCode;

		private String entityRelationNumber;

		private Long serviceId;

		private Long groupId;

		public String getEntityId() {
			return this.entityId;
		}

		public void setEntityId(String entityId) {
			this.entityId = entityId;
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

		public String getEntityBizCodeType() {
			return this.entityBizCodeType;
		}

		public void setEntityBizCodeType(String entityBizCodeType) {
			this.entityBizCodeType = entityBizCodeType;
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

		public String getEntityRelationNumber() {
			return this.entityRelationNumber;
		}

		public void setEntityRelationNumber(String entityRelationNumber) {
			this.entityRelationNumber = entityRelationNumber;
		}

		public Long getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(Long serviceId) {
			this.serviceId = serviceId;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}
	}

	@Override
	public GetEntityRouteResponse getInstance(UnmarshallerContext context) {
		return	GetEntityRouteResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
