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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.DescribeChangeOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeChangeOrderResponse extends AcsResponse {

	private String code;

	private String errorCode;

	private String message;

	private Boolean success;

	private String traceId;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
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

		private String appName;

		private Boolean auto;

		private Integer batchCount;

		private String batchType;

		private Integer batchWaitTime;

		private String changeOrderId;

		private String coType;

		private String coTypeCode;

		private String createTime;

		private String currentPipelineId;

		private String description;

		private Integer status;

		private Boolean supportAbortFreeze;

		private Boolean supportRollback;

		private String errorMessage;

		private List<Pipeline> pipelines;

		private List<String> coTargets;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Boolean getAuto() {
			return this.auto;
		}

		public void setAuto(Boolean auto) {
			this.auto = auto;
		}

		public Integer getBatchCount() {
			return this.batchCount;
		}

		public void setBatchCount(Integer batchCount) {
			this.batchCount = batchCount;
		}

		public String getBatchType() {
			return this.batchType;
		}

		public void setBatchType(String batchType) {
			this.batchType = batchType;
		}

		public Integer getBatchWaitTime() {
			return this.batchWaitTime;
		}

		public void setBatchWaitTime(Integer batchWaitTime) {
			this.batchWaitTime = batchWaitTime;
		}

		public String getChangeOrderId() {
			return this.changeOrderId;
		}

		public void setChangeOrderId(String changeOrderId) {
			this.changeOrderId = changeOrderId;
		}

		public String getCoType() {
			return this.coType;
		}

		public void setCoType(String coType) {
			this.coType = coType;
		}

		public String getCoTypeCode() {
			return this.coTypeCode;
		}

		public void setCoTypeCode(String coTypeCode) {
			this.coTypeCode = coTypeCode;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCurrentPipelineId() {
			return this.currentPipelineId;
		}

		public void setCurrentPipelineId(String currentPipelineId) {
			this.currentPipelineId = currentPipelineId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Boolean getSupportAbortFreeze() {
			return this.supportAbortFreeze;
		}

		public void setSupportAbortFreeze(Boolean supportAbortFreeze) {
			this.supportAbortFreeze = supportAbortFreeze;
		}

		public Boolean getSupportRollback() {
			return this.supportRollback;
		}

		public void setSupportRollback(Boolean supportRollback) {
			this.supportRollback = supportRollback;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public List<Pipeline> getPipelines() {
			return this.pipelines;
		}

		public void setPipelines(List<Pipeline> pipelines) {
			this.pipelines = pipelines;
		}

		public List<String> getCoTargets() {
			return this.coTargets;
		}

		public void setCoTargets(List<String> coTargets) {
			this.coTargets = coTargets;
		}

		public static class Pipeline {

			private Integer batchType;

			private Integer parallelCount;

			private String pipelineId;

			private String pipelineName;

			private Long startTime;

			private Integer status;

			private Long updateTime;

			public Integer getBatchType() {
				return this.batchType;
			}

			public void setBatchType(Integer batchType) {
				this.batchType = batchType;
			}

			public Integer getParallelCount() {
				return this.parallelCount;
			}

			public void setParallelCount(Integer parallelCount) {
				this.parallelCount = parallelCount;
			}

			public String getPipelineId() {
				return this.pipelineId;
			}

			public void setPipelineId(String pipelineId) {
				this.pipelineId = pipelineId;
			}

			public String getPipelineName() {
				return this.pipelineName;
			}

			public void setPipelineName(String pipelineName) {
				this.pipelineName = pipelineName;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Long getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Long updateTime) {
				this.updateTime = updateTime;
			}
		}
	}

	@Override
	public DescribeChangeOrderResponse getInstance(UnmarshallerContext context) {
		return	DescribeChangeOrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
