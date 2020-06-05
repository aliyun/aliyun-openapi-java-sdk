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
public class CheckBlockVolumeNameRequest extends RpcAcsRequest<CheckBlockVolumeNameResponse> {
	   

	private String volumeName;

	private String bucketEndpoint;

	private String securityToken;

	private String bucketName;
	public CheckBlockVolumeNameRequest() {
		super("sgw", "2018-05-11", "CheckBlockVolumeName", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVolumeName() {
		return this.volumeName;
	}

	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
		if(volumeName != null){
			putQueryParameter("VolumeName", volumeName);
		}
	}

	public String getBucketEndpoint() {
		return this.bucketEndpoint;
	}

	public void setBucketEndpoint(String bucketEndpoint) {
		this.bucketEndpoint = bucketEndpoint;
		if(bucketEndpoint != null){
			putQueryParameter("BucketEndpoint", bucketEndpoint);
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

	@Override
	public Class<CheckBlockVolumeNameResponse> getResponseClass() {
		return CheckBlockVolumeNameResponse.class;
	}

}
