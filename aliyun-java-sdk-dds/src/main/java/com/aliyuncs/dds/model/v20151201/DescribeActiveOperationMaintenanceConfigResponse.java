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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeActiveOperationMaintenanceConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveOperationMaintenanceConfigResponse extends AcsResponse {

	private Integer hasConfig;

	private String requestId;

	private Config config;

	public Integer getHasConfig() {
		return this.hasConfig;
	}

	public void setHasConfig(Integer hasConfig) {
		this.hasConfig = hasConfig;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Config getConfig() {
		return this.config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public static class Config {

		private String cycleType;

		private Integer status;

		private String modifiedTime;

		private String maintainStartTime;

		private String maintainEndTime;

		private String cycleTime;

		private String createdTime;

		public String getCycleType() {
			return this.cycleType;
		}

		public void setCycleType(String cycleType) {
			this.cycleType = cycleType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
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

		public String getCycleTime() {
			return this.cycleTime;
		}

		public void setCycleTime(String cycleTime) {
			this.cycleTime = cycleTime;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}
	}

	@Override
	public DescribeActiveOperationMaintenanceConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeActiveOperationMaintenanceConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
