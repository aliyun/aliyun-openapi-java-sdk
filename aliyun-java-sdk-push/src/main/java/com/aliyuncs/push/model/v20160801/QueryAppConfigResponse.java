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
import com.aliyuncs.push.transform.v20160801.QueryAppConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAppConfigResponse extends AcsResponse {

	private String requestId;

	private AppConfig appConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppConfig getAppConfig() {
		return this.appConfig;
	}

	public void setAppConfig(AppConfig appConfig) {
		this.appConfig = appConfig;
	}

	public static class AppConfig {

		private Long appKey;

		private String appId;

		private String appName;

		private String bundleId;

		private String packageName;

		private Boolean boxFlag;

		private Boolean android;

		private Boolean iOS;

		private String productCertKey;

		private String productCertPass;

		private String devCertKey;

		private String devCertPass;

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

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getBundleId() {
			return this.bundleId;
		}

		public void setBundleId(String bundleId) {
			this.bundleId = bundleId;
		}

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public Boolean getBoxFlag() {
			return this.boxFlag;
		}

		public void setBoxFlag(Boolean boxFlag) {
			this.boxFlag = boxFlag;
		}

		public Boolean getAndroid() {
			return this.android;
		}

		public void setAndroid(Boolean android) {
			this.android = android;
		}

		public Boolean getIOS() {
			return this.iOS;
		}

		public void setIOS(Boolean iOS) {
			this.iOS = iOS;
		}

		public String getProductCertKey() {
			return this.productCertKey;
		}

		public void setProductCertKey(String productCertKey) {
			this.productCertKey = productCertKey;
		}

		public String getProductCertPass() {
			return this.productCertPass;
		}

		public void setProductCertPass(String productCertPass) {
			this.productCertPass = productCertPass;
		}

		public String getDevCertKey() {
			return this.devCertKey;
		}

		public void setDevCertKey(String devCertKey) {
			this.devCertKey = devCertKey;
		}

		public String getDevCertPass() {
			return this.devCertPass;
		}

		public void setDevCertPass(String devCertPass) {
			this.devCertPass = devCertPass;
		}
	}

	@Override
	public QueryAppConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryAppConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
