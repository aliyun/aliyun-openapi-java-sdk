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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.ListPodsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPodsResponse extends AcsResponse {

	private Integer code;

	private String errorMsg;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Long totalCount;

	private List<PodDetail> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<PodDetail> getData() {
		return this.data;
	}

	public void setData(List<PodDetail> data) {
		this.data = data;
	}

	public static class PodDetail {

		private String appInstanceId;

		private Long deployOrderId;

		private Integer deployPartitionNum;

		private String groupName;

		private String hostIp;

		private String hostName;

		private String podIp;

		private String region;

		private Integer result;

		private String resultName;

		private String startTime;

		private Integer status;

		private String statusName;

		private String updateTime;

		private List<DeployStep> deploySteps;

		public String getAppInstanceId() {
			return this.appInstanceId;
		}

		public void setAppInstanceId(String appInstanceId) {
			this.appInstanceId = appInstanceId;
		}

		public Long getDeployOrderId() {
			return this.deployOrderId;
		}

		public void setDeployOrderId(Long deployOrderId) {
			this.deployOrderId = deployOrderId;
		}

		public Integer getDeployPartitionNum() {
			return this.deployPartitionNum;
		}

		public void setDeployPartitionNum(Integer deployPartitionNum) {
			this.deployPartitionNum = deployPartitionNum;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getHostIp() {
			return this.hostIp;
		}

		public void setHostIp(String hostIp) {
			this.hostIp = hostIp;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getPodIp() {
			return this.podIp;
		}

		public void setPodIp(String podIp) {
			this.podIp = podIp;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
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

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<DeployStep> getDeploySteps() {
			return this.deploySteps;
		}

		public void setDeploySteps(List<DeployStep> deploySteps) {
			this.deploySteps = deploySteps;
		}

		public static class DeployStep {

			private String status;

			private String stepCode;

			private String stepName;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getStepCode() {
				return this.stepCode;
			}

			public void setStepCode(String stepCode) {
				this.stepCode = stepCode;
			}

			public String getStepName() {
				return this.stepName;
			}

			public void setStepName(String stepName) {
				this.stepName = stepName;
			}
		}
	}

	@Override
	public ListPodsResponse getInstance(UnmarshallerContext context) {
		return	ListPodsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
