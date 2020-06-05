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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sgw.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ValidateExpressSyncConfigRequest extends RpcAcsRequest<ValidateExpressSyncConfigResponse> {
	   

	private String bucketRegion;

	private String securityToken;

	private String bucketName;

	private String name;

	private String bucketPrefix;
	public ValidateExpressSyncConfigRequest() {
		super("sgw", "2018-05-11", "ValidateExpressSyncConfig", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBucketRegion() {
		return this.bucketRegion;
	}

	public void setBucketRegion(String bucketRegion) {
		this.bucketRegion = bucketRegion;
		if(bucketRegion != null){
			putQueryParameter("BucketRegion", bucketRegion);
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

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
		if(bucketName != null){
			putQueryParameter("BucketName", bucketName);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getBucketPrefix() {
		return this.bucketPrefix;
	}

	public void setBucketPrefix(String bucketPrefix) {
		this.bucketPrefix = bucketPrefix;
		if(bucketPrefix != null){
			putQueryParameter("BucketPrefix", bucketPrefix);
		}
	}

	@Override
	public Class<ValidateExpressSyncConfigResponse> getResponseClass() {
		return ValidateExpressSyncConfigResponse.class;
	}

}
