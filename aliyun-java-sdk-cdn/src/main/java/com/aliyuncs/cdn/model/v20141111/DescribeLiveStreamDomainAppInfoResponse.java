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
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamDomainAppInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamDomainAppInfoResponse extends AcsResponse {

	private String requestId;

	private List<DomainAppInfo> domainAppList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainAppInfo> getDomainAppList() {
		return this.domainAppList;
	}

	public void setDomainAppList(List<DomainAppInfo> domainAppList) {
		this.domainAppList = domainAppList;
	}

	public static class DomainAppInfo {

		private String appDomain;

		private String appId;

		private String appKey;

		private String appOssBucket;

		private String appOssHost;

		private String appOwnerId;

		private String appSecret;

		private String updateTime;

		public String getAppDomain() {
			return this.appDomain;
		}

		public void setAppDomain(String appDomain) {
			this.appDomain = appDomain;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}

		public String getAppOssBucket() {
			return this.appOssBucket;
		}

		public void setAppOssBucket(String appOssBucket) {
			this.appOssBucket = appOssBucket;
		}

		public String getAppOssHost() {
			return this.appOssHost;
		}

		public void setAppOssHost(String appOssHost) {
			this.appOssHost = appOssHost;
		}

		public String getAppOwnerId() {
			return this.appOwnerId;
		}

		public void setAppOwnerId(String appOwnerId) {
			this.appOwnerId = appOwnerId;
		}

		public String getAppSecret() {
			return this.appSecret;
		}

		public void setAppSecret(String appSecret) {
			this.appSecret = appSecret;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public DescribeLiveStreamDomainAppInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamDomainAppInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
