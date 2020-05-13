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
import com.aliyuncs.iovcc.transform.v20180501.ListUpstreamAppKeyRelationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUpstreamAppKeyRelationsResponse extends AcsResponse {

	private String requestId;

	private RelationList relationList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RelationList getRelationList() {
		return this.relationList;
	}

	public void setRelationList(RelationList relationList) {
		this.relationList = relationList;
	}

	public static class RelationList {

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

			private String appKey;

			private String pAppKey;

			private String projectId;

			private Long gmtCreate;

			private String appName;

			private String appPackage;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getAppKey() {
				return this.appKey;
			}

			public void setAppKey(String appKey) {
				this.appKey = appKey;
			}

			public String getPAppKey() {
				return this.pAppKey;
			}

			public void setPAppKey(String pAppKey) {
				this.pAppKey = pAppKey;
			}

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAppPackage() {
				return this.appPackage;
			}

			public void setAppPackage(String appPackage) {
				this.appPackage = appPackage;
			}
		}

		public static class Pagination {

			private Integer totalCount;

			private Integer totalPageCount;

			private Integer pageIndex;

			private Integer pageSize;

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
		}
	}

	@Override
	public ListUpstreamAppKeyRelationsResponse getInstance(UnmarshallerContext context) {
		return	ListUpstreamAppKeyRelationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
