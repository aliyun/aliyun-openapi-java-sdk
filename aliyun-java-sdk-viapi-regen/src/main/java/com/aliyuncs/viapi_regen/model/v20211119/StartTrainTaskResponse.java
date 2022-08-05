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

package com.aliyuncs.viapi_regen.model.v20211119;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.viapi_regen.transform.v20211119.StartTrainTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartTrainTaskResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private Long gmtCreate;

		private String taskName;

		private String description;

		private Long datasetId;

		private String datasetName;

		private Long labelId;

		private String labelName;

		private String trainMode;

		private String trainStatus;

		private Long modelId;

		private String modelEffect;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getDatasetId() {
			return this.datasetId;
		}

		public void setDatasetId(Long datasetId) {
			this.datasetId = datasetId;
		}

		public String getDatasetName() {
			return this.datasetName;
		}

		public void setDatasetName(String datasetName) {
			this.datasetName = datasetName;
		}

		public Long getLabelId() {
			return this.labelId;
		}

		public void setLabelId(Long labelId) {
			this.labelId = labelId;
		}

		public String getLabelName() {
			return this.labelName;
		}

		public void setLabelName(String labelName) {
			this.labelName = labelName;
		}

		public String getTrainMode() {
			return this.trainMode;
		}

		public void setTrainMode(String trainMode) {
			this.trainMode = trainMode;
		}

		public String getTrainStatus() {
			return this.trainStatus;
		}

		public void setTrainStatus(String trainStatus) {
			this.trainStatus = trainStatus;
		}

		public Long getModelId() {
			return this.modelId;
		}

		public void setModelId(Long modelId) {
			this.modelId = modelId;
		}

		public String getModelEffect() {
			return this.modelEffect;
		}

		public void setModelEffect(String modelEffect) {
			this.modelEffect = modelEffect;
		}
	}

	@Override
	public StartTrainTaskResponse getInstance(UnmarshallerContext context) {
		return	StartTrainTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
