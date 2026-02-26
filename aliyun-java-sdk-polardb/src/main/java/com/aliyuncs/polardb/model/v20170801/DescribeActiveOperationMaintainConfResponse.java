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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeActiveOperationMaintainConfResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveOperationMaintainConfResponse extends AcsResponse {

	private String requestId;

	private Long hasConfig;

	private Config config;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getHasConfig() {
		return this.hasConfig;
	}

	public void setHasConfig(Long hasConfig) {
		this.hasConfig = hasConfig;
	}

	public Config getConfig() {
		return this.config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public static class Config {

		private Integer cycleType;

		private String cycleTime;

		private String maintainStartTime;

		private String maintainEndTime;

		private Long status;

		private String modifiedTime;

		private String createdTime;

		public Integer getCycleType() {
			return this.cycleType;
		}

		public void setCycleType(Integer cycleType) {
			this.cycleType = cycleType;
		}

		public String getCycleTime() {
			return this.cycleTime;
		}

		public void setCycleTime(String cycleTime) {
			this.cycleTime = cycleTime;
		}

		public String getMaintainStartTime() {
			return this.maintainStartTime;
		}

		public void setMaintainStartTime(String maintainStartTime) {
			this.maintainStartTime = maintainStartTime;
		}

		public String getMaintainEndTime() {
			return this.maintainEndTime;
		}

		public void setMaintainEndTime(String maintainEndTime) {
			this.maintainEndTime = maintainEndTime;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}
	}

	@Override
	public DescribeActiveOperationMaintainConfResponse getInstance(UnmarshallerContext context) {
		return	DescribeActiveOperationMaintainConfResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
