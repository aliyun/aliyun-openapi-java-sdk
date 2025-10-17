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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AttachApplicationPolarFSRequest extends RpcAcsRequest<AttachApplicationPolarFSResponse> {
	   

	private String applicationId;

	private String polarFSAccessKeyId;

	private String polarFSInstanceId;

	private String polarFSAccessKeySecret;
	public AttachApplicationPolarFSRequest() {
		super("polardb", "2017-08-01", "AttachApplicationPolarFS", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public String getPolarFSAccessKeyId() {
		return this.polarFSAccessKeyId;
	}

	public void setPolarFSAccessKeyId(String polarFSAccessKeyId) {
		this.polarFSAccessKeyId = polarFSAccessKeyId;
		if(polarFSAccessKeyId != null){
			putQueryParameter("PolarFSAccessKeyId", polarFSAccessKeyId);
		}
	}

	public String getPolarFSInstanceId() {
		return this.polarFSInstanceId;
	}

	public void setPolarFSInstanceId(String polarFSInstanceId) {
		this.polarFSInstanceId = polarFSInstanceId;
		if(polarFSInstanceId != null){
			putQueryParameter("PolarFSInstanceId", polarFSInstanceId);
		}
	}

	public String getPolarFSAccessKeySecret() {
		return this.polarFSAccessKeySecret;
	}

	public void setPolarFSAccessKeySecret(String polarFSAccessKeySecret) {
		this.polarFSAccessKeySecret = polarFSAccessKeySecret;
		if(polarFSAccessKeySecret != null){
			putQueryParameter("PolarFSAccessKeySecret", polarFSAccessKeySecret);
		}
	}

	@Override
	public Class<AttachApplicationPolarFSResponse> getResponseClass() {
		return AttachApplicationPolarFSResponse.class;
	}

}
