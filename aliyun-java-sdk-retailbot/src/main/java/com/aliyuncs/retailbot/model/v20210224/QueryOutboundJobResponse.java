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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailbot.transform.v20210224.QueryOutboundJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOutboundJobResponse extends AcsResponse {

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private Long tenantId;

		private String saasId;

		private Long shopId;

		private String appCode;

		private String appId;

		private String version;

		private String jobName;

		private String startTime;

		private String endTime;

		private Integer crowdType;

		private String crowdConfig;

		private Integer runType;

		private String runConfig;

		private Integer status;

		private String config;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getSaasId() {
			return this.saasId;
		}

		public void setSaasId(String saasId) {
			this.saasId = saasId;
		}

		public Long getShopId() {
			return this.shopId;
		}

		public void setShopId(Long shopId) {
			this.shopId = shopId;
		}

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Integer getCrowdType() {
			return this.crowdType;
		}

		public void setCrowdType(Integer crowdType) {
			this.crowdType = crowdType;
		}

		public String getCrowdConfig() {
			return this.crowdConfig;
		}

		public void setCrowdConfig(String crowdConfig) {
			this.crowdConfig = crowdConfig;
		}

		public Integer getRunType() {
			return this.runType;
		}

		public void setRunType(Integer runType) {
			this.runType = runType;
		}

		public String getRunConfig() {
			return this.runConfig;
		}

		public void setRunConfig(String runConfig) {
			this.runConfig = runConfig;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}
	}

	@Override
	public QueryOutboundJobResponse getInstance(UnmarshallerContext context) {
		return	QueryOutboundJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
