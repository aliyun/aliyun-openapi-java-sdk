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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ListPrecisionTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrecisionTaskResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer count;

	private List<PrecisionTask> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<PrecisionTask> getData() {
		return this.data;
	}

	public void setData(List<PrecisionTask> data) {
		this.data = data;
	}

	public static class PrecisionTask {

		private String name;

		private String taskId;

		private Integer source;

		private Long dataSetId;

		private String dataSetName;

		private Integer duration;

		private Integer status;

		private Integer totalCount;

		private Integer verifiedCount;

		private Integer incorrectWords;

		private String createTime;

		private String updateTime;

		private List<Precision> precisions;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Integer getSource() {
			return this.source;
		}

		public void setSource(Integer source) {
			this.source = source;
		}

		public Long getDataSetId() {
			return this.dataSetId;
		}

		public void setDataSetId(Long dataSetId) {
			this.dataSetId = dataSetId;
		}

		public String getDataSetName() {
			return this.dataSetName;
		}

		public void setDataSetName(String dataSetName) {
			this.dataSetName = dataSetName;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getVerifiedCount() {
			return this.verifiedCount;
		}

		public void setVerifiedCount(Integer verifiedCount) {
			this.verifiedCount = verifiedCount;
		}

		public Integer getIncorrectWords() {
			return this.incorrectWords;
		}

		public void setIncorrectWords(Integer incorrectWords) {
			this.incorrectWords = incorrectWords;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<Precision> getPrecisions() {
			return this.precisions;
		}

		public void setPrecisions(List<Precision> precisions) {
			this.precisions = precisions;
		}

		public static class Precision {

			private String modelName;

			private Long modelId;

			private Float precision;

			private Integer status;

			private String taskId;

			public String getModelName() {
				return this.modelName;
			}

			public void setModelName(String modelName) {
				this.modelName = modelName;
			}

			public Long getModelId() {
				return this.modelId;
			}

			public void setModelId(Long modelId) {
				this.modelId = modelId;
			}

			public Float getPrecision() {
				return this.precision;
			}

			public void setPrecision(Float precision) {
				this.precision = precision;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}
		}
	}

	@Override
	public ListPrecisionTaskResponse getInstance(UnmarshallerContext context) {
		return	ListPrecisionTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
