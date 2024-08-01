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

package com.aliyuncs.aicontent.model.v20240611;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aicontent.transform.v20240611.Personalizedtxt2imgAddModelTrainJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class Personalizedtxt2imgAddModelTrainJobResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private Data data;

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

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String id;

		private String modelId;

		private String name;

		private String objectType;

		private String jobStatus;

		private Double jobTrainProgress;

		private Integer inferenceImageCount;

		private String createTime;

		private List<InferenceJobListItem> inferenceJobList;

		private List<String> imageUrl;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getModelId() {
			return this.modelId;
		}

		public void setModelId(String modelId) {
			this.modelId = modelId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getObjectType() {
			return this.objectType;
		}

		public void setObjectType(String objectType) {
			this.objectType = objectType;
		}

		public String getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(String jobStatus) {
			this.jobStatus = jobStatus;
		}

		public Double getJobTrainProgress() {
			return this.jobTrainProgress;
		}

		public void setJobTrainProgress(Double jobTrainProgress) {
			this.jobTrainProgress = jobTrainProgress;
		}

		public Integer getInferenceImageCount() {
			return this.inferenceImageCount;
		}

		public void setInferenceImageCount(Integer inferenceImageCount) {
			this.inferenceImageCount = inferenceImageCount;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<InferenceJobListItem> getInferenceJobList() {
			return this.inferenceJobList;
		}

		public void setInferenceJobList(List<InferenceJobListItem> inferenceJobList) {
			this.inferenceJobList = inferenceJobList;
		}

		public List<String> getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(List<String> imageUrl) {
			this.imageUrl = imageUrl;
		}

		public static class InferenceJobListItem {

			private String id;

			private String promptId;

			private String modelId;

			private String jobStatus;

			private Double jobTrainProgress;

			private String createTime;

			private List<String> resultImageUrl;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getPromptId() {
				return this.promptId;
			}

			public void setPromptId(String promptId) {
				this.promptId = promptId;
			}

			public String getModelId() {
				return this.modelId;
			}

			public void setModelId(String modelId) {
				this.modelId = modelId;
			}

			public String getJobStatus() {
				return this.jobStatus;
			}

			public void setJobStatus(String jobStatus) {
				this.jobStatus = jobStatus;
			}

			public Double getJobTrainProgress() {
				return this.jobTrainProgress;
			}

			public void setJobTrainProgress(Double jobTrainProgress) {
				this.jobTrainProgress = jobTrainProgress;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public List<String> getResultImageUrl() {
				return this.resultImageUrl;
			}

			public void setResultImageUrl(List<String> resultImageUrl) {
				this.resultImageUrl = resultImageUrl;
			}
		}
	}

	@Override
	public Personalizedtxt2imgAddModelTrainJobResponse getInstance(UnmarshallerContext context) {
		return	Personalizedtxt2imgAddModelTrainJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
