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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.ListSchemaSubscribesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSchemaSubscribesResponse extends AcsResponse {

	private String requestId;

	private List<PageListItem> pageList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PageListItem> getPageList() {
		return this.pageList;
	}

	public void setPageList(List<PageListItem> pageList) {
		this.pageList = pageList;
	}

	public static class PageListItem {

		private List<ListItem> list;

		private Pagination pagination;

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class ListItem {

			private Long id;

			private String version;

			private String validitySchema;

			private String namespace;

			private String projectId;

			private Long deviceModelId;

			private String deviceModel;

			private Long gmtCreate;

			private Long gmtModified;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getValiditySchema() {
				return this.validitySchema;
			}

			public void setValiditySchema(String validitySchema) {
				this.validitySchema = validitySchema;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}

			public Long getDeviceModelId() {
				return this.deviceModelId;
			}

			public void setDeviceModelId(Long deviceModelId) {
				this.deviceModelId = deviceModelId;
			}

			public String getDeviceModel() {
				return this.deviceModel;
			}

			public void setDeviceModel(String deviceModel) {
				this.deviceModel = deviceModel;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}
		}

		public static class Pagination {

			private Integer totalCount;

			private Integer totalPageCount;

			private Integer pageIndex;

			private Integer pageSize;

			private Boolean simpleSign;

			private Boolean hasNextPage;

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}

			public Integer getTotalPageCount() {
				return this.totalPageCount;
			}

			public void setTotalPageCount(Integer totalPageCount) {
				this.totalPageCount = totalPageCount;
			}

			public Integer getPageIndex() {
				return this.pageIndex;
			}

			public void setPageIndex(Integer pageIndex) {
				this.pageIndex = pageIndex;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Boolean getSimpleSign() {
				return this.simpleSign;
			}

			public void setSimpleSign(Boolean simpleSign) {
				this.simpleSign = simpleSign;
			}

			public Boolean getHasNextPage() {
				return this.hasNextPage;
			}

			public void setHasNextPage(Boolean hasNextPage) {
				this.hasNextPage = hasNextPage;
			}
		}
	}

	@Override
	public ListSchemaSubscribesResponse getInstance(UnmarshallerContext context) {
		return	ListSchemaSubscribesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
