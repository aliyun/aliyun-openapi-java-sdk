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
		super("live", "2016-11-01", "AddLiveAppRecordConfig");
	}

	private String ossBucket;

	private String appName;

	private String securityToken;

	private List<RecordFormat> recordFormats;

	private String domainName;

	private String ossEndpoint;

	private Long ownerId;

	public String getOssBucket() {
		return this.ossBucket;
	}

	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
		if(ossBucket != null){
			putQueryParameter("OssBucket", ossBucket);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public List<RecordFormat> getRecordFormats() {
		return this.recordFormats;
	}

	public void setRecordFormats(List<RecordFormat> recordFormats) {
		this.recordFormats = recordFormats;	
		if (recordFormats != null) {
			for (int depth1 = 0; depth1 < recordFormats.size(); depth1++) {
				putQueryParameter("RecordFormat." + (depth1 + 1) + ".Format" , recordFormats.get(depth1).getFormat());
				putQueryParameter("RecordFormat." + (depth1 + 1) + ".OssObjectPrefix" , recordFormats.get(depth1).getOssObjectPrefix());
				putQueryParameter("RecordFormat." + (depth1 + 1) + ".SliceOssObjectPrefix" , recordFormats.get(depth1).getSliceOssObjectPrefix());
				putQueryParameter("RecordFormat." + (depth1 + 1) + ".CycleDuration" , recordFormats.get(depth1).getCycleDuration());
			}
		}	
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getOssEndpoint() {
		return this.ossEndpoint;
	}

	public void setOssEndpoint(String ossEndpoint) {
		this.ossEndpoint = ossEndpoint;
		if(ossEndpoint != null){
			putQueryParameter("OssEndpoint", ossEndpoint);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
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
