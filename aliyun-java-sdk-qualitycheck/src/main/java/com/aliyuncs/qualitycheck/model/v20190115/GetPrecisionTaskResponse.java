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
import com.aliyuncs.qualitycheck.transform.v20190115.GetPrecisionTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPrecisionTaskResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer status;

		private String updateTime;

		private Integer incorrectWords;

		private Long dataSetId;

		private Integer verifiedCount;

		private Integer duration;

		private String dataSetName;

		private Integer totalCount;

		private Integer source;

		private String name;

		private String taskId;

		private List<Precision> precisions;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getIncorrectWords() {
			return this.incorrectWords;
		}

		public void setIncorrectWords(Integer incorrectWords) {
			this.incorrectWords = incorrectWords;
		}

		public Long getDataSetId() {
			return this.dataSetId;
		}

		public void setDataSetId(Long dataSetId) {
			this.dataSetId = dataSetId;
		}

		public Integer getVerifiedCount() {
			return this.verifiedCount;
		}

		public void setVerifiedCount(Integer verifiedCount) {
			this.verifiedCount = verifiedCount;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getDataSetName() {
			return this.dataSetName;
		}

		public void setDataSetName(String dataSetName) {
			this.dataSetName = dataSetName;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getSource() {
			return this.source;
		}

		public void setSource(Integer source) {
			this.source = source;
		}

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

		public List<Precision> getPrecisions() {
			return this.precisions;
		}

		public void setPrecisions(List<Precision> precisions) {
			this.precisions = precisions;
		}

		public static class Precision {

			private Integer status;

			private String modelName;

			private String taskId;

			private Float precision;

			private Long modelId;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getModelName() {
				return this.modelName;
			}

			public void setModelName(String modelName) {
				this.modelName = modelName;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public Float getPrecision() {
				return this.precision;
			}

			public void setPrecision(Float precision) {
				this.precision = precision;
			}

			public Long getModelId() {
				return this.modelId;
			}

			public void setModelId(Long modelId) {
				this.modelId = modelId;
			}
		}
	}

	@Override
	public GetPrecisionTaskResponse getInstance(UnmarshallerContext context) {
		return	GetPrecisionTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
