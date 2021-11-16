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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListDataSourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataSourcesResponse extends AcsResponse {

	private Integer httpStatusCode;

	private Boolean success;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<DataSourcesItem> dataSources;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<DataSourcesItem> getDataSources() {
			return this.dataSources;
		}

		public void setDataSources(List<DataSourcesItem> dataSources) {
			this.dataSources = dataSources;
		}

		public static class DataSourcesItem {

			private Boolean shared;

			private String gmtModified;

			private Integer connectStatus;

			private Integer bindingCalcEngineId;

			private String description;

			private String dataSourceType;

			private String gmtCreate;

			private Boolean defaultEngine;

			private String operator;

			private Integer sequence;

			private Integer envType;

			private Long tenantId;

			private String name;

			private String subType;

			private Integer id;

			private Integer projectId;

			private Integer status;

			private String content;

			public Boolean getShared() {
				return this.shared;
			}

			public void setShared(Boolean shared) {
				this.shared = shared;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Integer getConnectStatus() {
				return this.connectStatus;
			}

			public void setConnectStatus(Integer connectStatus) {
				this.connectStatus = connectStatus;
			}

			public Integer getBindingCalcEngineId() {
				return this.bindingCalcEngineId;
			}

			public void setBindingCalcEngineId(Integer bindingCalcEngineId) {
				this.bindingCalcEngineId = bindingCalcEngineId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDataSourceType() {
				return this.dataSourceType;
			}

			public void setDataSourceType(String dataSourceType) {
				this.dataSourceType = dataSourceType;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Boolean getDefaultEngine() {
				return this.defaultEngine;
			}

			public void setDefaultEngine(Boolean defaultEngine) {
				this.defaultEngine = defaultEngine;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public Integer getSequence() {
				return this.sequence;
			}

			public void setSequence(Integer sequence) {
				this.sequence = sequence;
			}

			public Integer getEnvType() {
				return this.envType;
			}

			public void setEnvType(Integer envType) {
				this.envType = envType;
			}

			public Long getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(Long tenantId) {
				this.tenantId = tenantId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSubType() {
				return this.subType;
			}

			public void setSubType(String subType) {
				this.subType = subType;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public Integer getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Integer projectId) {
				this.projectId = projectId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public ListDataSourcesResponse getInstance(UnmarshallerContext context) {
		return	ListDataSourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
