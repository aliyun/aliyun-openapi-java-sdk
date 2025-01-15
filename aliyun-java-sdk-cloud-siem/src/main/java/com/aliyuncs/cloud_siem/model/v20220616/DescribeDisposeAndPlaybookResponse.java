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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeDisposeAndPlaybookResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDisposeAndPlaybookResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ResponseDataItem> responseData;

		private PageInfo pageInfo;

		public List<ResponseDataItem> getResponseData() {
			return this.responseData;
		}

		public void setResponseData(List<ResponseDataItem> responseData) {
			this.responseData = responseData;
		}

		public PageInfo getPageInfo() {
			return this.pageInfo;
		}

		public void setPageInfo(PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public static class ResponseDataItem {

			private Long entityId;

			private String entityType;

			private Map<Object,Object> opcodeMap;

			private Map<Object,Object> entityInfo;

			private String dispose;

			private Integer alertNum;

			private List<PlaybookListItem> playbookList;

			private List<String> opcodeSet;

			private List<String> scope;

			public Long getEntityId() {
				return this.entityId;
			}

			public void setEntityId(Long entityId) {
				this.entityId = entityId;
			}

			public String getEntityType() {
				return this.entityType;
			}

			public void setEntityType(String entityType) {
				this.entityType = entityType;
			}

			public Map<Object,Object> getOpcodeMap() {
				return this.opcodeMap;
			}

			public void setOpcodeMap(Map<Object,Object> opcodeMap) {
				this.opcodeMap = opcodeMap;
			}

			public Map<Object,Object> getEntityInfo() {
				return this.entityInfo;
			}

			public void setEntityInfo(Map<Object,Object> entityInfo) {
				this.entityInfo = entityInfo;
			}

			public String getDispose() {
				return this.dispose;
			}

			public void setDispose(String dispose) {
				this.dispose = dispose;
			}

			public Integer getAlertNum() {
				return this.alertNum;
			}

			public void setAlertNum(Integer alertNum) {
				this.alertNum = alertNum;
			}

			public List<PlaybookListItem> getPlaybookList() {
				return this.playbookList;
			}

			public void setPlaybookList(List<PlaybookListItem> playbookList) {
				this.playbookList = playbookList;
			}

			public List<String> getOpcodeSet() {
				return this.opcodeSet;
			}

			public void setOpcodeSet(List<String> opcodeSet) {
				this.opcodeSet = opcodeSet;
			}

			public List<String> getScope() {
				return this.scope;
			}

			public void setScope(List<String> scope) {
				this.scope = scope;
			}

			public static class PlaybookListItem {

				private String opCode;

				private String opLevel;

				private String description;

				private String displayName;

				private String taskConfig;

				private String name;

				private String uuid;

				private Boolean wafPlaybook;

				private String available;

				private List<String> paramConfig;

				public String getOpCode() {
					return this.opCode;
				}

				public void setOpCode(String opCode) {
					this.opCode = opCode;
				}

				public String getOpLevel() {
					return this.opLevel;
				}

				public void setOpLevel(String opLevel) {
					this.opLevel = opLevel;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getTaskConfig() {
					return this.taskConfig;
				}

				public void setTaskConfig(String taskConfig) {
					this.taskConfig = taskConfig;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getUuid() {
					return this.uuid;
				}

				public void setUuid(String uuid) {
					this.uuid = uuid;
				}

				public Boolean getWafPlaybook() {
					return this.wafPlaybook;
				}

				public void setWafPlaybook(Boolean wafPlaybook) {
					this.wafPlaybook = wafPlaybook;
				}

				public String getAvailable() {
					return this.available;
				}

				public void setAvailable(String available) {
					this.available = available;
				}

				public List<String> getParamConfig() {
					return this.paramConfig;
				}

				public void setParamConfig(List<String> paramConfig) {
					this.paramConfig = paramConfig;
				}
			}
		}

		public static class PageInfo {

			private Integer currentPage;

			private Integer pageSize;

			private Long totalCount;

			public Integer getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Integer currentPage) {
				this.currentPage = currentPage;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public DescribeDisposeAndPlaybookResponse getInstance(UnmarshallerContext context) {
		return	DescribeDisposeAndPlaybookResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
