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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveAppRecordConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveAppRecordConfigResponse extends AcsResponse {

	private String requestId;

	private LiveAppRecord liveAppRecord;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public LiveAppRecord getLiveAppRecord() {
		return this.liveAppRecord;
	}

	public void setLiveAppRecord(LiveAppRecord liveAppRecord) {
		this.liveAppRecord = liveAppRecord;
	}

	public static class LiveAppRecord {

		private String domainName;

		private String appName;

		private String ossEndpoint;

		private String ossBucket;

		private String ossObjectPrefix;

		private String createTime;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public String getOssObjectPrefix() {
			return this.ossObjectPrefix;
		}

		public void setOssObjectPrefix(String ossObjectPrefix) {
			this.ossObjectPrefix = ossObjectPrefix;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeLiveAppRecordConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveAppRecordConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
