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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SyncHDMAliyunResourceRequest extends RpcAcsRequest<SyncHDMAliyunResourceResponse> {
	   

	private String skipAuth;

	private String __context;

	private String signature;

	private String resourceTypes;

	private String userId;

	private String waitForModifySecurityIps;

	private String uid;

	private String async;

	private String accessKey;

	private String timestamp;
	public SyncHDMAliyunResourceRequest() {
		super("DAS", "2020-01-16", "SyncHDMAliyunResource", "das");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSkipAuth() {
		return this.skipAuth;
	}

	public void setSkipAuth(String skipAuth) {
		this.skipAuth = skipAuth;
		if(skipAuth != null){
			putQueryParameter("skipAuth", skipAuth);
		}
	}

	public String get__Context() {
		return this.__context;
	}

	public void set__Context(String __context) {
		this.__context = __context;
		if(__context != null){
			putQueryParameter("__context", __context);
		}
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
		if(signature != null){
			putQueryParameter("signature", signature);
		}
	}

	public String getResourceTypes() {
		return this.resourceTypes;
	}

	public void setResourceTypes(String resourceTypes) {
		this.resourceTypes = resourceTypes;
		if(resourceTypes != null){
			putQueryParameter("ResourceTypes", resourceTypes);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getWaitForModifySecurityIps() {
		return this.waitForModifySecurityIps;
	}

	public void setWaitForModifySecurityIps(String waitForModifySecurityIps) {
		this.waitForModifySecurityIps = waitForModifySecurityIps;
		if(waitForModifySecurityIps != null){
			putQueryParameter("WaitForModifySecurityIps", waitForModifySecurityIps);
		}
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	public String getAsync() {
		return this.async;
	}

	public void setAsync(String async) {
		this.async = async;
		if(async != null){
			putQueryParameter("Async", async);
		}
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
		if(accessKey != null){
			putQueryParameter("accessKey", accessKey);
		}
	}

	public String getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
		if(timestamp != null){
			putQueryParameter("timestamp", timestamp);
		}
	}

	@Override
	public Class<SyncHDMAliyunResourceResponse> getResponseClass() {
		return SyncHDMAliyunResourceResponse.class;
	}

}
