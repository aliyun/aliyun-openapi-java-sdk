/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.teslamaxcompute.model.v20171130;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.teslamaxcompute.transform.v20171130.GetUserInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserInstanceResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private List<Instance> detail;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<Instance> getDetail() {
			return this.detail;
		}

		public void setDetail(List<Instance> detail) {
			this.detail = detail;
		}

		public static class Instance {

			private String project;

			private String instanceId;

			private String status;

			private String userAccount;

			private String nickName;

			private String cluster;

			private String runTime;

			private Integer cpuUsed;

			private Integer cpuRequest;

			private Integer cpuUsedTotal;

			private Float cpuUsedRatioMax;

			private Float cpuUsedRatioMin;

			private Integer memUsed;

			private Integer memRequest;

			private Integer memUsedTotal;

			private Float memUsedRatioMax;

			private Float memUsedRatioMin;

			private String taskType;

			private String skynetId;

			public String getProject() {
				return this.project;
			}

			public void setProject(String project) {
				this.project = project;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getUserAccount() {
				return this.userAccount;
			}

			public void setUserAccount(String userAccount) {
				this.userAccount = userAccount;
			}

			public String getNickName() {
				return this.nickName;
			}

			public void setNickName(String nickName) {
				this.nickName = nickName;
			}

			public String getCluster() {
				return this.cluster;
			}

			public void setCluster(String cluster) {
				this.cluster = cluster;
			}

			public String getRunTime() {
				return this.runTime;
			}

			public void setRunTime(String runTime) {
				this.runTime = runTime;
			}

			public Integer getCpuUsed() {
				return this.cpuUsed;
			}

			public void setCpuUsed(Integer cpuUsed) {
				this.cpuUsed = cpuUsed;
			}

			public Integer getCpuRequest() {
				return this.cpuRequest;
			}

			public void setCpuRequest(Integer cpuRequest) {
				this.cpuRequest = cpuRequest;
			}

			public Integer getCpuUsedTotal() {
				return this.cpuUsedTotal;
			}

			public void setCpuUsedTotal(Integer cpuUsedTotal) {
				this.cpuUsedTotal = cpuUsedTotal;
			}

			public Float getCpuUsedRatioMax() {
				return this.cpuUsedRatioMax;
			}

			public void setCpuUsedRatioMax(Float cpuUsedRatioMax) {
				this.cpuUsedRatioMax = cpuUsedRatioMax;
			}

			public Float getCpuUsedRatioMin() {
				return this.cpuUsedRatioMin;
			}

			public void setCpuUsedRatioMin(Float cpuUsedRatioMin) {
				this.cpuUsedRatioMin = cpuUsedRatioMin;
			}

			public Integer getMemUsed() {
				return this.memUsed;
			}

			public void setMemUsed(Integer memUsed) {
				this.memUsed = memUsed;
			}

			public Integer getMemRequest() {
				return this.memRequest;
			}

			public void setMemRequest(Integer memRequest) {
				this.memRequest = memRequest;
			}

			public Integer getMemUsedTotal() {
				return this.memUsedTotal;
			}

			public void setMemUsedTotal(Integer memUsedTotal) {
				this.memUsedTotal = memUsedTotal;
			}

			public Float getMemUsedRatioMax() {
				return this.memUsedRatioMax;
			}

			public void setMemUsedRatioMax(Float memUsedRatioMax) {
				this.memUsedRatioMax = memUsedRatioMax;
			}

			public Float getMemUsedRatioMin() {
				return this.memUsedRatioMin;
			}

			public void setMemUsedRatioMin(Float memUsedRatioMin) {
				this.memUsedRatioMin = memUsedRatioMin;
			}

			public String getTaskType() {
				return this.taskType;
			}

			public void setTaskType(String taskType) {
				this.taskType = taskType;
			}

			public String getSkynetId() {
				return this.skynetId;
			}

			public void setSkynetId(String skynetId) {
				this.skynetId = skynetId;
			}
		}
	}

	@Override
	public GetUserInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetUserInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
