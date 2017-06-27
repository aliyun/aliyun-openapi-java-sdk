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
package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class AddLiveAppRecordConfigRequest extends RpcAcsRequest<AddLiveAppRecordConfigResponse> {
	
	public AddLiveAppRecordConfigRequest() {
		super("live", "2016-11-01", "AddLiveAppRecordConfig", "live");
	}

	private List<RecordFormat> recordFormats;

	private String securityToken;

	private Long ownerId;

	private String domainName;

	private String appName;

	private String ossEndpoint;

	private String ossBucket;

	public List<RecordFormat> getRecordFormats() {
		return this.recordFormats;
	}

	public void setRecordFormats(List<RecordFormat> recordFormats) {
		this.recordFormats = recordFormats;	
		for (int i = 0; i < recordFormats.size(); i++) {
			putQueryParameter("RecordFormat." + (i + 1) + ".Format" , recordFormats.get(i).getFormat());
			putQueryParameter("RecordFormat." + (i + 1) + ".OssObjectPrefix" , recordFormats.get(i).getOssObjectPrefix());
			putQueryParameter("RecordFormat." + (i + 1) + ".SliceOssObjectPrefix" , recordFormats.get(i).getSliceOssObjectPrefix());
			putQueryParameter("RecordFormat." + (i + 1) + ".CycleDuration" , recordFormats.get(i).getCycleDuration());
		}	
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		putQueryParameter("SecurityToken", securityToken);
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		putQueryParameter("DomainName", domainName);
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		putQueryParameter("AppName", appName);
	}

	public String getOssEndpoint() {
		return this.ossEndpoint;
	}

	public void setOssEndpoint(String ossEndpoint) {
		this.ossEndpoint = ossEndpoint;
		putQueryParameter("OssEndpoint", ossEndpoint);
	}

	public String getOssBucket() {
		return this.ossBucket;
	}

	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
		putQueryParameter("OssBucket", ossBucket);
	}

	public static class RecordFormat {

		private String format;

		private String ossObjectPrefix;

		private String sliceOssObjectPrefix;

		private Integer cycleDuration;

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getOssObjectPrefix() {
			return this.ossObjectPrefix;
		}

		public void setOssObjectPrefix(String ossObjectPrefix) {
			this.ossObjectPrefix = ossObjectPrefix;
		}

		public String getSliceOssObjectPrefix() {
			return this.sliceOssObjectPrefix;
		}

		public void setSliceOssObjectPrefix(String sliceOssObjectPrefix) {
			this.sliceOssObjectPrefix = sliceOssObjectPrefix;
		}

		public Integer getCycleDuration() {
			return this.cycleDuration;
		}

		public void setCycleDuration(Integer cycleDuration) {
			this.cycleDuration = cycleDuration;
		}
	}

	@Override
	public Class<AddLiveAppRecordConfigResponse> getResponseClass() {
		return AddLiveAppRecordConfigResponse.class;
	}

}
