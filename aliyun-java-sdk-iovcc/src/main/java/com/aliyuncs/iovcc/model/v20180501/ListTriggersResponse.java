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
import com.aliyuncs.iovcc.transform.v20180501.ListTriggersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTriggersResponse extends AcsResponse {

	private String requestId;

	private TriggerList triggerList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TriggerList getTriggerList() {
		return this.triggerList;
	}

	public void setTriggerList(TriggerList triggerList) {
		this.triggerList = triggerList;
	}

	public static class TriggerList {

		private List<Trigger> triggers;

		private Pagination pagination;

		public List<Trigger> getTriggers() {
			return this.triggers;
		}

		public void setTriggers(List<Trigger> triggers) {
			this.triggers = triggers;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class Trigger {

			private Long id;

			private String namespace;

			private String source;

			private Long gmtCreate;

			private Long gmtModified;

			private String chainedFunctionIds;

			private Integer type;

			private Integer status;

			private Integer invocationMode;

			private Integer sandbox;

			private Integer production;

			private List<Function> functions;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
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

			public String getChainedFunctionIds() {
				return this.chainedFunctionIds;
			}

			public void setChainedFunctionIds(String chainedFunctionIds) {
				this.chainedFunctionIds = chainedFunctionIds;
			}

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getInvocationMode() {
				return this.invocationMode;
			}

			public void setInvocationMode(Integer invocationMode) {
				this.invocationMode = invocationMode;
			}

			public Integer getSandbox() {
				return this.sandbox;
			}

			public void setSandbox(Integer sandbox) {
				this.sandbox = sandbox;
			}

			public Integer getProduction() {
				return this.production;
			}

			public void setProduction(Integer production) {
				this.production = production;
			}

			public List<Function> getFunctions() {
				return this.functions;
			}

			public void setFunctions(List<Function> functions) {
				this.functions = functions;
			}

			public static class Function {

				private Long id;

				private String name;

				private Long fileId;

				private String fileName;

				private Long gmtCreate;

				private Long gmtModified;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Long getFileId() {
					return this.fileId;
				}

				public void setFileId(Long fileId) {
					this.fileId = fileId;
				}

				public String getFileName() {
					return this.fileName;
				}

				public void setFileName(String fileName) {
					this.fileName = fileName;
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
		}

		public static class Pagination {

			private Integer pageIndex;

			private Integer pageSize;

			private Integer totalCount;

			private Integer totalPageCount;

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
		}
	}

	@Override
	public ListTriggersResponse getInstance(UnmarshallerContext context) {
		return	ListTriggersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
