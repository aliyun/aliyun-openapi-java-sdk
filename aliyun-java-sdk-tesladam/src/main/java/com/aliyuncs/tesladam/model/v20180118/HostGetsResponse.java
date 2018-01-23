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
package com.aliyuncs.tesladam.model.v20180118;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.tesladam.transform.v20180118.HostGetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class HostGetsResponse extends AcsResponse {

	private Boolean status;

	private String message;

	private List<DataItem> data;

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String hostname;

		private String ip;

		private String appCode;

		private String clusterCode;

		private Integer sshStatus;

		private Integer heartStatus;

		private Integer healthScoreLast;

		private String healthReasonLast;

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
		}

		public String getClusterCode() {
			return this.clusterCode;
		}

		public void setClusterCode(String clusterCode) {
			this.clusterCode = clusterCode;
		}

		public Integer getSshStatus() {
			return this.sshStatus;
		}

		public void setSshStatus(Integer sshStatus) {
			this.sshStatus = sshStatus;
		}

		public Integer getHeartStatus() {
			return this.heartStatus;
		}

		public void setHeartStatus(Integer heartStatus) {
			this.heartStatus = heartStatus;
		}

		public Integer getHealthScoreLast() {
			return this.healthScoreLast;
		}

		public void setHealthScoreLast(Integer healthScoreLast) {
			this.healthScoreLast = healthScoreLast;
		}

		public String getHealthReasonLast() {
			return this.healthReasonLast;
		}

		public void setHealthReasonLast(String healthReasonLast) {
			this.healthReasonLast = healthReasonLast;
		}
	}

	@Override
	public HostGetsResponse getInstance(UnmarshallerContext context) {
		return	HostGetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
