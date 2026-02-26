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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetRootOrganizationalUnitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRootOrganizationalUnitResponse extends AcsResponse {

	private String requestId;

	private OrganizationalUnit organizationalUnit;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OrganizationalUnit getOrganizationalUnit() {
		return this.organizationalUnit;
	}

	public void setOrganizationalUnit(OrganizationalUnit organizationalUnit) {
		this.organizationalUnit = organizationalUnit;
	}

	public static class OrganizationalUnit {

		private String instanceId;

		private String organizationalUnitId;

		private String organizationalUnitName;

		private Long createTime;

		private Long updateTime;

		private String description;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getOrganizationalUnitId() {
			return this.organizationalUnitId;
		}

		public void setOrganizationalUnitId(String organizationalUnitId) {
			this.organizationalUnitId = organizationalUnitId;
		}

		public String getOrganizationalUnitName() {
			return this.organizationalUnitName;
		}

		public void setOrganizationalUnitName(String organizationalUnitName) {
			this.organizationalUnitName = organizationalUnitName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public GetRootOrganizationalUnitResponse getInstance(UnmarshallerContext context) {
		return	GetRootOrganizationalUnitResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
