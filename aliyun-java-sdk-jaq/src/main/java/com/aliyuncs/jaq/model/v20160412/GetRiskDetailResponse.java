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
package com.aliyuncs.jaq.model.v20160412;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.jaq.transform.v20160412.GetRiskDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRiskDetailResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMsg;

	private Data data;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer taskStatus;

		private String vulnInfo;

		private String malwareInfo;

		private String fakeInfo;

		private String pluginInfo;

		public Integer getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getVulnInfo() {
			return this.vulnInfo;
		}

		public void setVulnInfo(String vulnInfo) {
			this.vulnInfo = vulnInfo;
		}

		public String getMalwareInfo() {
			return this.malwareInfo;
		}

		public void setMalwareInfo(String malwareInfo) {
			this.malwareInfo = malwareInfo;
		}

		public String getFakeInfo() {
			return this.fakeInfo;
		}

		public void setFakeInfo(String fakeInfo) {
			this.fakeInfo = fakeInfo;
		}

		public String getPluginInfo() {
			return this.pluginInfo;
		}

		public void setPluginInfo(String pluginInfo) {
			this.pluginInfo = pluginInfo;
		}
	}

	@Override
	public GetRiskDetailResponse getInstance(UnmarshallerContext context) {
		return	GetRiskDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
