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
package com.aliyuncs.push.model.v20160801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20160801.QueryAppInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAppInfoResponse extends AcsResponse {

	private String requestId;

	private AppInfo appInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppInfo getAppInfo() {
		return this.appInfo;
	}

	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public static class AppInfo {

		private Long appKey;

		private String appId;

		private String pushAppId;

		private String appName;

		private String description;

		private Integer industryId;

		private Integer androidStatus;

		private Integer iOSStatus;

		private Long deviceCount;

		private Integer appStatus;

		private Integer status;

		private Extension extension;

		public Long getAppKey() {
			return this.appKey;
		}

		public void setAppKey(Long appKey) {
			this.appKey = appKey;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getPushAppId() {
			return this.pushAppId;
		}

		public void setPushAppId(String pushAppId) {
			this.pushAppId = pushAppId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getIndustryId() {
			return this.industryId;
		}

		public void setIndustryId(Integer industryId) {
			this.industryId = industryId;
		}

		public Integer getAndroidStatus() {
			return this.androidStatus;
		}

		public void setAndroidStatus(Integer androidStatus) {
			this.androidStatus = androidStatus;
		}

		public Integer getIOSStatus() {
			return this.iOSStatus;
		}

		public void setIOSStatus(Integer iOSStatus) {
			this.iOSStatus = iOSStatus;
		}

		public Long getDeviceCount() {
			return this.deviceCount;
		}

		public void setDeviceCount(Long deviceCount) {
			this.deviceCount = deviceCount;
		}

		public Integer getAppStatus() {
			return this.appStatus;
		}

		public void setAppStatus(Integer appStatus) {
			this.appStatus = appStatus;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Extension getExtension() {
			return this.extension;
		}

		public void setExtension(Extension extension) {
			this.extension = extension;
		}

		public static class Extension {

			private String xmAppSecretKey;

			private String hwAppKey;

			private String hwAppSecretKey;

			public String getXmAppSecretKey() {
				return this.xmAppSecretKey;
			}

			public void setXmAppSecretKey(String xmAppSecretKey) {
				this.xmAppSecretKey = xmAppSecretKey;
			}

			public String getHwAppKey() {
				return this.hwAppKey;
			}

			public void setHwAppKey(String hwAppKey) {
				this.hwAppKey = hwAppKey;
			}

			public String getHwAppSecretKey() {
				return this.hwAppSecretKey;
			}

			public void setHwAppSecretKey(String hwAppSecretKey) {
				this.hwAppSecretKey = hwAppSecretKey;
			}
		}
	}

	@Override
	public QueryAppInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryAppInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
