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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListBatchTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBatchTasksResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private PageResult pageResult;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Integer pageSize;

		private Integer page;

		private Integer count;

		private List<BatchTask> resultData;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public List<BatchTask> getResultData() {
			return this.resultData;
		}

		public void setResultData(List<BatchTask> resultData) {
			this.resultData = resultData;
		}

		public static class BatchTask {

			private String status;

			private String ownerName;

			private Boolean released;

			private String description;

			private String nodeName;

			private Integer lastVersion;

			private Integer operatorType;

			private String name;

			private String lastSubmitStatus;

			private String ownerUserId;

			private Integer nodeType;

			private String nodeId;

			private Boolean published;

			private Long fileId;

			private String directory;

			private List<String> nodeOutputNameList;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public Boolean getReleased() {
				return this.released;
			}

			public void setReleased(Boolean released) {
				this.released = released;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public Integer getLastVersion() {
				return this.lastVersion;
			}

			public void setLastVersion(Integer lastVersion) {
				this.lastVersion = lastVersion;
			}

			public Integer getOperatorType() {
				return this.operatorType;
			}

			public void setOperatorType(Integer operatorType) {
				this.operatorType = operatorType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getLastSubmitStatus() {
				return this.lastSubmitStatus;
			}

			public void setLastSubmitStatus(String lastSubmitStatus) {
				this.lastSubmitStatus = lastSubmitStatus;
			}

			public String getOwnerUserId() {
				return this.ownerUserId;
			}

			public void setOwnerUserId(String ownerUserId) {
				this.ownerUserId = ownerUserId;
			}

			public Integer getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(Integer nodeType) {
				this.nodeType = nodeType;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public Boolean getPublished() {
				return this.published;
			}

			public void setPublished(Boolean published) {
				this.published = published;
			}

			public Long getFileId() {
				return this.fileId;
			}

			public void setFileId(Long fileId) {
				this.fileId = fileId;
			}

			public String getDirectory() {
				return this.directory;
			}

			public void setDirectory(String directory) {
				this.directory = directory;
			}

			public List<String> getNodeOutputNameList() {
				return this.nodeOutputNameList;
			}

			public void setNodeOutputNameList(List<String> nodeOutputNameList) {
				this.nodeOutputNameList = nodeOutputNameList;
			}
		}
	}

	@Override
	public ListBatchTasksResponse getInstance(UnmarshallerContext context) {
		return	ListBatchTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
