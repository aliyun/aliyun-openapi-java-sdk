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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.DescribeDeployOrderDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeployOrderDetailResponse extends AcsResponse {

	private Integer code;

	private String errMsg;

	private String requestId;

	private Boolean success;

	private Result result;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String appInstanceType;

		private Integer currentPartitionNum;

		private Long deployOrderId;

		private String deployPauseType;

		private String deployPauseTypeName;

		private String deployType;

		private String deployTypeName;

		private String description;

		private Integer elapsedTime;

		private String endTime;

		private Long envId;

		private String envType;

		private String failureRate;

		private Integer finishAppInstanceCt;

		private String name;

		private String partitionType;

		private String partitionTypeName;

		private Integer result;

		private String resultName;

		private Long schemaId;

		private String startTime;

		private Integer status;

		private String statusName;

		private Integer totalAppInstanceCt;

		private Integer totalPartitions;

		private String userId;

		private String userNick;

		public String getAppInstanceType() {
			return this.appInstanceType;
		}

		public void setAppInstanceType(String appInstanceType) {
			this.appInstanceType = appInstanceType;
		}

		public Integer getCurrentPartitionNum() {
			return this.currentPartitionNum;
		}

		public void setCurrentPartitionNum(Integer currentPartitionNum) {
			this.currentPartitionNum = currentPartitionNum;
		}

		public Long getDeployOrderId() {
			return this.deployOrderId;
		}

		public void setDeployOrderId(Long deployOrderId) {
			this.deployOrderId = deployOrderId;
		}

		public String getDeployPauseType() {
			return this.deployPauseType;
		}

		public void setDeployPauseType(String deployPauseType) {
			this.deployPauseType = deployPauseType;
		}

		public String getDeployPauseTypeName() {
			return this.deployPauseTypeName;
		}

		public void setDeployPauseTypeName(String deployPauseTypeName) {
			this.deployPauseTypeName = deployPauseTypeName;
		}

		public String getDeployType() {
			return this.deployType;
		}

		public void setDeployType(String deployType) {
			this.deployType = deployType;
		}

		public String getDeployTypeName() {
			return this.deployTypeName;
		}

		public void setDeployTypeName(String deployTypeName) {
			this.deployTypeName = deployTypeName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getElapsedTime() {
			return this.elapsedTime;
		}

		public void setElapsedTime(Integer elapsedTime) {
			this.elapsedTime = elapsedTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Long getEnvId() {
			return this.envId;
		}

		public void setEnvId(Long envId) {
			this.envId = envId;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public String getFailureRate() {
			return this.failureRate;
		}

		public void setFailureRate(String failureRate) {
			this.failureRate = failureRate;
		}

		public Integer getFinishAppInstanceCt() {
			return this.finishAppInstanceCt;
		}

		public void setFinishAppInstanceCt(Integer finishAppInstanceCt) {
			this.finishAppInstanceCt = finishAppInstanceCt;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPartitionType() {
			return this.partitionType;
		}

		public void setPartitionType(String partitionType) {
			this.partitionType = partitionType;
		}

		public String getPartitionTypeName() {
			return this.partitionTypeName;
		}

		public void setPartitionTypeName(String partitionTypeName) {
			this.partitionTypeName = partitionTypeName;
		}

		public Integer getResult() {
			return this.result;
		}

		public void setResult(Integer result) {
			this.result = result;
		}

		public String getResultName() {
			return this.resultName;
		}

		public void setResultName(String resultName) {
			this.resultName = resultName;
		}

		public Long getSchemaId() {
			return this.schemaId;
		}

		public void setSchemaId(Long schemaId) {
			this.schemaId = schemaId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getStatusName() {
			return this.statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public Integer getTotalAppInstanceCt() {
			return this.totalAppInstanceCt;
		}

		public void setTotalAppInstanceCt(Integer totalAppInstanceCt) {
			this.totalAppInstanceCt = totalAppInstanceCt;
		}

		public Integer getTotalPartitions() {
			return this.totalPartitions;
		}

		public void setTotalPartitions(Integer totalPartitions) {
			this.totalPartitions = totalPartitions;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserNick() {
			return this.userNick;
		}

		public void setUserNick(String userNick) {
			this.userNick = userNick;
		}
	}

	@Override
	public DescribeDeployOrderDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeployOrderDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
