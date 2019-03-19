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
import com.aliyuncs.qualitycheck.transform.v20190115.GetCustomizationConfigListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCustomizationConfigListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<ModelCustomizationDataSetPo> data;

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

	public List<ModelCustomizationDataSetPo> getData() {
		return this.data;
	}

	public void setData(List<ModelCustomizationDataSetPo> data) {
		this.data = data;
	}

	public static class ModelCustomizationDataSetPo {

		private Long modelId;

		private String modeCustomizationId;

		private String modelName;

		private Integer modelStatus;

		private Integer taskType;

		private String createTime;

		public Long getModelId() {
			return this.modelId;
		}

		public void setModelId(Long modelId) {
			this.modelId = modelId;
		}

		public String getModeCustomizationId() {
			return this.modeCustomizationId;
		}

		public void setModeCustomizationId(String modeCustomizationId) {
			this.modeCustomizationId = modeCustomizationId;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public Integer getModelStatus() {
			return this.modelStatus;
		}

		public void setModelStatus(Integer modelStatus) {
			this.modelStatus = modelStatus;
		}

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public GetCustomizationConfigListResponse getInstance(UnmarshallerContext context) {
		return	GetCustomizationConfigListResponseUnmarshaller.unmarshall(this, context);
	}
}
