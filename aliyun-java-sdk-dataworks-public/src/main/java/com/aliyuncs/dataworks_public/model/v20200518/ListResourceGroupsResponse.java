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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListResourceGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceGroupsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private Boolean success;

	private String requestId;

	private List<DataItem> data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String identifier;

		private String cluster;

		private String bizExtKey;

		private Boolean enableKp;

		private String updateTime;

		private String resourceGroupType;

		private String mode;

		private Integer sequence;

		private Boolean isDefault;

		private String createTime;

		private String name;

		private Long tenantId;

		private Long id;

		private Integer status;

		private Map<Object,Object> specs;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getCluster() {
			return this.cluster;
		}

		public void setCluster(String cluster) {
			this.cluster = cluster;
		}

		public String getBizExtKey() {
			return this.bizExtKey;
		}

		public void setBizExtKey(String bizExtKey) {
			this.bizExtKey = bizExtKey;
		}

		public Boolean getEnableKp() {
			return this.enableKp;
		}

		public void setEnableKp(Boolean enableKp) {
			this.enableKp = enableKp;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getResourceGroupType() {
			return this.resourceGroupType;
		}

		public void setResourceGroupType(String resourceGroupType) {
			this.resourceGroupType = resourceGroupType;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public Integer getSequence() {
			return this.sequence;
		}

		public void setSequence(Integer sequence) {
			this.sequence = sequence;
		}

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Map<Object,Object> getSpecs() {
			return this.specs;
		}

		public void setSpecs(Map<Object,Object> specs) {
			this.specs = specs;
		}
	}

	@Override
	public ListResourceGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListResourceGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
