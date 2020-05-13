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
import com.aliyuncs.iovcc.transform.v20180501.ListRpcServicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRpcServicesResponse extends AcsResponse {

	private String requestId;

	private RpcServices rpcServices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RpcServices getRpcServices() {
		return this.rpcServices;
	}

	public void setRpcServices(RpcServices rpcServices) {
		this.rpcServices = rpcServices;
	}

	public static class RpcServices {

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

			private String interfaceName;

			private String groupName;

			private String type;

			private String params;

			private String isDelete;

			private Long gmtCreate;

			private Long gmtModified;

			private String methodName;

			private String versionCode;

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

			public String getInterfaceName() {
				return this.interfaceName;
			}

			public void setInterfaceName(String interfaceName) {
				this.interfaceName = interfaceName;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getParams() {
				return this.params;
			}

			public void setParams(String params) {
				this.params = params;
			}

			public String getIsDelete() {
				return this.isDelete;
			}

			public void setIsDelete(String isDelete) {
				this.isDelete = isDelete;
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

			public String getMethodName() {
				return this.methodName;
			}

			public void setMethodName(String methodName) {
				this.methodName = methodName;
			}

			public String getVersionCode() {
				return this.versionCode;
			}

			public void setVersionCode(String versionCode) {
				this.versionCode = versionCode;
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
	public ListRpcServicesResponse getInstance(UnmarshallerContext context) {
		return	ListRpcServicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
