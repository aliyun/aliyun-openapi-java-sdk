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
import com.aliyuncs.dataphin_public.transform.v20230630.ListPipelinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPipelinesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long nextCursor;

		private Integer pageNum;

		private Integer pageSize;

		private Integer total;

		private List<Pipeline> list;

		public Long getNextCursor() {
			return this.nextCursor;
		}

		public void setNextCursor(Long nextCursor) {
			this.nextCursor = nextCursor;
		}

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Pipeline> getList() {
			return this.list;
		}

		public void setList(List<Pipeline> list) {
			this.list = list;
		}

		public static class Pipeline {

			private Integer scheduleType;

			private String nodeName;

			private Integer taskType;

			private String nodeId;

			private Long pipelineId;

			private Long fileId;

			private String taskStatus;

			private String directory;

			private List<String> tags;

			private List<String> developOwners;

			private List<String> opsOwners;

			public Integer getScheduleType() {
				return this.scheduleType;
			}

			public void setScheduleType(Integer scheduleType) {
				this.scheduleType = scheduleType;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public Integer getTaskType() {
				return this.taskType;
			}

			public void setTaskType(Integer taskType) {
				this.taskType = taskType;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public Long getPipelineId() {
				return this.pipelineId;
			}

			public void setPipelineId(Long pipelineId) {
				this.pipelineId = pipelineId;
			}

			public Long getFileId() {
				return this.fileId;
			}

			public void setFileId(Long fileId) {
				this.fileId = fileId;
			}

			public String getTaskStatus() {
				return this.taskStatus;
			}

			public void setTaskStatus(String taskStatus) {
				this.taskStatus = taskStatus;
			}

			public String getDirectory() {
				return this.directory;
			}

			public void setDirectory(String directory) {
				this.directory = directory;
			}

			public List<String> getTags() {
				return this.tags;
			}

			public void setTags(List<String> tags) {
				this.tags = tags;
			}

			public List<String> getDevelopOwners() {
				return this.developOwners;
			}

			public void setDevelopOwners(List<String> developOwners) {
				this.developOwners = developOwners;
			}

			public List<String> getOpsOwners() {
				return this.opsOwners;
			}

			public void setOpsOwners(List<String> opsOwners) {
				this.opsOwners = opsOwners;
			}
		}
	}

	@Override
	public ListPipelinesResponse getInstance(UnmarshallerContext context) {
		return	ListPipelinesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
